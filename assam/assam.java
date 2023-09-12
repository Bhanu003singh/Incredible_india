package assam;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class assam extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2;
JButton b1;
public assam()
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
img=new ImageIcon(getClass().getResource("/images/assam1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Assam");
b1=new JButton("Know More");
l1.setBounds(420,130,img.getIconWidth(),img.getIconHeight());
l2.setBounds(600,img.getIconHeight()+160,100,25);
b1.setBounds(670,img.getIconHeight()+160,100,25);
b1.addActionListener(this);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
assam1 assm1=new assam1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
assm1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
assm1.setVisible(true);
assm1.setTitle("Assam");
assm1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
assam assm=new assam();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
assm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
assm.setVisible(true);
assm.setTitle("Assam");
assm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 