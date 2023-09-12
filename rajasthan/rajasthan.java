package rajasthan;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class rajasthan extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
JButton b1,b2,b3,b4,b5,b6;
public rajasthan()
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
img=new ImageIcon(getClass().getResource("/images/ajmer1.jpg"));
l1=new JLabel(img);
l1.setIcon(img);
l2=new JLabel("Ajmer");
b1=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/bikaner1.jpg"));
l3=new JLabel(img);
l3.setIcon(img);
l4=new JLabel("Bikaner");
b2=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/jaipur1.jpg"));
l5=new JLabel(img);
l5.setIcon(img);
l6=new JLabel("Jaipur");
b3=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/jaisalmer1.jpg"));
l7=new JLabel(img);
l7.setIcon(img);
l8=new JLabel("Jaisalmer");
b4=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/jodhpur1.jpg"));
l9=new JLabel(img);
l9.setIcon(img);
l10=new JLabel("Jodhpur");
b5=new JButton("Know More");
img=new ImageIcon(getClass().getResource("/images/udaipur1.jpg"));
l11=new JLabel(img);
l11.setIcon(img);
l12=new JLabel("Udaipur");
b6=new JButton("Know More");
l1.setBounds(100,10,300,250);
l2.setBounds(170,280,100,25);b1.setBounds(230,280,100,25);
l3.setBounds(470,10,300,250);l4.setBounds(530,280,100,25);b2.setBounds(600,280,100,25);l5.setBounds(880,15,300,240);l6.setBounds(960,280,100,25);b3.setBounds(1020,280,100,25);l7.setBounds(100,320,300,280);l8.setBounds(130,620,100,25);b4.setBounds(230,620,100,25);l9.setBounds(470,320,300,280);l10.setBounds(520,620,100,25);b5.setBounds(600,620,100,25);l11.setBounds(880,320,300,280);l12.setBounds(950,620,100,25);b6.setBounds(1020,620,100,25);
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
ajmer ajmr=new ajmer();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ajmr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ajmr.setVisible(true);
ajmr.setTitle("Ajmer");
ajmr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b2)
{
this.dispose();
bikaner bknr=new bikaner();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bknr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bknr.setVisible(true);
bknr.setTitle("Bikaner");
bknr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b3)
{
this.dispose();
jaipur jpr=new jaipur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jpr.setVisible(true);
jpr.setTitle("Jaipur");
jpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b4)
{
this.dispose();
jaisalmer jslmr=new jaisalmer();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jslmr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jslmr.setVisible(true);
jslmr.setTitle("Jaisalmer");
jslmr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b5)
{
this.dispose();
jodhpur jdhpr=new jodhpur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jdhpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jdhpr.setVisible(true);
jdhpr.setTitle("Jodhpur");
jdhpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ae.getSource()==b6)
{
this.dispose();
udaipur udpr=new udaipur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
udpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
udpr.setVisible(true);
udpr.setTitle("Udaipur");
udpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
rajasthan rjsthn=new rajasthan();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
rjsthn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
rjsthn.setVisible(true);
rjsthn.setTitle("Famous Places of Rajasthan");
rjsthn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
} 