package madhyapradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ujjain extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
ujjain()
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
l1=new JLabel("<HTML>Ujjain<BR><BR>Fast Fact <BR>Temperature : Summer: 48- 24 C Winter: 36 – 09 C <BR>Best Season : October to March <BR>Clothing : Summer- Cotton, light clothing <BR>Winter - Light woollens for daywear, heavy woolens for night <BR>Languages spoken : Hindi and English <BR>STD Code: 0734. <BR>Tourist Office: Bhopal Regional Office Palash Residency, Near 45 Bungalow, T.T. Nagar, Bhopal - 462 003. <BR>Tel.: (0755) 2766750,2553006/66/76.<BR>The ancient city of Ujjain lies on the banks of river Shipra. The number of temples in Ujjain, it is popularly held, are so many, that if one comes here with two cartloads of grain and offers only one handful at each temple, one would still run short of offerings. Legend has it that Ujjain is one of the saptapuris, or the seven holy cities of India that grant moksha or liberation from the cycle of birth and death. Ujjain hosts the Simhasth, as the Kumbh Mela is known here, every 12 years, the latest of which was in 2004.</HTML>");
img=new ImageIcon(getClass().getResource("/images/ujjain2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,350);
l2.setBounds(330,30,img.getIconWidth(),img.getIconHeight());
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
ujjain ujjn=new ujjain();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ujjn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ujjn.setVisible(true);
ujjn.setTitle("Ujjain");
ujjn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
