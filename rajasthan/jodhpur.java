package rajasthan;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class jodhpur extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
jodhpur()
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
l1=new JLabel("<HTML>Jodhpur<BR><BR>Fast Facts <BR>Area: 26 sq km <BR>Altitude: 236.53 m <BR>Temperature: Summer: 45 - 36.6 C Winter: 27.5 - 15.5 C <BR>Rainfall: 31.87 cm <BR>Season: August to March. <BR>STD Code: 0291 <BR>Conducted Tours: City Tours: to Umaid Bhavan Palace; 9 am to 1 pm; Rs. 100; <BR>Starting Point: Hotel Ghoomar, Jaswant Thada; to Mehrangarh; 2 to 6 pm; Starting Point: RTDC, High Court Road <BR>Tel: 0291 2544010 <BR>Jeep Safaris to villages around Jodhpur and Osian tour are arranged by RTDC, on demand. It is five-hour tour.<BR>Located almost on the edge of the Thar Desert, the city of Jodhpur was founded in 1459 by Rao Jodha, the chief of the Rathore clan of Rajputs and was the capital of the State of Marwar. Jodhpur is also known as the Sun City because the sun shines brightly here every day of the year, and as Blue City since most houses in the old part of the city are painted blue. The forts and palaces, temples and havelis, culture and tradition, spices and fabrics, colour and texture, a booming handicrafts industry, all add up to make this historic city worth a visit.</HTML>");
img=new ImageIcon(getClass().getResource("/images/jodhpur2.jpg"));
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
rajasthan rjsthn=new rajasthan();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
rjsthn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
rjsthn.setVisible(true);
rjsthn.setTitle("Famous Places of Rajasthan");
rjsthn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
jodhpur jdhpr=new jodhpur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jdhpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jdhpr.setVisible(true);
jdhpr.setTitle("Jodhpur");
jdhpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
