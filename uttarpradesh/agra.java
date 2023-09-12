package uttarpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class agra extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
agra()
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
l1=new JLabel("<HTML>Agra<BR><BR>Fast Fact <BR>Area : 62 Sq. Km. Altitude : 169 Metres <BR>Temperature : Summer: 45.0- 21.9 C Winter: 31.7- 04.2 C Rainfall : 66 cm. (June to Sept) <BR>Best Season : Oct to March <BR>STD Code : 0562. <BR>Tourist Information Centres: Indiatourism, 191, The Mall, Agra, Tel: 2226378 E-mail: goitoagr@sancharnet.in /*  */ Telefax: 2226368. U.P. Government Tourist Bureau, 64, <BR>Taj Ganj, Agra, Tel: 2226431. U.P. Govt. Tourist Reception Counter, Agra Cantt. Railway Station, Tel: 2421204; <BR>India Tourism Delhi,88,Janpath,New Delhi.Tel: 2332005/8 ; E-mail: goitodelhi@tourism.nic.in /*  */ ; website: www.incredibleindia.org <BR>Agra is an ancient city, mentioned in the Mahabharata and came into the limelight during the reign of the Mughals. It is famous as being home to one of the Seven Wonders of the World-the Taj Mahal. The Taj is a monument of such incredible elegance that it is considered synonymous with beauty itself.</HTML>");
img=new ImageIcon(getClass().getResource("/images/agra2.jpg"));
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
uttarpradesh up=new uttarpradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
up.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
up.setVisible(true);
up.setTitle("Famous Places of Uttar Pradesh");
up.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
agra agr=new agra();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
agr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
agr.setVisible(true);
agr.setTitle("Agra");
agr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
