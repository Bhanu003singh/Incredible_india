package rajasthan;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ajmer extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
ajmer()
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
l1=new JLabel("<HTML>Ajmer<BR><BR>Fast Facts <BR>Area: 55.76 sq km <BR>Altitude: 486 m <BR>Temperature: Summer: 43.7 - 37.7 C Winter: 23.3 - 5.5 C <BR>Rainfall: 38.57 cm <BR>Season: September to April <BR>STD Code: 0145 <BR>Tourism Centres: Tourist Reception Centre, Hotel Khadim (RTDC) Near Bus Station Ajmer <BR>Tel: 0145 2627426<BR>Founded in the seventh century by Ajaipal Chauhan, Ajmer derives its name from Ajaymeru, the invincible hill, at the foot of which the city stands today. <BR>Surrounded by the Aravalli mountain range, Ajmer is an oasis located between green hills. Ajmer is a popular pilgrimage; the Dargah Sharif – the tomb of the Sufi Saint Khwaja Moinuddin Chisti is revered by the Muslims. Ajmer is also the base for visiting Pushkar, the abode of Lord Brahma; Pushkar Lake is a sacred spot for the Hindus. During the month of Kartik (October/November) devotes throng in large numbers here to bathe in the sacred lake.</HTML>");
img=new ImageIcon(getClass().getResource("/images/ajmer2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+20,1200,350);
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
ajmer ajmr=new ajmer();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ajmr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ajmr.setVisible(true);
ajmr.setTitle("Ajmer");
ajmr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
