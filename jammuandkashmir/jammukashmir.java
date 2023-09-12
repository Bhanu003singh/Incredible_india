package jammuandkashmir;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class jammukashmir extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
JButton b1,b2,b3,b4,b5,b6;
public jammukashmir()
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
img=new ImageIcon(getClass().getResource("/images/gulmarg1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Gulmarg");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/intro-PATNITOP.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Patnitop");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/katra-jammu.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Jammu");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/ladakh1.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Ladakh");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/lidder_river.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Pahalgam");
b5=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/srinagar-shikaras.jpg"));
l11=new JLabel(img);
l11.setIcon(img);
l12=new JLabel("Srinagar");
b6=new JButton("Know More");
l1.setBounds(30,10,300,300);
l2.setBounds(100,280,100,25);b1.setBounds(160,280,100,25);
l3.setBounds(400,10,300,300);l4.setBounds(460,280,100,25);b2.setBounds(530,280,100,25);l5.setBounds(810,15,300,240);l6.setBounds(890,280,100,25);b3.setBounds(940,280,100,25);l7.setBounds(30,320,300,280);l8.setBounds(100,620,100,25);b4.setBounds(150,620,100,25);l9.setBounds(400,320,300,280);l10.setBounds(450,620,100,25);b5.setBounds(520,620,100,25);l11.setBounds(810,320,300,320);l12.setBounds(870,620,100,25);b6.setBounds(940,620,100,25);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
add(l1);add(l2);add(b1);add(l3);add(l4);add(b2);add(l5);add(l6);add(b3);add(l7);add(l8);add(b4);add(l9);add(l10);add(b5);
add(l11);add(l12);add(b6);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
gulmarg glmrg=new gulmarg();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
glmrg.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
glmrg.setVisible(true);
glmrg.setTitle("Gulmarg");
glmrg.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
patnitop pt=new patnitop();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pt.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pt.setVisible(true);
pt.setTitle("Patnitop");
pt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
jammu jmu=new jammu();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jmu.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jmu.setVisible(true);
jmu.setTitle("Jammu");
jmu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
leh lh=new leh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
lh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
lh.setVisible(true);
lh.setTitle("Leh-Ladakh");
lh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
pahalgam phlgm=new pahalgam();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
phlgm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
phlgm.setVisible(true);
phlgm.setTitle("Pahalgam");
phlgm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b6)
{
this.dispose();
srinagar sri=new srinagar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
sri.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
sri.setVisible(true);
sri.setTitle("Srinagar");
sri.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
jammukashmir jk=new jammukashmir();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jk.setVisible(true);
jk.setTitle("Famous Places of Jammu & Kashmir");
jk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 