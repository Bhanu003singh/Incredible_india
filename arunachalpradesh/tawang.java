package arunachalpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class tawang extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
tawang()
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
l1=new JLabel("<HTML>Tawang<BR><BR>TAWANG  the world of mystics and enchanting beauties forms the western most district of Arunachal Pradesh is located at the soaring height of near about 10,000fts above MSL sharing boundaries with Tibet in the north, Bhutan in the south west and Sela range of West Kameng the East is the home of Monpa tribe. Tawang is believed to have derived its name from the grandiose Tawang Monastery perched on the edge of the ridge running along the western part of Tawang township. Ta means Horse and Wang means chosen. As the legend goes the site of the present monastery is believed to have chosen by a Horse owned by Merag Lama Lodre Gyamtso. Mera Lama Lodre Gyamtso who was on a search for an appropriate place to establish Monastery was unable to locate any appropriate site so, finally decided to sit on prayer for a guidance of a divine power. As he opened his eyes after prayer, he found his horse missing. So, wearily he went out searching his horse and found it on the top of the hill known as Tana Mandekhang where once stood a palace of King Kala Wangpo. Believed it a good omen, Mera Lama Lodre Gyamtso decided to initiate a work for building up of a monastery with the help of people living across the land of Monpas. This Monastery was founded by Mera Lama Lodre Gyamtso in late 1681 according to the wishes of 5th Dalai Lama. However, there is a another belief of derivation of name Tawang. The great treasure Revealer, Terton Pemalingpa gave initiation such as Tamdin and Ka-gyad and hence the place came to be known as Tawang.</HTML>");
img=new ImageIcon(getClass().getResource("/images/tawang2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+30,1200,350);
l2.setBounds(400,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
arunachal arnchl=new arunachal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
arnchl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
arnchl.setVisible(true);
arnchl.setTitle("Famous Places of Arunachal Pradesh");
arnchl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
tawang twng=new tawang();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
twng.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
twng.setVisible(true);
twng.setTitle("Tawang");
twng.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
