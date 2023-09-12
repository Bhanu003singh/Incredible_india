package bihar;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class bihar extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b1,b2,b3,b4,b5;
public bihar()
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
img=new ImageIcon(getClass().getResource("/images/patna1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Patna");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/bodhgaya1.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Bodhgaya");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/nalanda1.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Nalanda");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/vaishali1.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Vaishali");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/sonepurfair1.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Sonepur Fair");
b5=new JButton("Know More");
l1.setBounds(130,10,300,300);
l2.setBounds(190,320,100,25);b1.setBounds(270,320,100,25);
l3.setBounds(520,10,300,300);l4.setBounds(580,320,100,25);b2.setBounds(650,320,100,25);l5.setBounds(900,10,300,300);l6.setBounds(960,320,100,25);b3.setBounds(1040,320,100,25);l7.setBounds(200,360,300,300);l8.setBounds(530,480,100,25);b4.setBounds(530,510,100,25);l9.setBounds(720,370,300,300);l10.setBounds(1080,480,100,25);b5.setBounds(1080,510,100,25);
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
patna ptna=new patna();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ptna.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ptna.setVisible(true);
ptna.setTitle("Patna");
ptna.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
bodhgaya bdhgya=new bodhgaya();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bdhgya.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bdhgya.setVisible(true);
bdhgya.setTitle("Bodhgaya");
bdhgya.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
nalanda nlnda=new nalanda();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
nlnda.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
nlnda.setVisible(true);
nlnda.setTitle("Nalanda");
nlnda.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
vaishali vshli=new vaishali();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
vshli.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
vshli.setVisible(true);
vshli.setTitle("Vaishali");
vshli.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
sonepur sonpr=new sonepur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
sonpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
sonpr.setVisible(true);
sonpr.setTitle("Sonepur");
sonpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
bihar bihr=new bihar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bihr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bihr.setVisible(true);
bihr.setTitle("Famous Places of Bihar");
bihr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 