package haryana;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class faridabad extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
faridabad()
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
l1=new JLabel("<HTML>Faridabad<BR><BR>Faridabad is the largest city in the north Indian state of Haryana, in Faridabad district. The district shares its boundaries with the National Capital and Union Territory of Delhi to its north, Gurgaon district to the west and Uttar Pradesh to its east and south. Faridabad enjoys a prime location both geographically and politically. The river Yamuna forms the eastern district boundary with Uttar Pradesh. The Delhi-Agra National Highway No.2 (Sher Shah Suri Marg) passes through the centre of the district. The city has many railway stations on the Delhi-Mathura double track broad-gauge line of the North Central Railway. The railway stations of Old Faridabad and New Industrial Township are the major ones.<BR>Faridabad is also a major industrial hub of Haryana 50% of the income tax collected in Haryana is from Faridabad and Gurgaon. Faridabad is famous for henna production from the agricultural sector, while tractors, motorcycles, switch gears, refrigerators, shoes and tyres constitute its primary industrial products.For ease of Civil Administration, Faridabad district is divided into two sub divisions viz. Faridabad and Ballabgarh, each headed by a Sub Divisional Magistrate. The Municipal Corporation of Faridabad (MCF) provides the urban civic amenities to the citizens of Faridabad City. Palwal, Hodal and Hathin Sub Divisions are now part of the newly created Palwal District.</HTML>");
img=new ImageIcon(getClass().getResource("/images/faridabad2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+50,1200,420);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
haryana hryna=new haryana();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hryna.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hryna.setVisible(true);
hryna.setTitle("Famous Places of Haryana");
hryna.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
faridabad frdbd=new faridabad();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
frdbd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
frdbd.setVisible(true);
frdbd.setTitle("Faridabad");
frdbd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
