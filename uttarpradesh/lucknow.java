package uttarpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class lucknow extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
lucknow()
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
l1=new JLabel("<HTML>Lucknow<BR><BR>Fast Fact <BR>Temperature: Summer: 43- 30C Winter: 25- 5C <BR>Best Season : November to February <BR>Clothing : Summer- Cotton, Winter - Woollens Languages spoken : Hindi, Urdu and English STD Code: 0522 Tourist Office: Directorate of Tourism, U.P.C-13, Vipin Khand Gomti Nagar Tel: 0522 -0522-2307028, 2308916 Fax: 2308937 Regional Tourist Office C-13, Vipin Khand Gomti Nagar Tel: 0522 2304870 <BR>Retaining a feast of British Raj architecture as well as home to two grandiose tombs, Lucknow was the administrative and cultural hub of the Nawabs of Avadh (Oudh). During the period of the weakening of the Mughal Empire, the city rose into prominence as a centre for poetry, music, dance and courtly diction. <BR>Modern Lucknow, extending along the banks of the Gomti River, is a seamless blend of the medieval and the modern, as new shopping complexes and ultra-modern mall are popping up all over the city.</HTML>");
img=new ImageIcon(getClass().getResource("/images/lucknow2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,350);
l2.setBounds(350,15,img.getIconWidth(),img.getIconHeight());
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
lucknow lknw=new lucknow();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
lknw.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
lknw.setVisible(true);
lknw.setTitle("Lucknow");
lknw.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
