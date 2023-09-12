package westbengal;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class westbengal extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b1,b2,b3,b4,b5;
public westbengal()
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
img=new ImageIcon(getClass().getResource("/images/Kolkata_Imgs.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Kolkata");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/darjeeling1.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Darjeeling");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/digha1.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Digha");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/Shantiniketan.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Shantiniketan");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/sunderbans1.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Sunderbans");
b5=new JButton("Know More");
l1.setBounds(80,20,300,300);
l2.setBounds(150,320,100,25);b1.setBounds(200,320,100,25);
l3.setBounds(450,20,300,300);l4.setBounds(510,320,100,25);b2.setBounds(580,320,100,25);l5.setBounds(870,10,300,300);l6.setBounds(940,320,100,25);b3.setBounds(990,320,100,25);l7.setBounds(200,360,300,350);l8.setBounds(530,480,100,25);b4.setBounds(530,510,100,25);l9.setBounds(700,370,350,300);l10.setBounds(1080,480,100,25);b5.setBounds(1080,510,100,25);
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
kolkata kolk=new kolkata();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kolk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kolk.setVisible(true);
kolk.setTitle("Kolkata");
kolk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
darjeeling drjlng=new darjeeling();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
drjlng.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
drjlng.setVisible(true);
drjlng.setTitle("Darjeeling");
drjlng.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
digha dgh=new digha();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
dgh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
dgh.setVisible(true);
dgh.setTitle("Digha");
dgh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
shantiniketan shnt=new shantiniketan();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
shnt.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
shnt.setVisible(true);
shnt.setTitle("Shantiniketan");
shnt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
sunderbans sndr=new sunderbans();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
sndr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
sndr.setVisible(true);
sndr.setTitle("Sunderbans");
sndr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
westbengal wb=new westbengal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
wb.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
wb.setVisible(true);
wb.setTitle("Famous Places of West Bengal");
wb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 