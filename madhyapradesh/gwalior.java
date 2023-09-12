package madhyapradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class gwalior extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
gwalior()
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
l1=new JLabel("<HTML>Gwalior<BR><BR>Fast Facts <BR>Temperature: Summer: 46 -21 C Winter: 22 -06 C <BR>Season: October to March <BR>Clothing : Summer- Cottons, Winter- Heavy woollens <BR>Languages spoken: Hindi, English <BR>STD Code: 0751 Tourism Centres: M.P.S.T.D.C.Ltd., C/o Hotel Tansen, 6, Gandhi Road, Gwalior. <BR>Tel: (0751) 2340370, 2342606, 4010666. M.P. Tourist Office, Railway Station, Gwalior, <BR>Tel: 2340370, Manager, Tourist Village, M.P.S.T.D.C. Ltd., Near Bhadaiya Kund, Shivpuri. Tel: (07492) 223760, 221297.<BR>Legend has it that Gwalior was founded in 8th century AD by a chieftain known as Suraj Sen or Surya Sen of Kachwaha Rajput clan who,when struck by a deadly disease, was curd by a hermit-saint Gwalipa. <BR>As a mark of respect to the saint, he built the city of Gwalior after the name of the saint. Steeped in its past splendor it was ruled by several dynasties including the Pratiharas, Kachwahas and Tomars who have left imprints of their rule, in this city of outstanding palaces, sacred temples and glorious monuments. It is also the birthplace of great musician Tansen.</HTML>");
img=new ImageIcon(getClass().getResource("/images/gwalior.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+70,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
madhyapradesh mp=new madhyapradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mp.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mp.setVisible(true);
mp.setTitle("Famous Places of Madhya Pradesh");
mp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
gwalior gwlr=new gwalior();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
gwlr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
gwlr.setVisible(true);
gwlr.setTitle("Gwalior");
gwlr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
