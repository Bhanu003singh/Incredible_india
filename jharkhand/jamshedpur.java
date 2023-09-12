package jharkhand;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class jamshedpur extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
jamshedpur()
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
l1=new JLabel("<HTML>Jamshedpur<BR><BR>Fast Facts <BR>Temperature : Summer: 31-22C Winter: 22-2 C <BR>Season : October to March <BR>Clothing : Summer - Cotton/Tropical, Winter - Woollens <BR>Languages spoken : Hindi, English and Santhali<BR> STD Code : 0657 <BR>Variously known as Steel City, Tatanagar or simply Tata, Jamshedpur is the largest city in Jharkhand. The city is named after Sir Jamshedji Tata who is credited with the foundation of this city at the beginning of the last century. One of the cleanliest cities in India, Jamshedpur is a welcome break from the chaos of other Indian cities. It has been selected as a UN Global Compact City. Known for its steel factory,the place lures first-time visitors today with several beautiful attractions including Jubilee Park, Tata Zoological Park, Bhuvaneshwari Temple, Jayanti Sarowar and Dalma Wildlife Sanctuary. </HTML>");
img=new ImageIcon(getClass().getResource("/images/jamshedpur2.jpg"));
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
jharkhand jhrknd=new jharkhand();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jhrknd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jhrknd.setVisible(true);
jhrknd.setTitle("Famous Places of Jharkhand");
jhrknd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
jamshedpur jmshdpr=new jamshedpur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jmshdpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jmshdpr.setVisible(true);
jmshdpr.setTitle("Jamshedpur");
jmshdpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
