package maharashtra;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ashtavinayak extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
ashtavinayak()
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
l1=new JLabel("<HTML>Ashtavinayak<BR><BR>If you're looking for a brush with divine, the “Ashtavinayak” temples in the state of Maharashtra dedicated to Lord Ganesh are the places to be. <BR>Devotees throng to these temples in large number because it is believed that a pilgrimage to the Ashtavinayak ensures the pilgrim everlasting bliss. <BR>Glorified as 'Swayambhu' or self-emanated, each of the eight idols have distinctive features. <BR>Pune, the second largest city of the state, can be used as a base to visit these shrines. <BR>These Swayambhu shrines, in order of importance are Morgaon, Siddhatek, Pali, Madh, Theur, Lenyadri, Ozar and Ranjangaon.</HTML>");
img=new ImageIcon(getClass().getResource("/images/ashtavinayak.jpg"));
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
maharashtra mh=new maharashtra();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mh.setVisible(true);
mh.setTitle("Famous Places of Maharashtra");
mh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
ashtavinayak astv=new ashtavinayak();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
astv.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
astv.setVisible(true);
astv.setTitle("Ashtavinayak");
astv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
