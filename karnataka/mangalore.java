package karnataka;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class mangalore extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
mangalore()
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
l1=new JLabel("<HTML>Mangalore<BR><BR>Fast Facts <BR>Area 121 Sq. Km <BR>Temperature Summer: 31 -26 C Winter: 28.9-18.3C <BR>Best Season October to February<BR>STD Code 0824 <BR>Tourism Centres: Karnataka Tourism Information Centre No.3, World Trade Centre, Cuffe Parade, Colaba, Mumbai-400005, <BR>Telefax: 022 22181658.<BR> Website:www.karnatakatourism.org.<BR> The port city of Mangalore is situated at the source and confluence of two rivers -- Netravati and Gurpur. It derives its name from Queen Mangaladevi who is said to have lived here in the 10th century AD. Mangalore was ruled by several dynasties, including the Kadambas, Vijayanagar, Chalukyas, Rashtrakutas, and Hoysalas, followed by the Portuguese from 1498, when the Portuguese explorer Vasco da Gama landed at St Mary's Island near Mangalore. Eventually, the city was annexed by the British in 1799. Today, Mangalore is a major port of South India and handles over 75 percent of India's coffee exports and the bulk of the nation's cashew exports. </HTML>");
img=new ImageIcon(getClass().getResource("/images/mangalore2.jpg"));
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
mangalore mnglr=new mangalore();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mnglr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mnglr.setVisible(true);
mnglr.setTitle("Mangalore");
mnglr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
