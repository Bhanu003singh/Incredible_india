package karnataka;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class mysore extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
mysore()
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
l1=new JLabel("<HTML>Mysore<BR><BR>Fast Fact <BR>Area: 37.4 sq km <BR>Temperature: Summer: 35- 20 C Winter: Max: 28- 14 C <BR>Season: Throughout the year <BR>STD Code: 0821 <BR>Tourism Centres: Karnataka State Tourism Development Corporation (KSTDC), Mayura Yatri Niwas, JLB Road, Mysore, Tel: 0821 2423652, <BR>Department of Tourism, Government of Karnataka, Old Exhibition Building, Irwin Road, Mysore, Tel: 0821 2422096, Fax: 2421833, KSTDC, No.3, World Trade Centre, Cuffe Parade, Mumbai. <BR>Telefax: 22181658, Toll fee: 18004251414.<BR>Mysore was the political capital of the Wodeyar dynasty which ruled Karnataka for some 150 years till the independence of the country from the British. The kings, great patrons of art and culture, developed Mysore as an important centre of religion, education and culture. It was the Wodeyars who instituted the tradition of the grand celebration of Dasara festival, the 10-day festivities that celebrated its 400th anniversary in 2010. Today, Mysore is a city of palaces, gardens, shady avenues and sacred temples and retains some of the charm of the old world while stepping into modernity with enthusiasm. </HTML>");
img=new ImageIcon(getClass().getResource("/images/mysore2.jpg"));
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
karnataka kntk=new karnataka();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kntk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kntk.setVisible(true);
kntk.setTitle("Famous Places of Karnataka");
kntk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
mysore mysr=new mysore();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mysr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mysr.setVisible(true);
mysr.setTitle("Mysore");
mysr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
