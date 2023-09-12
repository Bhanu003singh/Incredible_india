package nagaland;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class nagaland extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2;
JButton b1;
public nagaland()
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
img=new ImageIcon(getClass().getResource("/images/nagaland1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Nagaland");
b1=new JButton("Know More");
l1.setBounds(400,130,img.getIconWidth(),img.getIconHeight());
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
nagaland1 nglnd1=new nagaland1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
nglnd1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
nglnd1.setVisible(true);
nglnd1.setTitle("Nagaland");
nglnd1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
nagaland nglnd=new nagaland();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
nglnd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
nglnd.setVisible(true);
nglnd.setTitle("Nagaland");
nglnd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 