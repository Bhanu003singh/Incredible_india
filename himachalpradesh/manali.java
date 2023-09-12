package himachalpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class manali extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
manali()
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
l1=new JLabel("<HTML>Manali<BR><BR>Fast Fact <BR>Temperature: Summer: 25-12 C Winter: 14.5 -2C <BR>Best Season : April to Mid-July and Sep. to Nov <BR>Clothing : Summer- Light Woollens, Winter- heavy woollens <BR>Languages spoken : Pahari (Local Dialect), Hindi, English. <BR>STD Code: 01902<BR>Located at a height of 1,926 meters on the northern end of the Kullu Valley in the state of Himachal Pradesh, Manali has been holding a magical allure for tourists with its incredible landscape abundant greenery and exquisite scenery. Travel to Manali evokes many images... fairy-tale snow-capped mountain vistas, flower-covered meadows, glaciers, winding rivers, temples and Buddhist monasteries. Enjoying the snowfall on the mighty Rohtang Pass will be an unforgettable affair. The vast expanse of varied and awe inspiring landscapes offer some of the most exciting sporting pursuits. They range from skiing and snow-boarding to hiking, paragliding, rock climbing, canoeing, and mountain biking and white water-rafting. But the less active tourist need not despair-thanks to the natural hot springs there.</HTML>");
img=new ImageIcon(getClass().getResource("/images/manali2.jpg"));
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
manali mnali=new manali();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mnali.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mnali.setVisible(true);
mnali.setTitle("Manali");
mnali.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
