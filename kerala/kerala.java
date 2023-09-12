package kerala;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class kerala extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
JButton b1,b2,b3,b4,b5,b6;
public kerala()
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
img=new ImageIcon(getClass().getResource("/images/kochi.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Kochi");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/periyar1.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Periyar");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/thiruvananthapuram.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Tiruvananthapuram");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/munnar1.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Munnar");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/varkala1.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Varkala");
b5=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/wayanad1.jpg"));
l11=new JLabel(img);
l11.setIcon(img);
l12=new JLabel("Wayanad");
b6=new JButton("Know More");
l1.setBounds(100,10,300,300);
l2.setBounds(170,280,100,25);b1.setBounds(230,280,100,25);
l3.setBounds(470,10,300,250);l4.setBounds(540,280,100,25);b2.setBounds(620,280,100,25);l5.setBounds(880,15,300,250);l6.setBounds(920,280,100,25);b3.setBounds(1045,280,100,25);l7.setBounds(100,320,300,280);l8.setBounds(160,620,100,25);b4.setBounds(230,620,100,25);l9.setBounds(470,320,300,280);l10.setBounds(550,620,100,25);b5.setBounds(600,620,100,25);l11.setBounds(880,320,300,280);l12.setBounds(950,620,100,25);b6.setBounds(1040,620,100,25);
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
kochi kchi=new kochi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kchi.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kchi.setVisible(true);
kchi.setTitle("Kochi");
kchi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
periyar peryr=new periyar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
peryr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
peryr.setVisible(true);
peryr.setTitle("Periyar");
peryr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
trivandrum trvndm=new trivandrum();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
trvndm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
trvndm.setVisible(true);
trvndm.setTitle("Tiruvananthapuram");
trvndm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
munnar munr=new munnar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
munr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
munr.setVisible(true);
munr.setTitle("Munnar");
munr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
varkala vrkla=new varkala();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
vrkla.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
vrkla.setVisible(true);
vrkla.setTitle("Varkala");
vrkla.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b6)
{
this.dispose();
wayanad wynd=new wayanad();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
wynd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
wynd.setVisible(true);
wynd.setTitle("Wayanad");
wynd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
kerala kerla=new kerala();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kerla.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kerla.setVisible(true);
kerla.setTitle("Famous Places of Kerala");
kerla.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 