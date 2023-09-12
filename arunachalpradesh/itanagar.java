package arunachalpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class itanagar extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
itanagar()
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
l1=new JLabel("<HTML>Itanagar<BR><BR>Itanagar the capital of the north-eastern India state of Arunachal Pradesh is situated at the foothills of Himalayas at a height of 350 mts above sea level. Open to tourists recently in 1998, Itanagar is known for its incredible and incomparable natural beauty. Also known as the 'Land of the Dawnlit Mountains', the hill resort of Itanagar draws tourists from far and wide. Sprawling over 2,500 acres area, Itanagar is bestowed with beautiful and tranquil surroundings and offers a pleasant climate. <BR>Actually Itanagar is the twin towns, Naharlagun the older town and Itanagar the official capital. Both these twin-towns are 10 kms apart and present a very picturesque aspect and a find blend of the 'old' and the 'modern'. Administratively Itanagar comes under Papum Pare district, and has been the capital of Arunachal since 20th April 1974. Like other places of Arunachal Pradesh, Itanagar is also dominated by tribal groups, the Nishis or Nishings are the major tribe in Itanagar area. </HTML>");
img=new ImageIcon(getClass().getResource("/images/itanagar2.jpg"));
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
arunachal arnchl=new arunachal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
arnchl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
arnchl.setVisible(true);
arnchl.setTitle("Famous Places of Arunachal Pradesh");
arnchl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
itanagar itangr=new itanagar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
itangr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
itangr.setVisible(true);
itangr.setTitle("Itanagar");
itangr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
