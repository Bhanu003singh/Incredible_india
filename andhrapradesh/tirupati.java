package andhrapradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class tirupati extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
tirupati()
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
l1=new JLabel("<HTML>Tirupati<BR><BR>Fast Facts <BR>Temperature : Summer: 43-22C Winter: 32-13 C <BR>Season: Throughout the year <BR>Clothing: Light cotton during summer and light woolen in winter. <BR>Languages Spoken: Telugu, Tamil and English <BR>STD Code: 0877 <BR>Tourism Office: India Tourism-Hyderabad, Ministry of Tourism, Govt. of India, Ground Floor, Balayogi Paryatak Bhavan, # 6-3-870, Greenlands, Begum pet, Hyderabad-500016, <BR>E-mail: ithyd-tour@nic.in, <BR>Ph.No: 040 – 2340 9199 (Information Counter), Fax:040 - 23409299<BR>Travel to Tirupati and you will be confronted by a symbol of Hindu India in the spiritually important Lord Sri Venkateswara temple situated on one of the seven peaks of Tirumala Hills adjoining it. This busiest and richest temple in India draws thousands of pilgrims every day. A Dravidian-style shrine of great antiquity, it was patronized by all the major powers of south India including Pallavas, Pandyas, Cholas, and Vijayanagar. The magnificent structure features diamond-decorated 2 m black stone idol of Lord Venkateswara, living form of Vishnu. In fact, the journey to Tirupati situated in the Chittoor district of Andhra Pradesh is a pilgrimage that every Hindu cherishes to make.</HTML>");
img=new ImageIcon(getClass().getResource("/images/tirupati2.jpg"));
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
andhrapradesh ap=new andhrapradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ap.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ap.setVisible(true);
ap.setTitle("Famous Places of Andhra Pradesh");
ap.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
tirupati tiru=new tirupati();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
tiru.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
tiru.setVisible(true);
tiru.setTitle("Tirupati");
tiru.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
