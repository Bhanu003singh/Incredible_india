package tamilnadu;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class madurai extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
madurai()
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
f=new Font("",Font.BOLD,14);
l1=new JLabel("<HTML>Madurai<BR><BR>Fast Facts <BR>Temperature Summer: 37.1 - 25 C Winter: 29 - 20 C <BR>Season Throughout the year <BR>Clothing Tropical <BR>Language spoken Tamil, english, Hindi, Sourashtran <BR>STD Code 0452 Tourism Office Hotel Tamil nadu Complex, West Veli Street, Madurai-1. Tel: 0452 2334757<BR>The oldest existing city in the Indian peninsula and one of the oldest continuously inhabited cities in the world, Madurai is richly steeped in cultural heritage. The city, earlier known as Madhurapuri, grew around a huge temple built by Pandian King Kulasekhara 2,500 years ago. <BR>Madurai became famous during the Sangam period through the third and last conglomeration of Tamil scholars, which existed for more than 100 years. The city was the magnificent capital of Pandya kings and visited by travellers such as Megasthenes (302 BC), Pliny (77 AD), Ptolemy (140 AD), Marco Polo (1203 AD) and Ibu Batuta (1333 AD). Today, Madurai is synonymous with the awe-inspiring Meenakshi-Sundareswarar Temple.</HTML>");
img=new ImageIcon(getClass().getResource("/images/madurai.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+20,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
tamilnadu tn=new tamilnadu();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
tn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
tn.setVisible(true);
tn.setTitle("Famous Places of Tamil Nadu");
tn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
madurai mdrai=new madurai();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mdrai.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mdrai.setVisible(true);
mdrai.setTitle("Madurai");
mdrai.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
