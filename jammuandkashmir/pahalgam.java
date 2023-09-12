package jammuandkashmir;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class pahalgam extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
pahalgam()
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
l1=new JLabel("<HTML>Pahalgam<BR><BR>Fast Fact<BR> Floating clouds over the snow covered mountains, a gushing river and a thick forest cover of pine and fir trees is how this picturesque town of Pahalgam greets its visitor.<BR> A popular tourist destination in the state of Jammu and Kashmir, Pahalgam is situated at an altitude of 2,130metres. <BR>Interestingly, Pahalgam -- the well -known and well visited destinations in Kashmir Valley of today was once a quaint shepherd’s village.<BR>Pahalgam, which once used to be a village of shepherds, is also known by the name ‘Valley of Shepherds’ owing to the same fact.For the pilgrims heading towards Amarnath, Pahalgam acts as a base camp.</HTML>");
img=new ImageIcon(getClass().getResource("/images/lidder_river.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+50,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
jammukashmir jk=new jammukashmir();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jk.setVisible(true);
jk.setTitle("Famous Places of Jammu & Kashmir");
jk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
pahalgam phlgm=new pahalgam();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
phlgm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
phlgm.setVisible(true);
phlgm.setTitle("Pahalgam");
phlgm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
 
