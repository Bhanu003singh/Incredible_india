package karnataka;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class karnataka extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b1,b2,b3,b4,b5;
public karnataka()
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
img=new ImageIcon(getClass().getResource("/images/bangalore1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Bangalore");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/hampi1.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Hampi");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/mangalore1.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Mangalore");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/mysore1.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Mysore");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/udupi1.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Udupi");
b5=new JButton("Know More");
l1.setBounds(100,20,300,300);
l2.setBounds(160,320,100,25);b1.setBounds(240,320,100,25);
l3.setBounds(470,20,300,280);l4.setBounds(550,320,100,25);b2.setBounds(620,320,100,25);l5.setBounds(880,10,300,300);l6.setBounds(940,320,100,25);b3.setBounds(1020,320,100,25);l7.setBounds(200,360,300,350);l8.setBounds(530,480,100,25);b4.setBounds(530,510,100,25);l9.setBounds(700,370,350,300);l10.setBounds(1080,480,100,25);b5.setBounds(1080,510,100,25);
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
bangalore bnglr=new bangalore();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bnglr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bnglr.setVisible(true);
bnglr.setTitle("Bangalore");
bnglr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
hampi hmpi=new hampi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hmpi.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hmpi.setVisible(true);
hmpi.setTitle("Hampi");
hmpi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
mangalore mnglr=new mangalore();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mnglr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mnglr.setVisible(true);
mnglr.setTitle("Mangalore");
mnglr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
mysore mysr=new mysore();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mysr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mysr.setVisible(true);
mysr.setTitle("Mysore");
mysr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
udupi udpi=new udupi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
udpi.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
udpi.setVisible(true);
udpi.setTitle("Udupi");
udpi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
karnataka kntk=new karnataka();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kntk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kntk.setVisible(true);
kntk.setTitle("Famous Places of Karnataka");
kntk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 