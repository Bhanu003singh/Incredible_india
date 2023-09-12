package kerala;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class munnar extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
munnar()
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
l1=new JLabel("<HTML>Munnar<BR><BR>Fast Fact <BR>Temperature : Summer: 25 - 15 C Winter: 10  - 0 C <BR>Season : October to May  <BR>Clothing Summer- Cottons, Winter- woollens <BR>Languages spoken: Malayalam, English and Hindi <BR>STD Code : 04865.<BR>There is nowhere else quite like Munnar, and that is why so many travellers have a holiday in Munnar as top of their wish lists while travelleing to Kerala. Located at an altitude of 1600m, at the confluence of the Muthirappuzha, Chadavurai,   and  Kundaly rivers, it was once the summer resort of the British. Munnar  holds great appeal for those with an appreciative eye for exquisite beauty - from unending expanse of tea plantations to pristine valleys and the verdant mountains of the Western Ghats; and from national parks and sanctuaries teeming with wildlife, to the beautiful lakes.</HTML>");
img=new ImageIcon(getClass().getResource("/images/munnar2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+30,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
kerala kerla=new kerala();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kerla.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kerla.setVisible(true);
kerla.setTitle("Famous Places of Kerala");
kerla.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
munnar munr=new munnar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
munr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
munr.setVisible(true);
munr.setTitle("Munnar");
munr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
