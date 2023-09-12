package himachalpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class chamba extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
chamba()
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
l1=new JLabel("<HTML>Chamba<BR><BR>Fast Facts <BR>Temperature: Summer: 39 -8 C Winter: 10 -1.1 C <BR>Season: April to Mid July and Mid Sept. to Dec<BR> Clothing : Summer- Light warm clothes Winter- Heavy woollens <BR>Languages spoken: Hindi, English, Himachali (Pahari). <BR>STD Code: 0177 <BR>Tourism Centres: Tourist Information Centre, Himachal Tourism, Hotel Iravati, Chamba, <BR>Tel: 222671, Fax: 222565 <BR>Website:. www.himachaltourism.nic.in<BR>There are many stunning, intriguing places around the world, but very few are as beautiful and awe-inspiring as Chamba. Located in the blossom of green mountains with perennial falls and streams, Chamba is one of those places that not only lives up to its image, but exceeds it. A travel to this place evokes many images... fairy-tale snow-capped mountain vistas, rushing torrent of the Ravi River and beautiful temples. One of the most famous hill stations in India that has been holding a magical allure for travellers, Chamba, a former princely state, is the administrative headquarters of the district of the same name.</HTML>");
img=new ImageIcon(getClass().getResource("/images/chamba2.jpg"));
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
chamba chmba=new chamba();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chmba.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chmba.setVisible(true);
chmba.setTitle("Chamba");
chmba.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
