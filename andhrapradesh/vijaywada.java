package andhrapradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class vijaywada extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
vijaywada()
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
l1=new JLabel("<HTML>Vijaywada<BR><BR>There are many tales behind the origin of the name Vijayawada. At first it was named as Chandrala which comes under the family of Gajapathis which means victory and later Legends have it that this was the place where Arjuna was blessed by Shiva, on Indrakiladri Hill. In another legend it is stated that Goddesses Durga killed the demon and relaxed in this place for some time. As she was victorious (Vijaya), the place got the name as Vijayawada (Vijaya: victory and Wada: city/place/location) which literally means City of Victory. The Epic of Mahabharata refers to Indrakiladri hills as the place where Arjuna secured Pasupathastra from Lord Siva.In some legends, Vijayawada was referred to as Vijayavata and Rajendracholapura.A tale behind its acquiring the name Bezawada is that Goddesses Krishnaveni (River Krishna) requested Arjuna to make a passage for her to merge into the Bay of Bengal. Hence Arjuna made a bejjam (hole) through the mountains and the place came to be known as Bejjamwada which later changed to Bezawada.</HTML>");
img=new ImageIcon(getClass().getResource("/images/vijaywada2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,350);
l2.setBounds(500,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
andhrapradesh ap=new andhrapradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ap.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ap.setVisible(true);
ap.setTitle("Famous Places of Andhra Pradesh");
ap.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
vijaywada vijywd=new vijaywada();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
vijywd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
vijywd.setVisible(true);
vijywd.setTitle("Vijaywada");
vijywd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
