package uttarakhand;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class dehradun extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
dehradun()
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
l1=new JLabel("<HTML>Dehradun<BR><BR>Fast Fact <BR><B>Temperature:</B> Summer:27 C Winter: 13 C <BR>Season: all year round <BR>STD Code: 0135 Tourism Office: Garhwal Mandal Vikas Nigam Ltd., 74/1, Rajpur Rd., Dehradun, Tel: 0135 2740896, 2746817, 2749308, 2748478, Fax: 0135 2746847, E-mail: gmvn@gmvnl.com /*  */ , gmvn@sancharnet.in /*  */ ; <BR>Garhwal Mandal Vikas Nigam Ltd;: 103, Inder Prakash Bldg. 21, <BR>Barakhamba Road. New Delhi Tel: 011 23350481, 23326620<BR> Surrounded on the east by the River Ganga, on the west by the Yamuna, the Doon Valley is a picturesque region at the foothills of the panoramic Shivalik ranges. <BR>Dehradun serves as the gateway to the hill resort of Mussoorie. Nestled in the mountain ranges of the Himalayas, Dehradun is the capital of Uttaranchal. The name Dehradun is a collection of two words dera meaning camp and dun meaning valley. <BR>Said to be one of the oldest cities in India, it is believed that Lord Rama and his brother did penance here for killing Ravana, the demon king. During the 17th and 18th centuries Dehradun changed hands several times: Guru Ram Rai retreated here from Punjab, the Mughal Governor Najib-ud-Daula occupied it from 1757-1770 and the Gorkhas overran it on their westward expansion before ceding it to the British in 1815.</HTML>");
img=new ImageIcon(getClass().getResource("/images/dehradun1.jpg"));
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
uttarakhand uk=new uttarakhand();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
uk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
uk.setVisible(true);
uk.setTitle("Famous Places of Uttarakhand");
uk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
dehradun ddn=new dehradun();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ddn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ddn.setVisible(true);
ddn.setTitle("Dehradun");
ddn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
