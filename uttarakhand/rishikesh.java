package uttarakhand;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class rishikesh extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
rishikesh()
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
l1=new JLabel("<HTML>Rishikesh<BR><BR>Fast Facts <BR>Area: 11.20 sq km Altitude: 356 m <BR>Temperature: Summer: 44.4 – 29 C Winter: 32.2 – 3 C <BR>Season: Throughout the year <BR>STD Code: 01364 Tourism Office: AGM (Tourism), Tourist Information Centre, Yatra Office, Garhwal Mandal Vikas Nigam Ltd., Shail Vihar, Haridwar By Pass Road, Rishikesh 249201. <BR>Tel: 0135 2432648, 2431783, 2435174, 2430799, 2432648, Fax: 91-135-2430372. E-mail: yatra@gmvnl.com<BR> Rishikesh, the 'place of the sages' is a celebrated spiritual town located on the banks of the Ganga, surrounded by Shivalik range of the Himalayas on three sides. <BR>It is believed that when Raibhya Rishi undertook rigorous penance, God appeared in the form of Hrishikesh and this area henceforth came to be known as Rishikesh. It is the starting point for the Hindu Char Dham pilgrimage, including Yamunotri, Gangotri, Kedarnath and Badrinath, to seek spiritual salvation. Rishikesh is an ideal destination not only for pilgrims but also for those who want to delve deeper into meditation, yoga and other aspects of ancient practices. <BR>Rishikesh is also called the Yoga capital of the world. For the adventurous, Rishikesh is the place for starting their trekking expeditions and excursions towards the Himalayan peaks. The International Yoga week, which attracts participation from all across the world, is held here every year from February 2 to 7 on the banks of river Ganga.</HTML>");
img=new ImageIcon(getClass().getResource("/images/intro-rishikesh.jpg"));
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
uttarakhand uk=new uttarakhand();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
uk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
uk.setVisible(true);
uk.setTitle("Famous Places of Uttarakhand");
uk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
rishikesh rsksh=new rishikesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
rsksh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
rsksh.setVisible(true);
rsksh.setTitle("Rishikesh");
rsksh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
