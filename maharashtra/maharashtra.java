package maharashtra;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class maharashtra extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b1,b2,b3,b4,b5;
public maharashtra()
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
img=new ImageIcon(getClass().getResource("/images/ashtavinayak.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Ashtavinayak");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/Mumbai.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Mumbai");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/nagpur.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Nagpur");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/nashik.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Nashik");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/Shirdi.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Shirdi");
b5=new JButton("Know More");
l1.setBounds(100,20,300,300);
l2.setBounds(140,340,100,25);b1.setBounds(240,340,100,25);
l3.setBounds(500,20,300,300);l4.setBounds(560,340,100,25);b2.setBounds(620,340,100,25);l5.setBounds(900,10,300,300);l6.setBounds(970,340,100,25);b3.setBounds(1040,340,100,25);l7.setBounds(190,360,300,350);l8.setBounds(520,480,100,25);b4.setBounds(520,510,100,25);l9.setBounds(740,370,350,300);l10.setBounds(1180,480,100,25);b5.setBounds(1180,510,100,25);
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
ashtavinayak astv=new ashtavinayak();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
astv.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
astv.setVisible(true);
astv.setTitle("Ashtavinayak");
astv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
mumbai mum=new mumbai();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mum.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mum.setVisible(true);
mum.setTitle("Mumbai");
mum.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
nagpur ngpr=new nagpur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ngpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ngpr.setVisible(true);
ngpr.setTitle("Nagpur");
ngpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
nashik nsk=new nashik();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
nsk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
nsk.setVisible(true);
nsk.setTitle("Nashik");
nsk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
shirdi shd=new shirdi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
shd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
shd.setVisible(true);
shd.setTitle("Shirdi");
shd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
maharashtra mh=new maharashtra();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mh.setVisible(true);
mh.setTitle("Famous Places of Maharashtra");
mh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 