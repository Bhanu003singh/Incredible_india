package meghalaya;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class meghalaya extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2;
JButton b1;
public meghalaya()
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
img=new ImageIcon(getClass().getResource("/images/meghalaya1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Meghalaya");
b1=new JButton("Know More");
l1.setBounds(440,130,img.getIconWidth(),img.getIconHeight());
l2.setBounds(580,img.getIconHeight()+160,100,30);
b1.setBounds(680,img.getIconHeight()+160,100,25);
b1.addActionListener(this);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
meghalaya1 mghlya1=new meghalaya1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mghlya1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mghlya1.setVisible(true);
mghlya1.setTitle("Meghalaya");
mghlya1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
meghalaya mghlya=new meghalaya();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mghlya.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mghlya.setVisible(true);
mghlya.setTitle("Meghalaya");
mghlya.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 