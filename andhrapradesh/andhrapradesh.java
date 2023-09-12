package andhrapradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class andhrapradesh extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b1,b2,b3,b4,b5;
public andhrapradesh()
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
img=new ImageIcon(getClass().getResource("/images/hyderabad1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Hyderabad");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/tirupati1.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Tirupati");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/vizag1.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Vishakhapatnam");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/vijaywada1.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Vijaywada");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/warangal1.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Warangal");
b5=new JButton("Know More");
l1.setBounds(100,10,300,300);
l2.setBounds(160,320,100,25);b1.setBounds(240,320,100,25);
l3.setBounds(470,10,300,300);l4.setBounds(550,320,100,25);b2.setBounds(620,320,100,25);l5.setBounds(880,10,300,300);l6.setBounds(920,320,100,25);b3.setBounds(1050,320,100,25);l7.setBounds(200,360,300,300);l8.setBounds(480,480,100,25);b4.setBounds(480,510,100,25);l9.setBounds(700,370,300,300);l10.setBounds(970,480,100,25);b5.setBounds(970,510,100,25);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
add(l1);add(l2);add(b1);add(l3);add(l4);add(b2);add(l5);add(l6);add(b3);add(l7);add(l8);add(b4);add(l9);add(l10);add(b5);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
hyderabad hydrbd=new hyderabad();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hydrbd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hydrbd.setVisible(true);
hydrbd.setTitle("Hyderabad");
hydrbd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
tirupati tiru=new tirupati();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
tiru.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
tiru.setVisible(true);
tiru.setTitle("Tirupati");
tiru.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
vizag vizg=new vizag();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
vizg.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
vizg.setVisible(true);
vizg.setTitle("Vishakhapatnam");
vizg.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
vijaywada vijywd=new vijaywada();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
vijywd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
vijywd.setVisible(true);
vijywd.setTitle("Vijaywada");
vijywd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
warangal wrngl=new warangal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
wrngl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
wrngl.setVisible(true);
wrngl.setTitle("Warangal");
wrngl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
andhrapradesh ap=new andhrapradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ap.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ap.setVisible(true);
ap.setTitle("Famous Places of Andhra Pradesh");
ap.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 