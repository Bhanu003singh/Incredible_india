package jammuandkashmir;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class jammu extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
jammu()
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
l1=new JLabel("<HTML>Jammu<BR><BR>Fast Fact<BR>Temperature: Summer: 20 - 8 C Winter: 10 -0 C<BR> Best Season : Throughout the year<BR>Clothing : Summer- Cottons, Winter- Heavy woollens<BR> Languages spoken : Hindi, Urdu, Kashmiri <BR>STD Code: 01992 <BR>Tourist Office: Chief Executive Officer, Patnitop Development Authority, Patnitop Mobile No. 9419163171 Office No. 0192-288146 <BR>Situated 112 km from Jammu is one of the greatest treasures of Jammu and Kashmir, Patnitop, a hill resort perched on a beautiful plateau at an altitude of 2024 meters offering breath taking views of the of the Chenab basin.<BR> Though not as famous as other tourist places of the state, Patnitop, enveloped by thickly wooded forests, is known for its natural charm, climate, pine forests and lush green cover of the pine trees that make the place a far more appealing travel destination than other more famous destinations in the state. A haven for outdoor pursuits, Patnitop is also a trailhead for numerous treks to the nearby mountains.</HTML>");
img=new ImageIcon(getClass().getResource("/images/jammu.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+50,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
jammukashmir jk=new jammukashmir();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jk.setVisible(true);
jk.setTitle("Famous Places of Jammu & Kashmir");
jk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
jammu jmu=new jammu();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jmu.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jmu.setVisible(true);
jmu.setTitle("Jammu");
jmu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
 
