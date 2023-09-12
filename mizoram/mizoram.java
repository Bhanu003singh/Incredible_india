package mizoram;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class mizoram extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2;
JButton b1;
public mizoram()
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
img=new ImageIcon(getClass().getResource("/images/mizoram1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Mizoram");
b1=new JButton("Know More");
l1.setBounds(450,130,img.getIconWidth(),img.getIconHeight());
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
mizoram1 mzorm1=new mizoram1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mzorm1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mzorm1.setVisible(true);
mzorm1.setTitle("Mizoram");
mzorm1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
mizoram mzorm=new mizoram();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mzorm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mzorm.setVisible(true);
mzorm.setTitle("Mizoram");
mzorm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 