package madhyapradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class khajuraho extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
khajuraho()
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
l1=new JLabel("<HTML>Khajuraho<BR><BR>Fast Fact <BR>Area : 16.93 sq. km. <BR>Altitude: 257 m above Sea Level <BR>Temperature: Summer - 47c - 21 C Winter - 32 C - 4 C <BR>Languages: Hindi and English <BR>Season: October to march <BR>STD Code: 07686 <BR>Tourism Office: Tourist Interpretation Center/ Regional Office, Khajuraho <BR>Tel : (07686) 274051 Fax : (07686) 272330<BR>The temples of Khajuraho are India's unique gift to the world, representing, as they do, a paean to life, to love, to joy, perfect in execution and sublime in expression. Life, in every form and mood, has been captured in stone, testifying not only to the craftsman's artistry but also to the extraordinary breadth of vision of the Chandela Rajputs under whose rule the temples were conceived and constructed. <BR>The Khajuraho temples were built in the short span of a hundred years, from 950-1050 AD in truly inspired burst of creativity. Of the 85 original temples, 22 have survived till today to constitute one of the world's great artistic wonders.</HTML>");
img=new ImageIcon(getClass().getResource("/images/khajuraho2.jpg"));
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
madhyapradesh mp=new madhyapradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mp.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mp.setVisible(true);
mp.setTitle("Famous Places of Madhya Pradesh");
mp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
khajuraho khjrho=new khajuraho();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
khjrho.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
khjrho.setVisible(true);
khjrho.setTitle("Khajuraho");
khjrho.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
