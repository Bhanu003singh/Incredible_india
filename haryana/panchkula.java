package haryana;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class panchkula extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
panchkula()
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
f=new Font("",Font.BOLD,13);
l1=new JLabel("<HTML>Panchkula<BR><BR>Panchkula is a planned city in Panchkula district, Haryana, India. It is a satellite city of the Union Territory of Chandigarh. It also shares seamless border with Mohali district in Punjab. There are five census-towns in the Panchkula district, Pinjore, Kalka, Barwala, Panchkula and Raipur Rani. Morni is the only Hill station in Haryana. The estimated population of Panchkula in 2006, was 200,000. Panchkula and Mohali (in Punjab) are two satellite cities of Chandigarh. These three cities are collectively known as Chandigarh Tricity.<BR>The origin of the name Panchkula is based on the five irrigation canals (or kuls as they were called, making it Panch Kul of five canals) that take water from the Ghaggar in the uphill section and distribute it from Nada Sahib to Mansa Devi. The Nada canal has now been eroded by the river and most of the kul's pass through the cantonement of Chandimandir towards Mansa Devi.<BR>Panchkula is surrounded by Himachal Pradesh in the north and east, Punjab and Union Territory of Chandigarh in the west and by Ambala district in the south as well as east. Panchkula district shares its borders with Chandigarh, Mohali, Solan and Ambala districts.</HTML>");
img=new ImageIcon(getClass().getResource("/images/panchkula2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+30,1200,420);
l2.setBounds(450,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+80,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
haryana hryna=new haryana();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hryna.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hryna.setVisible(true);
hryna.setTitle("Famous Places of Haryana");
hryna.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
panchkula pnchkla=new panchkula();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pnchkla.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pnchkla.setVisible(true);
pnchkla.setTitle("Panchkula");
pnchkla.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
