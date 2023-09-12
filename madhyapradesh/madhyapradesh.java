package madhyapradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class madhyapradesh extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b1,b2,b3,b4,b5;
public madhyapradesh()
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
img=new ImageIcon(getClass().getResource("/images/gwalior.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Gwalior");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/kanha1.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Kanha National Park");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/khajuraho1.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Khajuraho");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/sanchi1.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Sanchi");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/ujjain1.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Ujjain");
b5=new JButton("Know More");
l1.setBounds(100,20,300,300);
l2.setBounds(150,320,100,25);b1.setBounds(200,320,100,25);
l3.setBounds(470,20,300,280);l4.setBounds(530,320,100,25);b2.setBounds(620,320,100,25);l5.setBounds(880,10,300,300);l6.setBounds(960,320,100,25);b3.setBounds(1020,320,100,25);l7.setBounds(200,360,300,350);l8.setBounds(530,480,100,25);b4.setBounds(530,510,100,25);l9.setBounds(700,370,350,300);l10.setBounds(1080,480,100,25);b5.setBounds(1080,510,100,25);
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
gwalior gwlr=new gwalior();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
gwlr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
gwlr.setVisible(true);
gwlr.setTitle("Gwalior");
gwlr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
kanha knha=new kanha();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
knha.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
knha.setVisible(true);
knha.setTitle("Kanha National Park");
knha.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
khajuraho khjrho=new khajuraho();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
khjrho.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
khjrho.setVisible(true);
khjrho.setTitle("Khajuraho");
khjrho.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
sanchi snch=new sanchi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
snch.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
snch.setVisible(true);
snch.setTitle("Sanchi");
snch.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
ujjain ujjn=new ujjain();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ujjn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ujjn.setVisible(true);
ujjn.setTitle("Ujjain");
ujjn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
madhyapradesh mp=new madhyapradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mp.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mp.setVisible(true);
mp.setTitle("Famous Places of Madhya Pradesh");
mp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 