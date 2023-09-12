package jharkhand;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class dhanbad extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
dhanbad()
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
l1=new JLabel("<HTML>Dhanbad<BR><BR>Fast Facts <BR>Temperature : Summer: 47-25C Winter: 22-12 C <BR>Season :September to May <BR>Clothing : Summer - Cotton/Tropical, Winter - Light Woolens <BR>Languages spoken : Hindi, Bengali, English and Santhali <BR>STD Code : 0326 <BR>An important railway division, Dhanbad is an industrial centre with an abundance of coal. The third largest city of Jharkhand, the place is aptly called the Coal Capital of India. One of Dhanbad’s travel attractions is a visit to one of the several coal mines that are situated here. The place is also known for some of the famous research institutes of the country including the Indian School of Mines. Travel to Dhanbad includes a trip to some of beautiful attractions that are used as excursions from the city. It's possible to visit Dhanbad as a long day trip from Kolkata.</HTML>");
img=new ImageIcon(getClass().getResource("/images/dhanbad2.jpg"));
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
dhanbad dhnbd=new dhanbad();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
dhnbd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
dhnbd.setVisible(true);
dhnbd.setTitle("Dhanbad");
dhnbd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
