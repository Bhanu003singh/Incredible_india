package punjab;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class anandpursahib extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
anandpursahib()
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
l1=new JLabel("<HTML>Anandpur Sahib<BR><BR>Anandpur Sahib town, which is believed to have been founded by Guru Teg Bahadur, is situated near Rupnagar town. Gurudwara Keshgarh Sahib at the town is considered as the birthplace of Khalsa. Counted as one of the five holy seats of Sikhism, the site has religious significance for Sikhs.<BR>Gurudwara Anandgarh Sahib, Gurudwara Sis Ganj, Gurudwara Keshgarh Sahib, Gurudwara Bhora Sahib, Gurudwara Manji Sahib and Gurudwara Mai Jito are the notable Sikh shrines in this town.Holla Mohalla festival is celebrated with fanfare in this town. Apart from gurudwaras, Guru Teg Bahadur Museum and Sri Dashmesh Academy are other attractions in Anandpur Sahib.</HTML>");
img=new ImageIcon(getClass().getResource("/images/anandpursahib.jpeg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+50,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
punjab pnjb=new punjab();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pnjb.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pnjb.setVisible(true);
pnjb.setTitle("Famous Places of Punjab");
pnjb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
anandpursahib apsb=new anandpursahib();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
apsb.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
apsb.setVisible(true);
apsb.setTitle("Anandpur Sahib");
apsb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
