package andhrapradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class hyderabad extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
hyderabad()
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
l1=new JLabel("<HTML>Hyderabad<BR><BR>Fast Facts <BR>Temperature : Summer: 42-22 C Winter: 22-13 C <BR>Best Season: August to March <BR>Clothing: Tropical <BR>Languages Spoken: Telugu, Urdu, Hindi and English <BR>STD Code: 040 <BR>Tourism Office: APTDC Central Reservation Offices NSF Shakar Bhavan, Opp. Police Control Room, Basheerbagh, Hyderabad. <BR>Phone: +91 40-66746370, +91 40-66745986 Cell: +91 9848540371<BR>The capital of the State of Andhra Pradesh iin Souther India is also its cultural and financial centre where vestiges of the medieval past merge with local culture and modern aspirations. In a travel to this fifth largest city in India, visitors can enjoy the city’s innocent charm, exquisite cuisines and beautiful mosques and minarets, as well as the chaotic energy of ebullient Hyderabad. Separated by its twin city of Secunderabad by Hussain Sagar Lake, Hyderabad has plenty of attractions including its restaurants, bars and teeming bazaars. New shopping complexes and ultra-modern malls are popping up all over the city, driving a new fashion dynamic. Hyderabad also claims to have the best Biryani in India.</HTML>");
img=new ImageIcon(getClass().getResource("/images/hyderabad2.jpg"));
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
hyderabad hydrbd=new hyderabad();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hydrbd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hydrbd.setVisible(true);
hydrbd.setTitle("Hyderabad");
hydrbd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
