package lakshadweep;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class lakshadweep extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2;
JButton b1;
public lakshadweep()
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
img=new ImageIcon(getClass().getResource("/images/lakshadweep1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Lakshadweep");
b1=new JButton("Know More");
l1.setBounds(420,130,img.getIconWidth(),img.getIconHeight());
l2.setBounds(560,img.getIconHeight()+160,150,25);
b1.setBounds(670,img.getIconHeight()+160,100,25);
b1.addActionListener(this);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
lakshadweep1 lkshdwp1=new lakshadweep1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
lkshdwp1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
lkshdwp1.setVisible(true);
lkshdwp1.setTitle("Lakshadweep");
lkshdwp1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
lakshadweep lkshdwp=new lakshadweep();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
lkshdwp.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
lkshdwp.setVisible(true);
lkshdwp.setTitle("Lakshadweep");
lkshdwp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 