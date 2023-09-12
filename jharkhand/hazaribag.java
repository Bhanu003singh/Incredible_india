package jharkhand;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class hazaribag extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
hazaribag()
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
l1=new JLabel("<HTML>Hazaribagh<BR><BR>Fast Fact <BR>Temperature : Summer: 41.1 - 19.4C Winter: 25.5 - 07C <BR>Best Season : October-April <BR>Clothing : Summer- Cotton, Winter - Woollen <BR>Languages spoken : Hindi, Urdu, Bhojpuri <BR>STD Code: 06546 <BR>Tourist Office: Tourist Information Centre Near St. Columbus College, Hazaribag <BR>Ph: 06546-224916.<BR>Hazaribag translates into 'Land of A thousand gardens'. Located 2019 ft above sea level, the place is a famous health resort. It has excellent climate and scenic beauties all around it in the midst of dense forest which is quite rich in flora and fauna. The Hazaribagh plateau has on its eastern margin, Parasnath - the highest hill in the Bihar, rising to a height of 4480 feet. </HTML>");
img=new ImageIcon(getClass().getResource("/images/hazaribagh2.jpg"));
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
jharkhand jhrknd=new jharkhand();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jhrknd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jhrknd.setVisible(true);
jhrknd.setTitle("Famous Places of Jharkhand");
jhrknd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
hazaribag hzribg=new hazaribag();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hzribg.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hzribg.setVisible(true);
hzribg.setTitle("Hazaribagh");
hzribg.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
