package haryana;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class haryana extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b1,b2,b3,b4,b5;
public haryana()
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
img=new ImageIcon(getClass().getResource("/images/gurgaon1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Gurgaon");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/yamunanagar.jpeg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Yamunanagar & Jagadhri");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/kurukshetra1.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Kurukshetra");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/faridabad1.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Faridabad");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/panchkula1.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Panchkula");
b5=new JButton("Know More");
l1.setBounds(100,10,300,300);
l2.setBounds(160,320,100,25);b1.setBounds(240,320,100,25);
l3.setBounds(470,10,300,300);l4.setBounds(500,320,220,25);b2.setBounds(650,320,100,25);l5.setBounds(880,10,300,300);l6.setBounds(940,320,100,25);b3.setBounds(1020,320,100,25);l7.setBounds(200,360,300,300);l8.setBounds(530,480,100,25);b4.setBounds(530,510,100,25);l9.setBounds(700,370,300,300);l10.setBounds(1080,480,100,25);b5.setBounds(1080,510,100,25);
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
gurgaon grgaon=new gurgaon();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
grgaon.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
grgaon.setVisible(true);
grgaon.setTitle("Gurgaon");
grgaon.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
yamunanagar ynr=new yamunanagar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ynr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ynr.setVisible(true);
ynr.setTitle("Yamunanagar & Jagadhri");
ynr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
kurukshetra kkr=new kurukshetra();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kkr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kkr.setVisible(true);
kkr.setTitle("Kurukshetra");
kkr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
faridabad frdbd=new faridabad();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
frdbd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
frdbd.setVisible(true);
frdbd.setTitle("Faridabad");
frdbd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
panchkula pnchkla=new panchkula();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pnchkla.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pnchkla.setVisible(true);
pnchkla.setTitle("Panchkula");
pnchkla.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
haryana hryna=new haryana();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hryna.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hryna.setVisible(true);
hryna.setTitle("Famous Places of Haryana");
hryna.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 