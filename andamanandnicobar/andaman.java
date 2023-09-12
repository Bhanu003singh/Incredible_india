package andamanandnicobar;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class andaman extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2;
JButton b1;
public andaman()
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
img=new ImageIcon(getClass().getResource("/images/andaman.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Andaman & Nicobar Islands");
b1=new JButton("Know More");
l1.setBounds(480,130,img.getIconWidth(),img.getIconHeight());
l2.setBounds(520,img.getIconHeight()+180,200,30);
b1.setBounds(710,img.getIconHeight()+180,100,25);
b1.addActionListener(this);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
andaman1 andmn1=new andaman1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
andmn1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
andmn1.setVisible(true);
andmn1.setTitle("Andaman & Nicobar Islands");
andmn1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
andaman andmn=new andaman();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
andmn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
andmn.setVisible(true);
andmn.setTitle("Andaman & Nicobar Islands");
andmn .setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 