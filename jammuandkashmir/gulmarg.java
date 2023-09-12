package jammuandkashmir;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class gulmarg extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
gulmarg()
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
l1=new JLabel("<HTML>Gulmarg<BR><BR>Fast Fact<BR>Temperature : Summer: 29- 13 C Winter: 09 – -14 C<BR>Best Season : May to September and November to February <BR>Clothing : Summer- light woollen clothing with rain-coat Winter - Heavy woollen<BR> Languages spoken : Kashmiri, Hindi and English <BR>STD Code: 01954<BR> Tourist Office: Assistant Director,Tourism Department, Gulmarg Mobile: +91 09419708180 <BR>Tel No:+9101954254487,254439<BR>Welcome to Gulmarg the hill resort with magical meadows and mountains. Then natural beauty of Gulmarg has attracted tourists since long. In fact the hill resort of Gulmarg literally means the meadow of flowers.<BR> The snow-clad peaks and the lovely landscapes of Gulmarg have provided background for several Bollywood ventures.The slopes of Gulmarg make it Asia’s only heli-skiing resort. There are immense beauty and adventure activities that make Gulmarg much more than a cool hill resort. British discovered the hill resort of Gulmarg in 1927 during their colonial rule in India.</HTML>");
img=new ImageIcon(getClass().getResource("/images/gulmarg.jpg"));
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
gulmarg glmrg=new gulmarg();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
glmrg.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
glmrg.setVisible(true);
glmrg.setTitle("Gulmarg");
glmrg.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
 
