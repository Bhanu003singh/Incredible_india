package uttarpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class varanasi extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
varanasi()
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
l1=new JLabel("<HTML>Varanasi<BR><BR>Fast Fact <BR>Temperature : Summer: 45-30C Winter: 15-5 C <BR>Season : October - March <BR>Clothing Summer - Cottons, Winters - Woolens <BR>Languages spoken Hindi and English <BR>STD Code : 0542.<BR>Varanasi or Banares is the ultimate travel destination of India; and has been for centuries.Considered to be one of the oldest living cites in the world, Varanasi attracts visitors who come to this mystical city for a brush with the divine. Legend has it that that anyone who dies here will be liberated from the cycle of life and birth and therefore is one of the holiest cities for Hindus. </HTML>");
img=new ImageIcon(getClass().getResource("/images/varanasi2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,350);
l2.setBounds(350,15,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
uttarpradesh up=new uttarpradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
up.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
up.setVisible(true);
up.setTitle("Famous Places of Uttar Pradesh");
up.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
varanasi vrnsi=new varanasi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
vrnsi.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
vrnsi.setVisible(true);
vrnsi.setTitle("Varanasi");
vrnsi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
