package uttarakhand;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class mussoorie extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
mussoorie()
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
l1=new JLabel("<HTML>Mussoorie<BR><BR>Fast Fact <BR>Area: 64.25 sq km Altitude: 2005.5 m <BR>Temperature: Sumer: 29.6 - 7.2 C Winter:07 - 01 C Rainfall: 177- 280 cm (from mid-July to mid-September) <BR>Season: April to July and September to November <BR>STD Code: 0135 Tourism Office: Uttaranchal Tourism Tourist Assistance Centre, Mussoorie, Tel: 0135 0135 2632863. GMVN, The Mall, Mussoorie, Tel: 0135 2631281, Garhwal Mandal Vikas Nigam Ltd., 74/1, Rajpur Rd., Dehradun, Tel: 2740896, 2746817, 2749308, 2748478, Fax: 0135 2746847<BR> Mussoorie, known as the Queen of the Hills, famous for its scenic beauty, is a fascinating hill resort. It commands a wonderful view of the extensive Himalayan snow ranges in the north-west and glittering views of the Doon Valley, Roorkee, Saharanpur and Haridwar in the South.<BR> Mussoorie was discovered by Captain Young, an adventurous military officer in 1827, who was lured by the extraordinarily beautiful ridge and laid its foundation. The town retains much of its colonial charm and is well worth a visit for its beautiful scenery and lovely walks.</HTML>");
img=new ImageIcon(getClass().getResource("/images/mussoorie1.jpg"));
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
uttarakhand uk=new uttarakhand();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
uk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
uk.setVisible(true);
uk.setTitle("Famous Places of Uttarakhand");
uk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
mussoorie musr=new mussoorie();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
musr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
musr.setVisible(true);
musr.setTitle("Mussoorie");
musr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
