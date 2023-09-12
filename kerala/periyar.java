package kerala;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class periyar extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
periyar()
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
l1=new JLabel("<HTML>Periyar<BR><BR>Fast Fact<BR> Temperature : Summer: 29-18C Winter: 21-15.5 C <BR>Best Season : October to April <BR>Clothing : Tropical <BR>Languages spoken : Malayalam, English, Hindi <BR>STD Code: 04869<BR> A rare example of human intervention having enhanced an ecosystem., the Periyar Wildlife Sanctuary situated at Thekkady in the high ranges of the Western Ghats, spreads over an area of 777sq.km. It is situated in the Idukki (Thekkady) and Pathanamthitta districts of Kerala. The Periyar Sanctuary has was declared a Tiger Reserve under Project Tiger in 1978. Mirror still lagoons, grassy plains and naked hills, make up the landscape of Periyar, providing the perfect foil to the wildlife found there elephants, Indian bison and the endangered lion-tailed macaque. The splendid artificial lake formed by the Mullaperiyar Dam across the Periyar adds to the charm of the park.</HTML>");
img=new ImageIcon(getClass().getResource("/images/periyar2.jpg"));
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
kerala kerla=new kerala();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kerla.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kerla.setVisible(true);
kerla.setTitle("Famous Places of Kerala");
kerla.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
periyar peryr=new periyar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
peryr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
peryr.setVisible(true);
peryr.setTitle("Periyar");
peryr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
