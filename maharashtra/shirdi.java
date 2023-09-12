package maharashtra;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class shirdi extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
shirdi()
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
l1=new JLabel("<HTML>Shirdi<BR><BR>Fast Fact<BR>Temperature : Summer: 39.5 -22 C Winter: 33-12.2C <BR>Best Season : Throughout the year <BR>Clothing : Tropical <BR>Languages spoken : Marathi, Hindi, English <BR>STD Code: 02423 Tourist Office: Shri Sai Baba Sansthan, Shridi, Taluka - Kopargaon, Dist. Ahmednagar, Tel: 258500.<BR>Located in the Ahmednagar district of Maharashtra, Shirdi has emerged as a pilgrimage destination of top order due to its association with the renowned mystic Saint Shri Sai Baba. Revered by millions of people across the world, Shri Sai Baba preached tolerance towards all religions and the message of universal brotherhood. A world in itself, Shirdi is one of the busiest pilgrim centers in the country. <BR>Every activity at Shirdi revolves around the vast temple complex dedicated to Sai Baba. Other places of importance are the Gurusthan, Khandoba Temple, Shani Mandir, Narsimha Mandir, Changdev Maharaj Samadhi Sakori Ashram, and Chavadi, and Dwarkamai.</HTML>");
img=new ImageIcon(getClass().getResource("/images/Shirdi.jpg"));
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
maharashtra mh=new maharashtra();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mh.setVisible(true);
mh.setTitle("Famous Places of Maharashtra");
mh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
shirdi shd=new shirdi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
shd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
shd.setVisible(true);
shd.setTitle("Shirdi");
shd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
