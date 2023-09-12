package chandigarh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class chandigarh1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
chandigarh1()
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
l1=new JLabel("<HTML>Chandigarh<BR><BR>Fast Facts <BR>Temperature: Summer: 37-23C Winter: 24-5 C <BR>Season: October to March <BR>Clothing : Summer - Cotton, Tropical, Winter-Woollens <BR>Languages spoken: Hindi, Punjabi and English <BR>STD Code: 0172 <BR>Tourism Centres: Chandigarh Tourism, Sector 17, Chandigarh. <BR>Tel: 2704614. <BR>Punjab Tourism, Sector 22-B, ISBT, Chandigarh. Tel: 2704570. Haryana Tourism, Sector 17, Chandigarh. Tel: 2702955-57.<BR>Chandigarh comes lauded as India’s most beautiful city, and it lives up to it - it's delightful. Lying in the valley surrounded by Shiwalik Hills that hem the great Himalayas, the city, apart from being a Union Territory, also serves the capital of two states of India – Punjab and Haryana. A model for urban planners throughout the world, Chandigarh is an appealing, well-functioning clean city featuring wide avenues, grand parks, beautiful lakes, awesome gardens and architectural gems of the great French architect Le Corbusier. The place is also the reference point to visit the famous hill resorts of Shimla Kullu, Manali, Dharmashala and Dalhousie.</HTML>");
img=new ImageIcon(getClass().getResource("/images/chandigarh1.jpg"));
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
chandigarh chd=new chandigarh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chd.setVisible(true);
chd.setTitle("Famous Places of Chandigarh");
chd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
chandigarh1 chd1=new chandigarh1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chd1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chd1.setVisible(true);
chd1.setTitle("Chandigarh");
chd1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
