import javax.swing.plaf.metal.*;
import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class gallery extends JFrame implements ActionListener
{
JButton b1,b2;
ImageIcon img;
JTextField t1;
JLabel l1;
int i=0;
Font f;
gallery()
{
setLayout(null);
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
t1=new JTextField(50);
b1=new JButton("Previous");
b2=new JButton("Next");
img=new ImageIcon(getClass().getResource("/Images/gallery.jpg"));
f=new Font("Calibri",Font.BOLD,15);
l1=new JLabel(img);
b1.addActionListener(this);
b2.addActionListener(this);
b1.setBounds(150,30,110,25);t1.setBounds(285,30,110,25);
b2.setBounds(420,30,110,25);
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
t1.setText("My Images");
t1.setFont(f);
t1.addActionListener(this);
add(b1);add(t1);add(b2);add(l1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
i--;
}
else if(ae.getSource()==b2)
{
i++;
}
else if(ae.getSource()==t1)
{
char c1,c2;
String s=t1.getText();
c1=s.charAt(0);
if(s.charAt(1)!='/')
{
c2=s.charAt(1);
i=c1-48+c2-39;
if(i>19)
i=i+9;
}
else
{
i=c1-48;
}
}
if(i==36)
i=1;
if(i==0)
i=35;
t1.setText(i+"/35");
switch(i)
{
case 1:
img=new ImageIcon(getClass().getResource("/Images/andaman.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 2:
img=new ImageIcon(getClass().getResource("/Images/hyderabad3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 3:
img=new ImageIcon(getClass().getResource("/Images/itanagar3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 4:
img=new ImageIcon(getClass().getResource("/Images/assam4.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 5:
img=new ImageIcon(getClass().getResource("/Images/bodhgaya3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 6:
img=new ImageIcon(getClass().getResource("/Images/chandigarh3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 7:
img=new ImageIcon(getClass().getResource("/Images/jagdalpur3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 8:
img=new ImageIcon(getClass().getResource("/Images/dadra3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 9:
img=new ImageIcon(getClass().getResource("/Images/diu3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 10:
img=new ImageIcon(getClass().getResource("/Images/GoldenIndiaGatecoolWather.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 11:
img=new ImageIcon(getClass().getResource("/Images/goa3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 12:
img=new ImageIcon(getClass().getResource("/Images/dwarka3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 13:
img=new ImageIcon(getClass().getResource("/Images/kurukshetra2.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 14:
img=new ImageIcon(getClass().getResource("/Images/manali3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 15:
img=new ImageIcon(getClass().getResource("/Images/srinagar1.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 16:
img=new ImageIcon(getClass().getResource("/Images/deoghar3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 17:
img=new ImageIcon(getClass().getResource("/Images/bangalore.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 18:
img=new ImageIcon(getClass().getResource("/Images/varkala3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 19:
img=new ImageIcon(getClass().getResource("/Images/lakshadweep3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 20:
img=new ImageIcon(getClass().getResource("/Images/khajuraho3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 21:
img=new ImageIcon(getClass().getResource("/Images/Mumbai.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 22:
img=new ImageIcon(getClass().getResource("/Images/manipur4.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 23:
img=new ImageIcon(getClass().getResource("/Images/meghalaya4.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 24:
img=new ImageIcon(getClass().getResource("/Images/mizoram3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 25:
img=new ImageIcon(getClass().getResource("/Images/nagaland4.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 26:
img=new ImageIcon(getClass().getResource("/Images/puri3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 27:
img=new ImageIcon(getClass().getResource("/Images/puducherry3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 28:
img=new ImageIcon(getClass().getResource("/Images/amritsar3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 29:
img=new ImageIcon(getClass().getResource("/Images/udaipur3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 30:
img=new ImageIcon(getClass().getResource("/Images/sikkim4.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 31:
img=new ImageIcon(getClass().getResource("/Images/madurai.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 32:
img=new ImageIcon(getClass().getResource("/Images/tripura4.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 33:
img=new ImageIcon(getClass().getResource("/Images/haridwar3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 34:
img=new ImageIcon(getClass().getResource("/Images/agra3.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
case 35:
img=new ImageIcon(getClass().getResource("/Images/howrah-bridge-kolkata.jpg"));
l1.setBounds(150,80,img.getIconWidth(),img.getIconHeight());
l1.setIcon(img);
break;
}
}
public static void main(String args[])
{
gallery galry=new gallery();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
galry.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
galry.setVisible(true);
galry.setTitle("Gallery");
galry.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}