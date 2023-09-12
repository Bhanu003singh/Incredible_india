package meghalaya;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class meghalaya1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
meghalaya1()
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
l1=new JLabel("<HTML>Meghalaya<BR><BR>Fast Facts <BR>Area : 22,429 sq km <BR>Population : 2,318,822 <BR>Season : October to May<BR> Capital : Shillong <BR>Languages spoken : Khasi, Garo and English <BR>STD Code : 0364<BR> Meghalaya is bounded on the north and east by the state of Assam and on the south and west by Bangladesh. The word 'Meghalaya' literally means the Abode of Clouds in Sanskrit. The state is inhabited by three ethnic communities -- the Khasis, the Jaintias and the Garos – each of which follows its own cultural traditions and customs. The common trait binding all three communities is its matrilineal system in which the family linage is taken from the mother's side. The people of Meghalaya are known to be hospitable, cheerful and friendly. The state’s area is divided in Khasi hills, Jaintia hills and Garo hills. The forests of Meghalaya are notable for their biodiversity of flora and fauna.</HTML>");
img=new ImageIcon(getClass().getResource("/images/meghalaya2.jpg"));
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
meghalaya mghlya=new meghalaya();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mghlya.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mghlya.setVisible(true);
mghlya.setTitle("Meghalaya");
mghlya.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
meghalaya1 mghlya1=new meghalaya1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mghlya1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mghlya1.setVisible(true);
mghlya1.setTitle("Meghalaya");
mghlya1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
