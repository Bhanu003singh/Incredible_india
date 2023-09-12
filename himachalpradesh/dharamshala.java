package himachalpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class dharamshala extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
dharamshala()
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
l1=new JLabel("<HTML>Dharamshala<BR><BR>Fast Facts <BR>Temperature: Summer: 33 -22 C Winter: 15 -0C <BR>Season: April to June and September to November. <BR>Clothing : Summer- Light Woollens and tropical Winter- Heavy woollens <BR>Languages spoken: Hindi, Punjabi, English and Pahari <BR>STD Code: 01892 <BR>Tourism Centres: HPTDC Tourist Information Office, Kotwali Bazaar, Dharamsala, <BR>Tel: (01892) 224212. Fax: 224928, Email: dharamshala@hptdc.in, <BR>Himachal Pradesh Tourist Information Office, 36.Janpath, Chanderlok-Building ,New Delhi. <BR>Tel : 223324764, 223325320, Fax: 23731072, <BR>Website: www.himachaltourism.nic.in<BR>The hillside town of Dharamshala, stretches along a spur of the Dhauladhar mountain range amidst magnificent deodar, conifer and pine forests, tea gardens and mist-soaked hills. Since 1960, when it became the temporary headquarters of the Dalai Lama, it has been attracting seekers of spiritual enlightenment from all over the world. The headquarters of the Kangra district, Dharamshala is divided into two distinct parts - Lower Dharamshala, and Upper Dharamshala with places like Mcleod Ganj and Forsyth Ganj, which are names that bear witness to the history of the area. The place is an excellent base for walks and treks into the Dhauladhar range.</HTML>");
img=new ImageIcon(getClass().getResource("/images/dharamshala2.jpg"));
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
dharamshala dhrm=new dharamshala();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
dhrm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
dhrm.setVisible(true);
dhrm.setTitle("Dharamshala");
dhrm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
