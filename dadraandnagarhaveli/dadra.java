package dadraandnagarhaveli;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class dadra extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2;
JButton b1;
public dadra()
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
img=new ImageIcon(getClass().getResource("/images/nagar1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Dadra & Nagar Haveli");
b1=new JButton("Know More");
l1.setBounds(420,130,img.getIconWidth(),img.getIconHeight());
l2.setBounds(570,img.getIconHeight()+160,200,30);
b1.setBounds(700,img.getIconHeight()+160,100,25);
b1.addActionListener(this);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
dadra1 ddra1=new dadra1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ddra1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ddra1.setVisible(true);
ddra1.setTitle("Dadra & Nagar Haveli");
ddra1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
dadra ddra=new dadra();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ddra.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ddra.setVisible(true);
ddra.setTitle("Dadra & Nagar Haveli");
ddra.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 