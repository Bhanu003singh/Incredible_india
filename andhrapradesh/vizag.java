package andhrapradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class vizag extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
vizag()
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
l1=new JLabel("<HTML>Vishakhapatnam<BR><BR>Fast Facts <BR>Temperature : Summer: 39-28C Winter: 29-19 C <BR>Season: Throughout the year <BR>Clothing: Tropical <BR>Languages Spoken: Telgu, English. Hindi, Bengali and Oriya <BR>STD Code: 0891 <BR>Tourism Office: Regional Tourist Information Bureau, Govt. of Andhra Pradesh, 1st Floor, Nehrunagar Shopping-cum-Office complex, <BR>Tel: 2746446/2713135<BR>Located on the south-east coast of Indian peninsula, the port city of Visakhapatnam, popularly known as Vizag, has been a huge draw card for travellers from far and wide for its natural beauty and commercial significance. The headquarters of the Eastern command of the Indian Navy, the second largest city in Andhra Pradesh, has Indian's most modern shipyard. Aptly known as the sobriquet ‘The Jewel of The East Coast’, Visakhapatnam and its surroundings can offer whole lot of attractions to a discerning visitor. Visitors can explore places of importance in and around Vizag by choosing this place as their base.</HTML>");
img=new ImageIcon(getClass().getResource("/images/vizag2.jpg"));
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
andhrapradesh ap=new andhrapradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ap.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ap.setVisible(true);
ap.setTitle("Famous Places of Andhra Pradesh");
ap.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
vizag vizg=new vizag();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
vizg.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
vizg.setVisible(true);
vizg.setTitle("Vishakhapatnam");
vizg.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
