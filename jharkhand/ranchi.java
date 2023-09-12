package jharkhand;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ranchi extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
ranchi()
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
l1=new JLabel("<HTML>Ranchi<BR><BR>Fast Facts <BR>Temperature : Summer: 37.2-20C Winter: 22.3-10.3C <BR>Season : September to May <BR>Clothing : Tropical <BR>Languages spoken : Nagpuria, Oraon, Hindi, Bengali, English <BR>STD Code : 0651<BR>Once the summer headquarters of Bihar in the British Raj, Ranchi is the capital of the newly created state of Jharkhand. Ranchi has an undeniable charm and the nearby waterfalls, verdant hills and forest are first ports of call for the travellers. The city is the leaping off point for the Betla National Park that lures wildlife enthusiasts to this eastern state of India. Located at an altitude of 2140 feet in the valley of Chotanagpur, the picturesque city of Ranchi is a travel destination with beautiful attractions and provides relief, to some extent, from the sweltering heat of the plains. </HTML>");
img=new ImageIcon(getClass().getResource("/images/ranchi2.jpg"));
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
jharkhand jhrknd=new jharkhand();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jhrknd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jhrknd.setVisible(true);
jhrknd.setTitle("Famous Places of Jharkhand");
jhrknd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
ranchi rnchi=new ranchi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
rnchi.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
rnchi.setVisible(true);
rnchi.setTitle("Ranchi");
rnchi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
