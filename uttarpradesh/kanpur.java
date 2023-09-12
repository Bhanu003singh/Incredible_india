package uttarpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class kanpur extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
kanpur()
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
f=new Font("",Font.BOLD,13);
l1=new JLabel("<HTML>Kanpur<BR><BR>Fast Fact <BR>Temperature : Summer: 43- 30C Winter: 25- 3C <BR>Best Season : November to February <BR>Clothing : Summer- Cotton, Winter - Woolens <BR>Languages spoken : Hindi, Urdu and English <BR>STD Code: 0512 <BR>Tourist Office: Gandhi Bahawan 16/99 K.E.M Hall Phool Bagh Kanpur-208001 <BR><BR>Nestled on the banks of the eternal Ganga, Kanpur stands as one of North India’s major industrial centres with its own historical, religious and commercial importance. Believed to be founded by king Hindu Singh of the erstwhile state of Sachendi, Kanpur was originally known as ’Kanhpur’.</HTML>");
img=new ImageIcon(getClass().getResource("/images/kanpur2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+10,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
uttarpradesh up=new uttarpradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
up.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
up.setVisible(true);
up.setTitle("Famous Places of Uttar Pradesh");
up.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
kanpur knpr=new kanpur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
knpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
knpr.setVisible(true);
knpr.setTitle("Kanpur");
knpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
