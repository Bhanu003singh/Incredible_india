package punjab;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class punjab extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b1,b2,b3,b4,b5;
public punjab()
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
img=new ImageIcon(getClass().getResource("/images/amritsar1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Amritsar");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/anandpursahib.jpeg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Anandpur Sahib");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/baghaborder.jpeg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Bagha Border");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/ludhiana1.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Ludhiana");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/sheeshmahal1.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Sheesh Mahal");
b5=new JButton("Know More");
l1.setBounds(30,20,300,300);
l2.setBounds(100,320,100,25);b1.setBounds(150,320,100,25);
l3.setBounds(400,20,300,300);l4.setBounds(440,320,100,25);b2.setBounds(550,320,100,25);l5.setBounds(820,10,300,300);l6.setBounds(880,320,100,25);b3.setBounds(960,320,100,25);l7.setBounds(150,360,300,350);l8.setBounds(480,480,100,25);b4.setBounds(480,510,100,25);l9.setBounds(650,370,350,300);l10.setBounds(1030,480,100,25);b5.setBounds(1030,510,100,25);
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
amritsar amrt=new amritsar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
amrt.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
amrt.setVisible(true);
amrt.setTitle("Amritsar");
amrt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
anandpursahib apsb=new anandpursahib();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
apsb.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
apsb.setVisible(true);
apsb.setTitle("Anandpur Sahib");
apsb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
baghaborder bgbrdr=new baghaborder();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bgbrdr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bgbrdr.setVisible(true);
bgbrdr.setTitle("Bagha Border");
bgbrdr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
ludhiana ldhna=new ludhiana();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ldhna.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ldhna.setVisible(true);
ldhna.setTitle("Ludhiana");
ldhna.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
sheeshmahal shsmhl=new sheeshmahal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
shsmhl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
shsmhl.setVisible(true);
shsmhl.setTitle("Sheesh Mahal");
shsmhl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
punjab pnjb=new punjab();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pnjb.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pnjb.setVisible(true);
pnjb.setTitle("Famous Places of Punjab");
pnjb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 