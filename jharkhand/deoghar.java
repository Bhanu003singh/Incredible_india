package jharkhand;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class deoghar extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
deoghar()
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
l1=new JLabel("<HTML>Deoghar<BR><BR>Fast Facts <BR>Temperature : Summer: 36.9-23C Winter: 27.7-7.4 C <BR>Season : October to February <BR>Clothing : Summer - Cotton/Tropical, Winter - Woolens <BR>Languages spoken : Hindi and English <BR>STD Code : 06432 <BR>Also known as Baidyanath Dham, Baba Dham and by various other names, the district town Deoghar in Jharkhand is home one of the holiest Hindu places. Travel to Deoghar and you will be confronted by a symbol of Hindu India in the spiritually important Baidyanath Dham Temple, the number-one attraction of this place that draws hordes of pilgrims daily. The temple is one of the Dwadasa Jyotirlinga shrines or the 12 shrines enshrining Shiva in the form of a Jyotirlingam in the country. A place of intense spiritual activity Baidyanath Dham becomes one of India's busiest pilgrimage sites during the month of Shravan, the fifth month of Hindu calendar. Deoghar is also one of the 52 Shakti Pitha shrines of Sati. </HTML>");
img=new ImageIcon(getClass().getResource("/images/deoghar2.jpg"));
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
deoghar deoghr=new deoghar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
deoghr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
deoghr.setVisible(true);
deoghr.setTitle("Deoghar");
deoghr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
