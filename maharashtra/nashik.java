package maharashtra;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class nashik extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
nashik()
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
l1=new JLabel("<HTML>Nashik<BR><BR>Fast Fact <BR>Fast Fact <BR>Temperature : Summer: 37-22C Winter: 17-10 C <BR>Season : Throughout the year <BR>Clothing : Cotton in summer and woollen in winter <BR>Languages spoken : Marathi, Hindi and English <BR>STD Code : 0253 Tourism Office : Maharashtra Tourism Development Corporation Ltd. (MTDC), T/1, Golf Club, Nashik, Tel: 0253 2570059.3) MTDC, CDO Hutments, Madam Cama Road, Mumbai. Tel: 022 22845678<BR>The richness of India's spiritual traditions finds its fullest expression in Nashik, one of India’s holiest cities. Since ancient times, the place has been the focal point of devotion and spiritual yearnings for Hindus. <BR>Every 12 years,it plays host to the mega Kumbh Mela that attracts millions of pilgrims.It is said that Lord Rama, hero of the epic Ramayana, spent the major part of his exile here. Situated on the banks of Godavari, Nashik is used by the visitors as a starting point to the pilgrim destinations of Trimbak and Shirdi, famous for their association with the renowned Saint Shri Sai Baba.</HTML>");
img=new ImageIcon(getClass().getResource("/images/nashik.jpg"));
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
nashik nsk=new nashik();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
nsk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
nsk.setVisible(true);
nsk.setTitle("Nashik");
nsk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
