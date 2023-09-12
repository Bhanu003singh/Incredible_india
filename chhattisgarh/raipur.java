package chhattisgarh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class raipur extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
raipur()
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
l1=new JLabel("<HTML>Raipur<BR><BR>Fast Facts <BR>Area : 65 Sq. Km <BR>Altitude : 298 Mt. <BR>Temperature : Summer: 42.0-26.0°C <BR>Winter: 26.0-12.0°C <BR>Season: July to March <BR>STD Code: 0771.<BR> Founded by the Kalachuri King Ram Chandra of Ratanpur during the last quarter of the 14th century AD, Raipur is now the capital of the newly formed state of Chhattisgarh. <BR><BR>Raipur is the biggest city in the region and a fast developing industrial center. </HTML>");
img=new ImageIcon(getClass().getResource("/images/raipur2.jpg"));
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
chhattisgarh chtsgrh=new chhattisgarh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chtsgrh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chtsgrh.setVisible(true);
chtsgrh.setTitle("Famous Places of Chhattisgarh");
chtsgrh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
raipur raipr=new raipur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
raipr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
raipr.setVisible(true);
raipr.setTitle("Raipur");
raipr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
