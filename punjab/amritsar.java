package punjab;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class amritsar extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
amritsar()
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
l1=new JLabel("<HTML>Amritsar<BR><BR>Fast Facts <BR>Altitude : 760 feet <BR>Temperature : Summer: 42 – 23 C Winter: 24 - 1 C <BR>Rainfall : 59.2 cm <BR>STD Code: 0183 <BR>Tourism Centre: Punjab Tourist Information Centre, Outgate Railway Station, Amritsar. Tel: 0183 2402452. <BR>Website: http://punjabgovt.nic.in.<BR>Amritsar, literally a Pool of Nectar, derives its name from Amrit Sarovar, the holy tank that surrounds the splendid Golden Temple. Guru Ramdas, the fourth Guru of the Sikh faith, founded Amritsar in 1579. He constructed a pool on land gifted by the Mughal Emperor Akbar and called it Amritsar. Home to the world famous Golden Temple, the 400-year-old city of Amritsar is the most important seat of Sikh history and culture. One of the most poignant memorials of free India -- Jallianwala Bagh – is also located in the city. Amritsar district was once a part of the vast area covered by the Indus valley Civilisation during the early period of history.</HTML>");
img=new ImageIcon(getClass().getResource("/images/amritsar2.jpg"));
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
punjab pnjb=new punjab();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pnjb.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pnjb.setVisible(true);
pnjb.setTitle("Famous Places of Punjab");
pnjb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
amritsar amrt=new amritsar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
amrt.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
amrt.setVisible(true);
amrt.setTitle("Amritsar");
amrt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
