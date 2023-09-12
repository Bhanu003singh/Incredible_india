package jharkhand;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class jharkhand extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b1,b2,b3,b4,b5;
public jharkhand()
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
img=new ImageIcon(getClass().getResource("/images/deoghar1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Deoghar");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/ranchi1.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Ranchi");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/jamshedpur1.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Jamshedpur");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/dhanbad1.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Dhanbad");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/hazaribagh1.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Hazaribagh");
b5=new JButton("Know More");
l1.setBounds(100,10,300,300);
l2.setBounds(160,320,100,25);b1.setBounds(240,320,100,25);
l3.setBounds(470,10,300,300);l4.setBounds(550,320,100,25);b2.setBounds(620,320,100,25);l5.setBounds(880,10,300,300);l6.setBounds(940,320,100,25);b3.setBounds(1020,320,100,25);l7.setBounds(200,360,300,300);l8.setBounds(530,480,100,25);b4.setBounds(530,510,100,25);l9.setBounds(700,370,300,300);l10.setBounds(1080,480,100,25);b5.setBounds(1080,510,100,25);
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
deoghar deoghr=new deoghar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
deoghr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
deoghr.setVisible(true);
deoghr.setTitle("Deoghar");
deoghr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
ranchi rnchi=new ranchi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
rnchi.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
rnchi.setVisible(true);
rnchi.setTitle("Ranchi");
rnchi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
jamshedpur jmshdpr=new jamshedpur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jmshdpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jmshdpr.setVisible(true);
jmshdpr.setTitle("Jamshedpur");
jmshdpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
dhanbad dhnbd=new dhanbad();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
dhnbd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
dhnbd.setVisible(true);
dhnbd.setTitle("Dhanbad");
dhnbd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
hazaribag hzribg=new hazaribag();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hzribg.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hzribg.setVisible(true);
hzribg.setTitle("Hazaribagh");
hzribg.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
jharkhand jhrknd=new jharkhand();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jhrknd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jhrknd.setVisible(true);
jhrknd.setTitle("Famous Places of Jharkhand");
jhrknd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 