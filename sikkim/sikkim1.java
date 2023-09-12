package sikkim;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class sikkim1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
sikkim1()
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
l1=new JLabel("<HTML>Sikkim<BR><BR>Fast Facts <BR>Area: 7,096 sq km Population: 540,493 <BR>Capital: Gangtok Principal Languages: Lepcha, Bhutia, Limbu, Nepali, Hindi & English <BR>Best time to visit: September to November and February to May <BR>Travel Information: Indian tourists need no entry permits to visit Sikkim except for a few restricted areas. Foreign tourists require a special permit that can be obtained from all Indian Missions abroad who are authorised to issue a 15-day permit or Sikkim Tourism offices. The Tourism Officer at the border town of Rangpo is also authorized to issue a-2 day permit to foreign tourists to enable them to enter the state and acquire the full 15-day permit. Permits can also be obtained from the Sikkim Tourist Information Counter, Gangtok, Tel: 03592 221634/203425, New Delhi, Tel: 011 26115171/23115346, Siliguri, Tel: 0353 2512646, Bagdogra Airport, Tel: 0353 2698030/036, Kolkata, Tel: (033) 22815328/22817905<BR>Sikkim is sheer magic. This is not just one of the most beautiful places in the world but the cleanest and safest too. If once the charms of the state were limited to mists, mountains and colourful butterflies, they are now complimented by tangible development and progress. With its unique culture and natural landscape, Sikkim is a picture of perfection and pristine purity. Nestled in the Himalayas and endowed with exceptional natural resources, Sikkim is a hotspot of biodiversity and development. This state has the unique distinction of being bounded by three sovereign nations: Nepal in the west, Bhutan in the east and China’s Tibet in the north.</HTML>");
img=new ImageIcon(getClass().getResource("/images/sikkim2.jpg"));
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
sikkim sikkm=new sikkim();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
sikkm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
sikkm.setVisible(true);
sikkm.setTitle("Sikkim");
sikkm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
sikkim1 sikkm1=new sikkim1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
sikkm1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
sikkm1.setVisible(true);
sikkm1.setTitle("Sikkim");
sikkm1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
