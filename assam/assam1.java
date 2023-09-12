package assam;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class assam1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
assam1()
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
l1=new JLabel("<HTML>Assam<BR><BR>Fast Facts <BR>Area : 78,438 sq km Population: 26,638,407 <BR>Season: October to May Capital: Dispur (Guwahati)<BR>Best time to visit: October to May Principal Languages: Assamese, English and Hindi <BR>STD CODE:0361 Tour Operators Assam Tourism Development Corporation (ATDC), Tel: 0361 2633654, conducts many different tours for the Guwahati city and different parks and to the nearby places. Please visit www.assamtourismonline.com for more information on ATDC accommodations and different tour options and excursions and www.assamtourism.org for information on Assam Tourism, Tel: (0361) 2547102 <BR>Assam is a state of breath-taking scenic beauty, rarest flora and fauna, vast rolling plain, mighty waterways and a land of fairs and festivals. It shares its borders in the North and East with the Kingdom of Bhutan and Arunachal Pradesh. Along the south lie Nagaland, Manipur and Mizoram. Meghalaya lies to her South-West, Bengal and Bangladesh to her West. Assam has many fascinating aspects to experience, including the Kaziranga National Park, home to the world famous and rare one horned rhinoceros, the remarkable Majuliisland, ancient Ahom architectural marvels and numerous Golf courses backed by beautiful heritage/luxury resorts and colonial tea bungalows. Renowned for its tea, rich flora and fauna and other rare species of wildlife on the verge of extinction, there is perhaps no part of the world where such a variety of wildlife exists barring Africa. </HTML>");
img=new ImageIcon(getClass().getResource("/images/assam2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,310);
l2.setBounds(380,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
assam assm=new assam();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
assm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
assm.setVisible(true);
assm.setTitle("Assam");
assm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
assam1 assm1=new assam1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
assm1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
assm1.setVisible(true);
assm1.setTitle("Assam");
assm1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
