package tamilnadu;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class rameswaram extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
rameswaram()
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
l1=new JLabel("<HTML>Rameswaram<BR><BR>Fast Facts <BR>Temperature: Summer: 38 - 30 C Winter: 30 -25 C <BR>Season: Through out the year <BR>Clothing: Tropical <BR>Language spoken: Tamil, Hindi and English <BR>STD Code: 04573 Tourism Office: Bus Stand Complex, Rameswaram 623526 Tel: 04573 221371 <BR>Rameswaram, the holy island in the Gulf of Mannar, is a major pilgrim centre of the country. Rameswaram is hallowed by the epic Ramayana. It is believed that Lord Rama sanctified this place by worshipping Lord Shiva here after the war against Ravana of Sri Lanka. <BR>Therefore, it is held sacred by both Vishnu and Shiva devotees. It is one of the 12 Jyothirlinga shrines (where Lord Shiva is worshipped as a ‘Lingam (pillar) of light’) of India. A devout Hindu who visits Varanasi in the North must also visit Rameswaram for the culmination of his quest for salvation.</HTML>");
img=new ImageIcon(getClass().getResource("/images/rameswaram.jpg"));
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
rameswaram rmswrm=new rameswaram();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
rmswrm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
rmswrm.setVisible(true);
rmswrm.setTitle("Rameswaram");
rmswrm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
