package odisha;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class chilikalake extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
chilikalake()
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
l1=new JLabel("<HTML>Chilika Lake<BR><BR>Fast Fact <BR>Temperature: Summer: 37-30 C Winter: 24-17 C <BR>Best Season: Throughout the year <BR>Clothing: Tropical <BR>Languages spoken: Oriya, Bengali, Hindi, English. <BR>STD Code: 06756 Tourism Office: Government of Odisha Tourist Office, Hill Patna, in front of NCC Canteen, Berhampur, Ganjam-760005 <BR>Tel: 0680 2222980, 2280226<BR>Emphatically not to be missed while you're in the state of Odisha is a visit to the Chilika Lake, spreading over an area of 1,100 sq km. Set amidst a dramatic landscape, this largest brackish water lake in Asia is a jewel in Odisha’s crown. The lake is a haven for migratory birds. In the in the centre of the lake is an important temple dedicated to Hindu Goddess Kalijai. With its placid waters shimmering in the sunlight, its exciting variety of avian life, Chilika Lake represents nature at her most untamed. Watching the pods of dolphins is a feast for your eyes. Barkul and Rambha are two places on the lake which serve as the base.</HTML>");
img=new ImageIcon(getClass().getResource("/images/chilkalake.jpg"));
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
chilikalake chlklk=new chilikalake();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chlklk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chlklk.setVisible(true);
chlklk.setTitle("Chilika Lake");
chlklk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
