package rajasthan;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class udaipur extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
udaipur()
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
l1=new JLabel("<HTML>Udaipur<BR><BR>Fast Fact <BR>Temperature : Summer: 38.3 -28.8 C Winters: 28.3 -11.6 C <BR>Rainfall : 61 cms <BR>Season: October to March <BR>Languages spoken : Rajasthani, Hindi, Marwari <BR>STD Code : 0294.<BR>Udaipur is often called ‘Venice of the East’. It is also the ‘city of lakes’. The Lake Palace (Jag Niwas) located in the middle of Pichola Lake is the finest example of architectural and cultural marvel. The grand City Palace on the banks of the lake along with the Monsoon Palace (Sajjan Garh) on the hill above enhances the beauty of this magnificent city. Udaipur is also the centre for performing arts, crafts and its famed miniature paintings. The Shilpgram festival is a great crowd-puller on new year. Maharana Udai Singh founded Udaipur in 1559 AD.According to alegend Udai Singh was guided by a holy man meditating on the hill near Pichola Lake to establish his capital on that very spot. Surrounded by Aravali Ranges, forests and lakes this place was less vulnerable to external invasion than Chittaurgarh. Maharana Udai Singh died in 1572 and was succeeded by Maharana Pratap who valiantly defended Udaipur fromMughal attacks.</HTML>");
img=new ImageIcon(getClass().getResource("/images/udaipur2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+20,1200,350);
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
udaipur udpr=new udaipur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
udpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
udpr.setVisible(true);
udpr.setTitle("Udaipur");
udpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
