package chandigarh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class chandigarh extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2;
JButton b1;
public chandigarh()
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
img=new ImageIcon(getClass().getResource("/images/chandigarh.jpeg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Chandigarh");
b1=new JButton("Know More");
l1.setBounds(540,130,img.getIconWidth(),img.getIconHeight());
l2.setBounds(580,img.getIconHeight()+180,100,25);
b1.setBounds(650,img.getIconHeight()+180,100,25);
b1.addActionListener(this);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
chandigarh1 chndgrh=new chandigarh1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chndgrh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chndgrh.setVisible(true);
chndgrh.setTitle("Chandigarh");
chndgrh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
chandigarh chd=new chandigarh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chd.setVisible(true);
chd.setTitle("Famous Places of Chandigarh");
chd .setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 