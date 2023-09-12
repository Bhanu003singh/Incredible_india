package delhi;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class delhi extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2;
JButton b1;
public delhi()
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
img=new ImageIcon(getClass().getResource("/images/Delhi_Metro-1.jpeg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Delhi");
b1=new JButton("Know More");
l1.setBounds(460,130,img.getIconWidth(),img.getIconHeight());
l2.setBounds(570,img.getIconHeight()+160,100,25);
b1.setBounds(650,img.getIconHeight()+160,100,25);
b1.addActionListener(this);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
delhi1 dl1=new delhi1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
dl1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
dl1.setVisible(true);
dl1.setTitle("Delhi");
dl1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
delhi dl=new delhi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
dl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
dl.setVisible(true);
dl.setTitle("Famous Places of Delhi");
dl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 