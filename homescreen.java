import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class homescreen extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2; 
JButton b1;
homescreen()
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
img=new ImageIcon(getClass().getResource("/images/logo_new.png"));
l1=new JLabel(img);
l1.setIcon(img);
img=new ImageIcon(getClass().getResource("/images/welcome.jpg"));
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Continue");
l1.setBounds(450,5,img.getIconWidth(),img.getIconHeight());
l2.setBounds(420,250,img.getIconWidth(),img.getIconHeight());b1.setBounds(img.getIconWidth()+450,630,120,35);
b1.addActionListener(this);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
menu men=new menu();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
men.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
men.setVisible(true);
men.setTitle("Menu Frame");
men.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
public static void main(String args[])
{
homescreen hmscrn=new homescreen();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hmscrn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hmscrn.setVisible(true);
hmscrn.setTitle("Welcome");
hmscrn.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
} 