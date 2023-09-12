package tripura;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class tripura extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2;
JButton b1;
public tripura()
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
img=new ImageIcon(getClass().getResource("/images/tripura1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Tripura");
b1=new JButton("Know More");
l1.setBounds(420,130,img.getIconWidth(),img.getIconHeight());
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
tripura1 tripra1=new tripura1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
tripra1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
tripra1.setVisible(true);
tripra1.setTitle("Tripura");
tripra1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
tripura tripra=new tripura();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
tripra.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
tripra.setVisible(true);
tripra.setTitle("Tripura");
tripra.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 