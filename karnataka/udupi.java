package karnataka;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class udupi extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
udupi()
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
l1=new JLabel("<HTML>Udupi<BR><BR>Fast Fact <BR>Temperature : Summer: 40-22C<BR> Winter: 32-10 C <BR>Best Season : Throughout the year <BR>Clothing : Tropical <BR>Languages spoken : Kannada and English <BR>STD Code: 0820 <BR> Approximately 60km from Mangalore is the famous Vaishnavite pilgrimage town of Udupi, also known as Rajata Peetha and Shivalli. This was the sanctum of Madhwacharya, the great Sanskrit philosopher. It is as much renowned for its chefs, cuisine, and restaurants as it is for its Krishna Temple and various mutts. <BR>The main attraction at this temple is the 'Kanakana Kindi' - a small window through which Krishna is believed to have given darshan to his ardent devotee, Kanakadasa, a saint-minstrel. The colourful Paryaya festival, when officiating priests hand over their responsibilities to other pontiff, beckons thousands of devotees from all over the country every alternate year.</HTML>");
img=new ImageIcon(getClass().getResource("/images/udupi2.jpg"));
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
karnataka kntk=new karnataka();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kntk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kntk.setVisible(true);
kntk.setTitle("Famous Places of Karnataka");
kntk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
udupi udpi=new udupi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
udpi.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
udpi.setVisible(true);
udpi.setTitle("Udupi");
udpi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
