package manipur;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class manipur extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2;
JButton b1;
public manipur()
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
img=new ImageIcon(getClass().getResource("/images/manipur1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Manipur");
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
manipur1 mnipur1=new manipur1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mnipur1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mnipur1.setVisible(true);
mnipur1.setTitle("Manipur");
mnipur1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
manipur mnipur=new manipur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mnipur.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mnipur.setVisible(true);
mnipur.setTitle("Manipur");
mnipur.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 