package sikkim;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class sikkim extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2;
JButton b1;
public sikkim()
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
img=new ImageIcon(getClass().getResource("/images/sikkim1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Sikkim");
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
sikkim1 sikkm1=new sikkim1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
sikkm1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
sikkm1.setVisible(true);
sikkm1.setTitle("Sikkim");
sikkm1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
sikkim sikkm=new sikkim();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
sikkm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
sikkm.setVisible(true);
sikkm.setTitle("Sikkim");
sikkm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 