package uttarakhand;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class haridwar extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
haridwar()
{
try
{
UIManager.LookAndFeelInfo looks[];
looks = UIManager.getInstalledLookAndFeels();
UIManager.setLookAndFeel(looks[1].getClassName() );
SwingUtilities.updateComponentTreeUI( this );
}
catch(Exception e)
{
System.out.println("Caughted exception is "+e);
}
setLayout(null);
f=new Font("",Font.BOLD,14);
l1=new JLabel("<HTML>Haridwar<BR><BR>Fast Facts <BR>Area 12.3 sq km <BR>Altitude 294.70 m <BR>Temperature Summer: 41.0 - 16.9 C Winter: 3 - 10.6 C Rainfall 64 inches <BR>Best Season Throughout the year <BR>STD Code 01334 <BR>Tourism Centre Regional Tourist Office, Haridwar, Tel: 01334 227370; PRO, GMVN, Laltarao Bridge, Haridwar, Tel: 01334 228686 Fax: 228686<BR>Haridwar, situated on the right bank of the holy Ganga, is regarded among the seven sacred cities of India. Legend has it that this was one of the four sites across India where a drop of Amrit, carried by Garuda, the celestial fell.<BR> It is therefore one of the four venues where the Kumbh Mela – said to the largest congregation of humanity anywhere in the world – is held once every 12 years. Haridwar is also the place where the river Ganga enters the Indo-Gangetic plains for the first time. <BR>Haridwar is also home to several ashrams which specialize in teaching meditation and yoga.</HTML>");
img=new ImageIcon(getClass().getResource("/images/haridwar1.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+50,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
uttarakhand uk=new uttarakhand();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
uk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
uk.setVisible(true);
uk.setTitle("Famous Places of Uttarakhand");
uk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
haridwar hdwr=new haridwar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hdwr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hdwr.setVisible(true);
hdwr.setTitle("Haridwar");
hdwr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
