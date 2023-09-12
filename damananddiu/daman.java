package damananddiu;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class daman extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2;
JButton b1;
public daman()
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
img=new ImageIcon(getClass().getResource("/images/daman.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Daman & Diu");
b1=new JButton("Know More");
l1.setBounds(420,130,img.getIconWidth(),img.getIconHeight());
l2.setBounds(520,img.getIconHeight()+160,250,30);
b1.setBounds(650,img.getIconHeight()+160,100,25);
b1.addActionListener(this);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
daman1 damn1=new daman1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
damn1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
damn1.setVisible(true);
damn1.setTitle("Daman & Diu");
damn1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
daman damn=new daman();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
damn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
damn.setVisible(true);
damn.setTitle("Daman & Diu");
damn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 