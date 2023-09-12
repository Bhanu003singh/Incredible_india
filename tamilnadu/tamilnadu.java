package tamilnadu;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class tamilnadu extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
JButton b1,b2,b3,b4,b5,b6;
public tamilnadu()
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
img=new ImageIcon(getClass().getResource("/images/chennai.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Chennai");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/chidambaram.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Chidambram");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/coimbatore.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Coimbatore");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/madurai.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Madurai");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/ooty.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Ooty");
b5=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/rameswaram.jpg"));
l11=new JLabel(img);
l11.setIcon(img);
l12=new JLabel("Rameswaram");
b6=new JButton("Know More");
l1.setBounds(100,10,300,250);
l2.setBounds(170,280,100,25);b1.setBounds(230,280,100,25);
l3.setBounds(470,10,300,250);l4.setBounds(530,280,100,25);b2.setBounds(630,280,100,25);l5.setBounds(880,15,300,240);l6.setBounds(930,280,100,25);b3.setBounds(1020,280,100,25);l7.setBounds(100,320,300,280);l8.setBounds(170,620,100,25);b4.setBounds(230,620,100,25);l9.setBounds(470,320,300,280);l10.setBounds(550,620,100,25);b5.setBounds(600,620,100,25);l11.setBounds(880,320,300,280);l12.setBounds(930,620,100,25);b6.setBounds(1020,620,100,25);
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
chennai chn=new chennai();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chn.setVisible(true);
chn.setTitle("Chennai");
chn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
chidambram chdmbrm=new chidambram();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chdmbrm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chdmbrm.setVisible(true);
chdmbrm.setTitle("Chidambram");
chdmbrm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
coimbatore cmbtr=new coimbatore();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
cmbtr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
cmbtr.setVisible(true);
cmbtr.setTitle("Coimbatore");
cmbtr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
madurai mdrai=new madurai();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mdrai.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mdrai.setVisible(true);
mdrai.setTitle("Madurai");
mdrai.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
ooty oty=new ooty();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
oty.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
oty.setVisible(true);
oty.setTitle("Ooty");
oty.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b6)
{
this.dispose();
rameswaram rmswrm=new rameswaram();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
rmswrm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
rmswrm.setVisible(true);
rmswrm.setTitle("Rameswaram");
rmswrm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
tamilnadu tn=new tamilnadu();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
tn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
tn.setVisible(true);
tn.setTitle("Famous Places of Tamil Nadu");
tn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 