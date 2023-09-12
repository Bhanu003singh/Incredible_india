package rajasthan;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class jaisalmer extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
jaisalmer()
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
l1=new JLabel("<HTML>Jaisalmer<BR><BR>Fast Facts <BR>Area: 5.1 sq km <BR>Altitude: 225 m <BR>Temperature: Summer: 46 - 32 C Winter: 27 - 1 C <BR>Rainfall: 10 cm <BR>Season: October to March <BR>STD Code: 02992 <BR>Conducted Tours The City Sightseeing and Sam Sand Dunes Tours are conducted by Rajasthan Tourism Development Corporation (RTDC) during season. <BR>Tel: 02992 252392<BR>Situated in the heart of the Thar Desert, the Jaisalmer Fort seems suddenly to rise out of the desert haze, a magnificent edifice of massive yellow sandstone ramparts and bastions bathed golden in the sunlight. <BR>The city was founded in 1156 by Rawal Jaisal, a Bhati Rajput King, after whom it is named – and till today exudes an age-old aura of valour and royalty. Apart from the spectacular golden fort or Sonar Qila, as it is known locally, Jaisalmer also boasts of some beautifully constructed medieval Havelis and a Jain temple.</HTML>");
img=new ImageIcon(getClass().getResource("/images/jaisalmer2.jpg"));
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
rajasthan rjsthn=new rajasthan();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
rjsthn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
rjsthn.setVisible(true);
rjsthn.setTitle("Famous Places of Rajasthan");
rjsthn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
jaisalmer jslmr=new jaisalmer();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jslmr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jslmr.setVisible(true);
jslmr.setTitle("Jaisalmer");
jslmr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
