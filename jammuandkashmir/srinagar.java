package jammuandkashmir;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class srinagar extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
srinagar()
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
l1=new JLabel("<HTML>Srinagar<BR><BR>Fast Fact<BR>Temperature: Summer: 29.5 - 10.6 C Winter: 7.3 - -1.9 C <BR>Season: Throughout the year, though winter months can be quite cold <BR>Clothing : Heavy woollens with over coats & sports shoes.<BR> Languages spoken: Kashmiri, Urdu, Hindi, English <BR>STD Code: 0194 <BR>Tourism Centres: Director of Tourism, Govt. of J&K, Tourist Reception Centre, Srinagar, Tel: 2472449/ 2452691/92, Fax: 2479548, <BR>email: dtk@jktourism.org <BR>Assistant Director of Tourism, Govt of J & K, Tourist Reception Centre, Vir Marg, Jammu, Tel: 2548172, Fax: 2548172.<BR>Located on the banks of Jhelum in the heart of the Kashmir valley, Srinagar is very much a niche tourism town, attracting a steady flow of tourists from all parts of India and abroad.<BR> A travel to the summer capital of Jammu and Kashmir is a fairytale panoramic tour through the mountains where nature is both the backdrop and the director.<BR> The beautiful placid mountain-backed Dal and Nagin lakes, the unique accommodation in houseboats, the blossoming gardens and the waterways with their own quaint lifestyle make Srinagar a paradise for holidaymakers and nature lovers.<BR> The city is also the base to enjoy some of the best hiking, mountain biking, river rafting opportunities in India.</HTML>");
img=new ImageIcon(getClass().getResource("/images/srinagar-shikaras.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+50,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
jammukashmir jk=new jammukashmir();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jk.setVisible(true);
jk.setTitle("Famous Places of Jammu & Kashmir");
jk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
srinagar sri=new srinagar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
sri.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
sri.setVisible(true);
sri.setTitle("Srinagar");
sri.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
 
