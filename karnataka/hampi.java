package karnataka;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class hampi extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
hampi()
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
l1=new JLabel("<HTML>Hampi<BR><BR>Fast Fact <BR>Area: 26 sq km <BR>Temperature : Summer: 41- 37 C Winter: 27 – 24 C Rainfall: 57.2 cm <BR>Best season: October to March <BR>STD Code: 08394 <BR>Tourism Office:Tourist Information Counter, Hampi Bazar, Hampi, Tel: 08394 241339. <BR>Dept of Tourism, Government of Karnataka, Raghavendra Compound, College Road, Hospet, Tel: 228537, KSTDC, College Road, Hospet, <BR>Tel: 221008. Telefax: 228537. Karnataka Tourism Information Centre, No. 3, World Trade Centre, Cuffe Parade, Mumbai, Tel: 022 22181658 <BR>Vijayanagara, the 'City of Victory,' was one of the greatest of all medieval Hindu capitals of South India. Its impressive ruins in central Karnataka are known best as Hampi, after the name of a still populated local village. Traditionally known as Pampakshetra of Kishkindha, Hampi is situated on the southern bank of the river Tungabhadra. It was the seat of the mighty Vijayanagara Empire (1336-1565) which extended from the Arabian Sea to the Bay of Bengal and from the Deccan Plateau to the tip of the Indian Peninsula. Hampi is a UNESCO World Heritage Site.</HTML>");
img=new ImageIcon(getClass().getResource("/images/hampi2.jpg"));
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
hampi hmpi=new hampi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hmpi.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hmpi.setVisible(true);
hmpi.setTitle("Hampi");
hmpi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
