package himachalpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class kullu extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
kullu()
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
l1=new JLabel("<HTML>Kullu<BR><BR>Fast Fact <BR>Temperature : Summer: 30.8-18.8 C Winter: 16.4 -3C <BR>Best Season : April to Mid-July and Sep. to Nov <BR>Clothing : Summer- Light Woollens, Winter- heavy woollens <BR>Languages spoken : Pahari (Local Dialect), Hindi, English. <BR>STD Code: 01902<BR>Located in the blossom of green mountains with perennial falls and streams, Kullu’s beauty is dear to the people visiting this wonderful town in Himachal Pradesh. The Valley of Gods, as the Kullu Valley has come to be known, is located at an altitude of 1220m above sea level and allures a large number of tourists. Situated on the banks of the river Beas, the place is also famous destination for the honeymooners who visit this place in great numbers. It is the ideal destination to beat the heat of the plains. Dotted with several shrines and an excellent base for a number of treks, Kullu is known for the Dussehra festival that attracts visitors from across the world.</HTML>");
img=new ImageIcon(getClass().getResource("/images/kullu2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
himachal hp=new himachal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hp.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hp.setVisible(true);
hp.setTitle("Famous Places of Himachal Pradesh");
hp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
kullu kul=new kullu();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kul.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kul.setVisible(true);
kul.setTitle("Kullu");
kul.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
