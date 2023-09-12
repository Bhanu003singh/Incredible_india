package odisha;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class odisha extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
JButton b1,b2,b3,b4,b5,b6;
public odisha()
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
img=new ImageIcon(getClass().getResource("/images/bhubaneshwar1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Bhubaneshwar");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/chilkalake1.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Chilika Lake");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/cuttack1.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Cuttack");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/konark1.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Konark");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/puri1.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Puri");
b5=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/similipal1.jpg"));
l11=new JLabel(img);
l11.setIcon(img);
l12=new JLabel("Similipal National Park");
b6=new JButton("Know More");
l1.setBounds(100,10,300,250);
l2.setBounds(150,280,100,25);b1.setBounds(250,280,100,25);
l3.setBounds(470,10,300,250);l4.setBounds(530,280,100,25);b2.setBounds(620,280,100,25);l5.setBounds(880,15,300,240);l6.setBounds(960,280,100,25);b3.setBounds(1020,280,100,25);l7.setBounds(100,320,300,280);l8.setBounds(160,620,100,25);b4.setBounds(230,620,100,25);l9.setBounds(470,320,300,280);l10.setBounds(550,620,100,25);b5.setBounds(600,620,100,25);l11.setBounds(880,320,300,280);l12.setBounds(920,620,100,25);b6.setBounds(1040,620,100,25);
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
bhubaneshwar bbnshwr=new bhubaneshwar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bbnshwr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bbnshwr.setVisible(true);
bbnshwr.setTitle("Bhubaneshwar");
bbnshwr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
chilikalake chlklk=new chilikalake();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chlklk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chlklk.setVisible(true);
chlklk.setTitle("Chilika Lake");
chlklk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
cuttack cutk=new cuttack();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
cutk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
cutk.setVisible(true);
cutk.setTitle("Cuttack");
cutk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
konark knrk=new konark();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
knrk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
knrk.setVisible(true);
knrk.setTitle("Konark");
knrk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
puri pri=new puri();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pri.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pri.setVisible(true);
pri.setTitle("Puri");
pri.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b6)
{
this.dispose();
similipal simlpl=new similipal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
simlpl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
simlpl.setVisible(true);
simlpl.setTitle("Similipal National Park");
simlpl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
odisha odsh=new odisha();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
odsh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
odsh.setVisible(true);
odsh.setTitle("Famous Places of Odisha");
odsh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 