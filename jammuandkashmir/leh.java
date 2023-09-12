package jammuandkashmir;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class leh extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
leh()
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
l1=new JLabel("<HTML>Leh - Ladakh<BR><BR>Fast Fact<BR> Temperature: Summer: 41.2 -21.4 C Winter: 33.7 -6.8 C <BR>Best Season : May to November<BR> Clothing : Light woollens in Summer and Heavy Woollens in Winter<BR> Languages spoken : Hindi, English, Urdu, Punjabi <BR>STD Code: 01982 <BR>Tourist Office: The Dy. Director of Tourism, Government of Jammu & Kashmir, Tourist Reception Centre, Leh - 194 101. Tel: 01982- 252095. Telefax: 252297.<BR>Set in Himalayan mountain splendor, Ladakh is an enchanted land, which amid the global chaos of our new century, seems in control of its own destiny.<BR> The scenic splendor of the soaring mountains and pristine valleys, coupled with the vibrancy of its cultural life, makes Ladakh one of the last undiscovered destinations; an adventure to feed the soul and enrich the senses. <BR>With the iconic sight of Hemis Monastery, 47 km from the capital Leh on the west bank of the Indus, under its belt, the place is famous for nine-storey palace built by King Singge Namgyal in the grand tradition of Tibetan architecture.</HTML>");
img=new ImageIcon(getClass().getResource("/images/pangong-tso-lake-ladakh.jpg"));
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
jammukashmir jk=new jammukashmir();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jk.setVisible(true);
jk.setTitle("Famous Places of Jammu & Kashmir");
jk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
leh lh=new leh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
lh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
lh.setVisible(true);
lh.setTitle("Leh-Ladakh");
lh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
 
