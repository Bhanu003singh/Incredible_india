package punjab;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class sheeshmahal extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
sheeshmahal()
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
l1=new JLabel("<HTML>Sheesh Mahal<BR><BR>The Sheesh Mahal is the famous tourist place in Patiala. Maharaja Narinder Singh built this Mahal in 1847. The design and the decoration of the palace was chosen by Maharaja Narinder Singh to a large extent. One section of Sheesh Mahal is decorated with colored glass and mirror work and it is also known as ‘Palace of Mirrors’. It is situated behind the Moti Bagh Palace. It is a triple storey building. There is a bridge across the artificial lake in the centre of the palace. This bridge is known as Lakshman Jhoola. There are gardens and fountains on the sides of the lake. Sheesh Mahal was the residential palace of Maharajas of Patiala. To give the artistic look on the walls and ceilings of the Sheesh Mahal, Maharaja Narinder Singh engaged artistic painters from Rajasthan and Kangra. The artist made the floral designs on the walls and ceilings. Their art depict the vision of Bihari, Surdas and Keshav in the poetic form and in colors. The paintings of these artists show the very old stories in the style of Rajasthan.There is a museum in the Sheesh Mahal. In the museum, there are paintings of Jaya Deva’s poetry and Geet Govinda. The Kangra paintings on the walls of the museum show the Krishan Lila in very artistic way.</HTML>");
img=new ImageIcon(getClass().getResource("/images/sheeshmahal2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+40,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
punjab pnjb=new punjab();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pnjb.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pnjb.setVisible(true);
pnjb.setTitle("Famous Places of Punjab");
pnjb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
sheeshmahal shsmhl=new sheeshmahal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
shsmhl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
shsmhl.setVisible(true);
shsmhl.setTitle("Sheesh Mahal");
shsmhl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
