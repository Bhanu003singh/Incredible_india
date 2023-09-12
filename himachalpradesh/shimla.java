package himachalpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class shimla extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
shimla()
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
l1=new JLabel("<HTML>Shimla<BR><BR>Fast Facts <BR>Temperature: Summer: 27.0 -14.5 C Winter: 16.5 -5.2 C <BR>Season: April to Mid-July, Mid-Sept to Mid-Nov. <BR>Clothing : Summer- Light warm clothes Winter- Heavy woollens <BR>Languages spoken: Hindi, English, Himachali (Pahari). <BR>STD Code: 0177 <BR>Tourism Centres: India Tourism, 88, Janpath, New Delhi. Tel: 23320342, 23320266, 23320005, Fax: 23320109. Email: goitodelhi@nic.in.<BR>Delhi Tourism and Transport Development Corporation (DTDC), Central Reservation Office, Coffe Home, Baba Kharak Singh Marg, New Delhi-110001 <BR>Tel:91-11-23365358, 23363607. City Information Service: 1208 <BR>Website: http://delhitourism.nic.in<BR>Located deep in the Himalayan foothills and entirely surrounded by dense forest and magnificent mountains, Simla (now spelled Shimla) was the glorious summer resort of the British Raj. One of the most popular hill stations in India, the city sits at an altitude of 2213 meters and is the present capital of Himachal Pradesh. The imposing six-story Scottish baronial mansion known as Viceregal Lodge, summer seat of the British government until the 1940s, is undoubtedly Shimla’s best-loved colonial attraction. Shimla, which has the distinction of inspiring scenes from Rudyard Kipling's Kim, is also a base for visitors who come to seek adventure in other parts of the state.</HTML>");
img=new ImageIcon(getClass().getResource("/images/shimla2.jpg"));
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
himachal hp=new himachal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hp.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hp.setVisible(true);
hp.setTitle("Famous Places of Himachal Pradesh");
hp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
shimla shmla=new shimla();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
shmla.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
shmla.setVisible(true);
shmla.setTitle("Shimla");
shmla.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
