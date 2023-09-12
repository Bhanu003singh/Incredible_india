package uttarpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class uttarpradesh extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b1,b2,b3,b4,b5;
public uttarpradesh()
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
img=new ImageIcon(getClass().getResource("/images/agra1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Agra");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/allahabad1.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Allahabad");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/kanpur1.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Kanpur");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/lucknow1.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Lucknow");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/varanasi1.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Varanasi");
b5=new JButton("Know More");
l1.setBounds(60,20,300,300);
l2.setBounds(110,340,100,25);b1.setBounds(180,340,100,25);
l3.setBounds(430,20,300,300);l4.setBounds(490,340,100,25);b2.setBounds(560,340,100,25);l5.setBounds(850,10,300,300);l6.setBounds(920,340,100,25);b3.setBounds(990,340,100,25);l7.setBounds(150,360,300,350);l8.setBounds(480,480,100,25);b4.setBounds(480,510,100,25);l9.setBounds(650,370,350,300);l10.setBounds(1030,480,100,25);b5.setBounds(1030,510,100,25);
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
agra agr=new agra();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
agr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
agr.setVisible(true);
agr.setTitle("Agra");
agr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
allahabad alhbd=new allahabad();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
alhbd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
alhbd.setVisible(true);
alhbd.setTitle("Allahabad");
alhbd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
kanpur knpr=new kanpur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
knpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
knpr.setVisible(true);
knpr.setTitle("Kanpur");
knpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
lucknow lknw=new lucknow();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
lknw.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
lknw.setVisible(true);
lknw.setTitle("Lucknow");
lknw.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
varanasi vrnsi=new varanasi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
vrnsi.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
vrnsi.setVisible(true);
vrnsi.setTitle("Varanasi");
vrnsi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
uttarpradesh up=new uttarpradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
up.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
up.setVisible(true);
up.setTitle("Famous Places of Uttar Pradesh");
up.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 