package lakshadweep;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class lakshadweep1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
lakshadweep1()
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
l1=new JLabel("<HTML>Lakshadweep<BR><BR>Lakshadweep, the group of 36 islands is known for its exotic and sun-kissed beaches and lush green landscape. The name Lakshadweep in Malayalam and Sanskrit means 'a hundred thousand islands'. 'India's smallest Union Territory Lakshadweep is an archipelago consisting of 36 islands with an area of 32 sq km. It is a uni-district Union Territory and is comprised of 12 atolls, three reefs, five submerged banks and ten inhabited islands. The islands comprise of 32 sq km. The capital is Kavaratti and it is also the principal town of the UT. All Islands are 220 to 440 km away from the coastal city of Kochi in Kerala, in the emerald Arabian Sea. The natural landscapes, the sandy beaches, abundance of flora and fauna and the absence of a rushed lifestyle enhance the mystique of Lakshadweep.<BR>The islands are well connected by regular flights from Kochi. Helicopter transfer is available from Agatti to Kavaratti throughout the year. Lakshadweep has a tropical climate and it has an average temperature of 27° C - 32° C. April and May are the hottest with an average temperature of 32° C Generally the climate is humid warm and pleasant. As the climate is equitable during monsoons, ship-based tourism is closed. October to March is the ideal time to be on the islands. From June to October the South West Monsoon is active with an average rainfall of 10-40 mm. The relative humidity is 70-75%. Annual rainfall decreases from South to North. On an average, 80-90 days a year are rainy. Winds are light to moderate from October to March.</HTML>");
img=new ImageIcon(getClass().getResource("/images/lakshadweep2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+10,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(950,img.getIconHeight()+80,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
lakshadweep lkshdwp=new lakshadweep();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
lkshdwp.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
lkshdwp.setVisible(true);
lkshdwp.setTitle("Lakshadweep");
lkshdwp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
lakshadweep1 lkshdwp1=new lakshadweep1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
lkshdwp1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
lkshdwp1.setVisible(true);
lkshdwp1.setTitle("Lakshadweep");
lkshdwp1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
