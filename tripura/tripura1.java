package tripura;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class tripura1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
tripura1()
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
l1=new JLabel("<HTML>Tripura<BR><BR>Fast Facts <BR>Area : 10,491.69 sq km <BR>Population :31,91,168(Census-2001) <BR>Season : October to May <BR>Capital : Agartala <BR>Languages spoken : Bengali, Kokborok, Hindi & English. <BR>STD Code : 0381 <BR>Formerly known as well Hill Tippera, Tripura is located in the extreme south-west corner of the North-eastern region. The origin of the name of Tripura is still a matter of controversy among historians and researchers. According to the 'Rajmala', Tripura’s celebrated court chronicle, an ancient king named 'tripur' ruled over the territorial domain known as 'Tripura' and the name of the kingdom was derived from his name. Many researchers explain the name 'Tripura' from its etymological origin and its geographic location: the word 'Tripura' means 'near water'. The early history of the kingdom of Tripura is a complex blend of history and mythology, and has a history of over 2,500 years and 186 kings. It was formerly an independent Tripuri kingdom and was merged with independent India on October15, 1949 by the Tripura Merger Agreement.</HTML>");
img=new ImageIcon(getClass().getResource("/images/tripura2.jpg"));
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
tripura tripra=new tripura();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
tripra.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
tripra.setVisible(true);
tripra.setTitle("Tripura");
tripra.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
tripura1 tripra1=new tripura1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
tripra1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
tripra1.setVisible(true);
tripra1.setTitle("Tripura");
tripra1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
