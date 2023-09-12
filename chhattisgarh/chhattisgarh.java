package chhattisgarh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class chhattisgarh extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4;
JButton b1,b2;
public chhattisgarh()
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
img=new ImageIcon(getClass().getResource("/images/raipur1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Raipur");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/jagdalpur1.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Jagdalpur");
b2=new JButton("Know More");
l1.setBounds(250,130,330,330);l2.setBounds(340,480,100,25);b1.setBounds(390,480,100,25);l3.setBounds(750,130,330,330);l4.setBounds(830,480,100,25);b2.setBounds(910,480,100,25);
b1.addActionListener(this);
b2.addActionListener(this);
add(l1);add(l2);add(b1);add(l3);add(l4);add(b2);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
raipur raipr=new raipur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
raipr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
raipr.setVisible(true);
raipr.setTitle("Raipur");
raipr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
jagdalpur jgdlpr=new jagdalpur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jgdlpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jgdlpr.setVisible(true);
jgdlpr.setTitle("Jagdalpur");
jgdlpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
chhattisgarh chtsgrh=new chhattisgarh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chtsgrh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chtsgrh.setVisible(true);
chtsgrh.setTitle("Famous Places of Chhattisgarh");
chtsgrh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 