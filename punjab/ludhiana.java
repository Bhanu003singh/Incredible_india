package punjab;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ludhiana extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
ludhiana()
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
l1=new JLabel("<HTML>Ludhiana<BR><BR>Fast Facts <BR>Area 134.67 sq km <BR>Altitude 262 m above sea level <BR>Temperature Summer: 23-43 C Winter: -4.3 -26.2 C <BR>Languages Hindi, English, Panjabi <BR>STD Code 0161 <BR>Best Time to Visit - November to March.<BR>Located on the south bank of River Sutlej, Ludhiana is an important industrial town of Punjab producing industrial goods, machine parts, auto parts, household appliances, hosiery and garments. It is a rich town and in 2008 had the highest per capita income in the country. It also occupies a significant place on the map for the pilgrim tourist since it has several Gurudwaras and holy shrines located in close proximity. Ludhiana is a hospitable town and its central location allows a quick access to the major landmarks in and around it. </HTML>");
img=new ImageIcon(getClass().getResource("/images/ludhiana2.jpg"));
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
punjab pnjb=new punjab();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pnjb.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pnjb.setVisible(true);
pnjb.setTitle("Famous Places of Punjab");
pnjb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
ludhiana ldhna=new ludhiana();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ldhna.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ldhna.setVisible(true);
ldhna.setTitle("Ludhiana");
ldhna.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
