package odisha;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class bhubaneshwar extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
bhubaneshwar()
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
l1=new JLabel("<HTML>Bhubaneshwar<BR><BR>Fast Facts <BR>Temperature : Summer: 44-27C Winter: 28-25 C <BR>Season : October to March <BR>Clothing : Summer-Light Cotton, Winter-Light woollen <BR>Languages spoken : Oriya, Bengali, Hindi <BR>STD Code : 0674 Tourism Office : Indiatourism Bhubaneswar, Paryatan Bhawan, 2nd Floor, Lewis Road, Bhubaneswar 751014, <BR>Tel/fax: 2432203, 2435487<BR>The capital of Orissa, Bhubaneswar is scenic, lively, green and clean, with a rich cultural life. Known for its temples the city is a major centre of attraction for tourist from far and wide. It is probably the only city that enables an authentic over view of the stages of development of Hindu temple architecture. It is the place where temple building activities of Odishan style flowered from its very inception to its fullest culmination extending over a period of one thousand years. Today Bhubaneswar is an embodiment of its dashing modernity and glorious past. A favourite excursion from Bhubaneswar is a drive to the pilgrimage town of Puri, also known for its beaches. </HTML>");
img=new ImageIcon(getClass().getResource("/images/bhubaneshwar2.jpg"));
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
odisha odsh=new odisha();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
odsh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
odsh.setVisible(true);
odsh.setTitle("Famous Places of Odisha");
odsh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
bhubaneshwar bbnshwr=new bhubaneshwar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bbnshwr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bbnshwr.setVisible(true);
bbnshwr.setTitle("Bhubaneshwar");
bbnshwr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
