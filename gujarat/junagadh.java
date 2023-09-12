package gujarat;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class junagadh extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
junagadh()
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
l1=new JLabel("<HTML>Junagadh<BR><BR>Fast Fact <BR>Temperature : Summer: 34-28 C Winter: 28-20 C <BR>Season : October to March <BR>Clothing : Cotton in summer and light, woollen in winter <BR>Languages spoken : Gujarati, Hindi and English <BR>STD Code : 0285 <BR>Tourism Office : TCGL, Hotel Girnar, Majevadi Darwaja, Opp. R.T.O Office, Junagadh, <BR>Tel: 0285 2621201 / 03 <BR>Located at the base of spectacular Girnar Hills, Junagadh, headquarters of the district of the same name, is an ancient fortified city, rich in myth and legend. A princely state in British India, the place is named after the ‘Old Fort’ which encircled the old city. The presence of 14 Rock Edicts of the Mauryan Emperor Ashoka cut into a big rock outside the city bears testimony to its antiquity and attracts the historically minded. One of the reasons for visiting Junagadh is to transit to Sasangir, the entrancing preserve of Asiatic lion or to tour the beautiful shrine of Somnath.</HTML>");
img=new ImageIcon(getClass().getResource("/images/junagadh2.jpg"));
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
gujarat gjrt=new gujarat();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
gjrt.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
gjrt.setVisible(true);
gjrt.setTitle("Famous Places of Gujarat");
gjrt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
junagadh jungdh=new junagadh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jungdh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jungdh.setVisible(true);
jungdh.setTitle("Junagadh");
jungdh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
