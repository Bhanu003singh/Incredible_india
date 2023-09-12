package maharashtra;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class nagpur extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
nagpur()
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
l1=new JLabel("<HTML>Nagpur<BR><BR>Fast Fact <BR>Temperature : Summer: 43-23C Winter: 29-09 C <BR>Season : Throughout the year <BR>Clothing : Cotton in summer and woollen in winter <BR>Languages spoken : Marathi, English and Hindi <BR>STD Code: 0712 Tourism Office: Maharashtra Tourism Development Corporation (MTDC), Sanskrutik Bachat Bhavan, Sitabuldi, Nagpur. Tel: 0712 2533325, Fax: 2560680<BR>An enticing blend of the old and new, Nagpur is Maharashtra’s third largest city and one of the all-time favourite spots in the state. <BR>Once the seat of power of the Bhonsale rulers and the capital of the former Central Provinces, the city is the third largest of the state and the focal point of the Vidarbha region.<BR> Also known as the Orange City of India as it is a major trade centre for oranges grown in the region, Nagpur is base for Navagaon National Park and Tadoba-Andhari Tiger Reserve that lure wildlife enthusiasts to this eastern part of Maharashtra. The city is also used as a base for visiting Ramtek, a place associated with Lord Rama and famous Sanskrit poet Kalidasa.</HTML>");
img=new ImageIcon(getClass().getResource("/images/nagpur.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+50,1200,350);
l2.setBounds(400,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
maharashtra mh=new maharashtra();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mh.setVisible(true);
mh.setTitle("Famous Places of Maharashtra");
mh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
nagpur ngpr=new nagpur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ngpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ngpr.setVisible(true);
ngpr.setTitle("Nagpur");
ngpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
