package punjab;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class baghaborder extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
baghaborder()
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
l1=new JLabel("<HTML>Bagha Border<BR><BR>Attari Wagah Border is the only road border crossing between India and Pakistan. Often known as Berlin wall of Asia, this border lies on the Grand Trunk Road between Amritsar and Lahore. On this border, a retreat ceremony called 'lowering of the flags’ is held every evening, since 1959. During the ceremony, Border Security Force (B.S.F) of India and the Pakistan Rangers soldiers perform energetic parade.<BR>This 40 to 45 minutes ceremony takes place every evening before sunset at the Wagah Border. As the sun sets, the iron gate at the border is opened and the flags of India and Pakistan are lowered and folded by their respective soldiers. The ceremony ends with a  handshake between the soldiers of both the countries.<BR> Wagah Border opens between 10 am and 4 pm, while the flag down ceremony starts at 4:30pm and ends with the national anthem at 5 pm.Located around 28 km away from Amritsar, Attari Wagah Border can be reached by buses, taxis and auto-rickshaws.</HTML>");
img=new ImageIcon(getClass().getResource("/images/baghaborder2.jpg"));
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
punjab pnjb=new punjab();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pnjb.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pnjb.setVisible(true);
pnjb.setTitle("Famous Places of Punjab");
pnjb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
baghaborder bgbrdr=new baghaborder();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bgbrdr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bgbrdr.setVisible(true);
bgbrdr.setTitle("Bagha Border");
bgbrdr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
