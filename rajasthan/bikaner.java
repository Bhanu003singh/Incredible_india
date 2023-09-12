package rajasthan;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class bikaner extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
bikaner()
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
l1=new JLabel("<HTML>Bikaner<BR><BR>Fast Facts <BR>Area 38.10 sq km <BR>Altitude 237 m <BR>Temperature Summer: 41.8 - 28 C Winter: 23.2 - 10 C Rainfall 26-44 cm    <BR>Season October to March    <BR>STD Code 0151 Tourism Centre: Tourist Reception Centre, RTDC, Hotel Dhola Maru Campus, Bikaner, Tel: 0151 2226701<BR>Founded in 1488 by Rao Bikaji, Bikaner is situated on an elevated ground, surrounded by a 7 km long fortified wall with five entrance gates.  A magnificent fort built between 1588 and 1593 dominates the city. The fort and palace are built in the red sandstone that characterises Bikaner. <BR>The city is also known for its intricately carved Jharokas, stone screens found on the windows of the Junagarh fort, temples and havelis. Bikaner was and is the centre for Usta Art, a generic term for the Manoti-Naqqashi (embossed and unembossed floral and geometric patterned objects layered with gold) media produced by Usta family master artistans of Bikaner. One of the best known exports of the city is Bikaneri Bhujia, a spicy snack made from moth dal, spices and edible oil. Asia's large camel farm is located here.</HTML>");
img=new ImageIcon(getClass().getResource("/images/bikaner2.jpg"));
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
rajasthan rjsthn=new rajasthan();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
rjsthn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
rjsthn.setVisible(true);
rjsthn.setTitle("Famous Places of Rajasthan");
rjsthn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
bikaner bknr=new bikaner();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bknr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bknr.setVisible(true);
bknr.setTitle("Bikaner");
bknr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
