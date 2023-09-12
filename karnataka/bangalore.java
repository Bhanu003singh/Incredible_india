package karnataka;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class bangalore extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
bangalore()
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
l1=new JLabel("<HTML>Bangalore<BR><BR>Fast Facts <BR>Area 366 Sq.Km <BR>Temperature Summer: 35 -21 C Winter: 28-15C <BR>Season Throughout the year, though September to March is the best time to visit. <BR>STD Code 080 <BR>Tourist Centers: India tourism KFC Bldg 48 Church Street Bengaluru. <BR>Tel: 080 25585417, 25321683, 25583030, Fax: 25585417<BR>Capital of Karnataka State Bengaluru also known as the City of Gardens is one of the most attractive cities in India with its beautiful parks avenues and impressive buildings. The once sedate cantonment settlement of the British has now spread way beyond the mud fort and the four towers constructed by Kempe Gowda in 1537. With its booming economy and racy lifestyle the capital of Karnataka has metamorphosed from a sleepy Garden City into one of Indias fastest growing accommodating technophiliac and cosmopolitan cities. Bangalore is a city of contrasts going by several other aliases India's Silicon Valley Pub City Shoppers Paradise Garden City Air-conditioned City Gourmet's Delight Pub Hoppers Paradise and Shopper's Hot Spot. Surrounded by weekend getaways Bangalore makes an ideal hub for visitors who want to travel to the many hill stations and coastal towns of South India.</HTML>");
img=new ImageIcon(getClass().getResource("/images/bangalore2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
karnataka kntk=new karnataka();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kntk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kntk.setVisible(true);
kntk.setTitle("Famous Places of Karnataka");
kntk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
bangalore bnglr=new bangalore();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bnglr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bnglr.setVisible(true);
bnglr.setTitle("Bangalore");
bnglr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
