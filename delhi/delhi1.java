package delhi;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class delhi1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
delhi1()
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
f=new Font("",Font.BOLD,14);
l1=new JLabel("<HTML>Delhi<BR><BR>Fast Fact <BR>Temperature : Summer: 41.2 -21.4 C Winter: 33.7 -6.8 C <BR>Best Season : September to March <BR>Clothing : Summer- Cottons, Winter- Heavy woollens <BR>Languages spoken : Hindi, English, Urdu, Punjabi STD Code : 011 Tourist Office: India Tourism, 88, Janpath,New Delhi. Tel: 23320342, 23320266, 23320005, Fax: 23320109. Email: goitodelhi@nic.in. <BR>Delhi Tourism and Transport Development Corporation (DTDC),Website: http://delhitourism.nic.in,DTTDC Information Counter, Indira Gandhi International Airport, Tel: 25675609.<BR>No other city in the world is like Delhi, the capital of India. One of the oldest cities in the world, Delhi has an excellent old town ambience in Old Delhi, and is modern in New Delhi. Stately and historic, the city is one of the undisputed highlights of the country. An array of historical sites including World Heritage Sites of Red Fort, Humayun’s Tomb and Qutub Minar rests amongst other several historical treasures in Delhi’s possession. The seamless blend of old and new worlds makes for a fascinating exploration of this metropolis. The city is normally the first port of call for those planning to visit Northern India.</HTML>");
img=new ImageIcon(getClass().getResource("/images/GoldenIndiaGatecoolWather.jpg"));
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
delhi dl=new delhi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
dl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
dl.setVisible(true);
dl.setTitle("Famous Places of Delhi");
dl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
delhi1 dl1=new delhi1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
dl1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
dl1.setVisible(true);
dl1.setTitle("Delhi");
dl1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
