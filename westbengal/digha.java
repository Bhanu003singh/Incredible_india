package westbengal;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class digha extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
digha()
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
l1=new JLabel("<HTML>Digha<BR><BR>Fast Facts Temperature: Summer: 37-19C Winter: 24-9.3C <BR>Season: Throughout the year<BR>Clothing: Tropical <BR>Languages spoden: Bengali, Hindi <BR>STD Code: 03220 <BR>Tourism Office: Tourist Bureau, Government of West Bengal, 3/2 B.B.D. Bag, digha - 700 001.<BR><BR>Digha is high on the list of the best attractions of West Bengal with its soft and silvery sands, crystal blue water, and casuarinas trees swaying as far as the eye can see. Located on the Bay of Bengal in East Midnapore district, Digha Beach is a perfect place to unwind, rejuvenate and relax oneself.<BR> Digha offers pristine beauty in the form of breathtading views of the sunrise and sunset, and a perfect wald along the beach.</HTML>");
img=new ImageIcon(getClass().getResource("/images/digha_seabeach_l3.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+10,1200,350);
l2.setBounds(400,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
westbengal wb=new westbengal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
wb.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
wb.setVisible(true);
wb.setTitle("Famous Places of West Bengal");
wb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
digha dgh=new digha();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
dgh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
dgh.setVisible(true);
dgh.setTitle("Digha");
dgh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
