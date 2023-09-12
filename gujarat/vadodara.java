package gujarat;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class vadodara extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
vadodara()
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
l1=new JLabel("<HTML>Vadodara<BR><BR>Fast Fact <BR>Temperature : Summer: 40.4-20.4C Winter: 33.1-9.8 C <BR>Best Season : November to April <BR>Clothing : Tropical <BR>Languages spoken : Gujarati, Hindi and English <BR>STD Code: 0265 <BR>Tourist Office: Tourist Corporation of Gujarat Ltd., Narmada Bhavan, C-Block, Indira Avenue, Vadodara - 390 001 <BR>Tel: 2427489 Fax: 2431297.<BR>Situated on the banks of the Vishwamitri River, Vadodara, commonly called Baroda, is a city of beautiful gardens, magnificent palaces and many institutions of learning. Formerly the capital of the princely Gaekwad state, the city is today a thriving industrial and commercial centre. Home to an impressive museum, overwrought Indo-Saracenic palace and beautiful Tambekar Wada, the place is also an excellent base to explore the wonderful UNESCO World Heritage site of Champaner. If you visit Vadodara during Navratri, the nine night festival of dance in worship of the Mother Goddess, then you are in the most sought-after location for the event.</HTML>");
img=new ImageIcon(getClass().getResource("/images/vadodara2.jpg"));
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
gujarat gjrt=new gujarat();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
gjrt.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
gjrt.setVisible(true);
gjrt.setTitle("Famous Places of Gujarat");
gjrt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
vadodara vadod=new vadodara();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
vadod.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
vadod.setVisible(true);
vadod.setTitle("Vadodara");
vadod.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
