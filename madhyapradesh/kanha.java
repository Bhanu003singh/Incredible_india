package madhyapradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class kanha extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
kanha()
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
l1=new JLabel("<HTML>Kanha National Park<BR><BR>Fast Fact <BR>Temperature : Summer: 40.6 -23.9 C Winter: 23.9 -1.1C <BR>Season : April to June and November to January. (The park is closed during the monsoons from 1st July to 31st October) <BR>Clothing Cotton Winter- Heavy woollens <BR>Languages spoken Hindi, English <BR>STD Code : 07642. Tourism Office The Field Director, Project Tiger, Kanha Tiger Reserve, Mandla – 481661. <BR>Tel: (07642) 250760<BR>Kanha National Park, which forms the core of the Kanha Tiger Reserve created in 1974 under Project Tiger, is a beautiful land that is home to large number of varieties of flora and fauna in the beautiful forests. Occupying an area of 940 sq km, Kanha National Park, which inspired Rudyard Kipling’s Jungle Book and its memorable characters Mowgli and Baghheera is a wildlife enthusiast’s delight. <BR>A great holiday destination, away from the hectic pressures of city life, Kanha National Park is a beautiful place to unwind with nature by your side and indeed a wonderful experience in itself. Barasingha, or the swamp deer, is the signature animal of Kanha National Park.</HTML>");
img=new ImageIcon(getClass().getResource("/images/kanha2.jpg"));
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
madhyapradesh mp=new madhyapradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mp.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mp.setVisible(true);
mp.setTitle("Famous Places of Madhya Pradesh");
mp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
kanha knha=new kanha();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
knha.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
knha.setVisible(true);
knha.setTitle("Kanha National Park");
knha.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
