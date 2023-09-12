package bihar;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class bodhgaya extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
bodhgaya()
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
l1=new JLabel("<HTML>Bodhgaya<BR><BR>Fast Facts <BR>Temperature : Summer: 47-28C Winter: 28-04 C <BR>Season : October to March <BR>Clothing : Light cotton in summer and light woollens in winter <BR>Languages spoken : Hindi, Bhojpuri and English <BR>STD Code : 0631<BR>Bodhgaya, the most important site of Buddhist pilgrimage in the world, is situated in the state of Bihar. The place is a sacred site of the first order, and its central temple, the UNESCO World Heritage listed Mahabodhi Temple, is an obligatory stop on the Buddhist pilgrimage circuit. Adjacent to the Mahabodhi Temple is the Bodhi tree itself under which Prince Siddhartha Gautama is said to have attained Enlightenment 2,500 years ago. As a result he became the Buddha - the Enlightened One. Bodh Gaya or Uruvela, as it was known during Buddha’s times, is also a major pilgrimage centre for Hindus as Buddha is considered to be the ninth incarnation of Vishnu. </HTML>");
img=new ImageIcon(getClass().getResource("/images/bodhgaya2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+20,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
bihar bihr=new bihar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bihr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bihr.setVisible(true);
bihr.setTitle("Famous Places of Bihar");
bihr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
bodhgaya bdhgya=new bodhgaya();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bdhgya.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bdhgya.setVisible(true);
bdhgya.setTitle("Bodhgaya");
bdhgya.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
