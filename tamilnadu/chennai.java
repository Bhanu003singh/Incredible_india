package tamilnadu;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class chennai extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
chennai()
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
l1=new JLabel("<HTML>Chennai<BR><BR>Fast Facts <BR>Temperature: Summer: 36.4 C - 27.6 C Winter: 27 C - 15.10 C <BR>Season: December and January <BR>Average Precipitation: 1,300 cm <BR>Language spoken: Tamil, Hindi, Englis <BR>STD Code: 044 Tourism Office: India Tourism, Regional Tourist Office, 154, Anna Salai, Chennai 600002. <BR>Tel: 044 28461459, 28460285, Fax: 044 28460193, E-mail : indtour@dataone.in<BR>This metropolis is often called the ‘Cultural Capital of India’ for its deep-rooted traditions and age-old heritage. A city younger than its image, Chennai has blossomed into a charming city within a span of just over 350 years. <BR>The city gained recognition when, in 1639, Francis Day and Andrew Cogan, agents of the English East India Company, acquired a strip of land, called Chennapatnam on lease from the Vijayanagar King. Fort St. George that serves as the Government Secretariat today was built to set up a factory serving as a nucleus for British settlements. <BR>The city was known as Madras till 1996 and later renamed Chennai. Today this buoyant metropolis is a blend of the old and the new, the traditional and the modern. Spread over 200 sq km with the Bay of Bengal on the east, the city is the gateway to the rest of South India.</HTML>");
img=new ImageIcon(getClass().getResource("/images/chennai.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+10,1200,350);
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
chennai chn=new chennai();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chn.setVisible(true);
chn.setTitle("Chennai");
chn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
