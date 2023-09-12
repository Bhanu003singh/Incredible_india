package uttarakhand;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class uttarakhand extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b1,b2,b3,b4,b5;
public uttarakhand()
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
img=new ImageIcon(getClass().getResource("/images/dehradun1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Dehradun");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/haridwar1.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Haridwar");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/rafting1.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Rishikesh");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/mussoorie1.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Mussoorie");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/Nainital1.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Nainital");
b5=new JButton("Know More");
l1.setBounds(100,20,300,300);
l2.setBounds(150,340,100,25);b1.setBounds(220,340,100,25);
l3.setBounds(530,20,300,300);l4.setBounds(600,340,100,25);b2.setBounds(680,340,100,25);l5.setBounds(940,20,300,300);l6.setBounds(1010,340,100,25);b3.setBounds(1080,340,100,25);l7.setBounds(200,360,300,350);l8.setBounds(530,480,100,25);b4.setBounds(530,510,100,25);l9.setBounds(720,390,300,300);l10.setBounds(1080,480,100,25);b5.setBounds(1080,510,100,25);
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
dehradun ddn=new dehradun();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ddn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ddn.setVisible(true);
ddn.setTitle("Dehradun");
ddn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
haridwar hdwr=new haridwar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hdwr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hdwr.setVisible(true);
hdwr.setTitle("Haridwar");
hdwr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
rishikesh rsksh=new rishikesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
rsksh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
rsksh.setVisible(true);
rsksh.setTitle("Rishikesh");
rsksh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
mussoorie musr=new mussoorie();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
musr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
musr.setVisible(true);
musr.setTitle("Mussoorie");
musr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
nainital nntl=new nainital();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
nntl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
nntl.setVisible(true);
nntl.setTitle("Nainital");
nntl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
uttarakhand uk=new uttarakhand();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
uk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
uk.setVisible(true);
uk.setTitle("Famous Places of Uttarakhand");
uk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 