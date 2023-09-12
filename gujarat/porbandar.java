package gujarat;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class porbandar extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
porbandar()
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
l1=new JLabel("<HTML>Porbandar<BR><BR>Fast Fact <BR>Temperature : Summer: 39-27.6 C Winter: 33. 5-16.6 C <BR>Season : November to March <BR>Clothing Tropical <BR>Languages spoken Gujarati, Hindi, English and Sourashtran <BR>STD Code : 0286 . <BR>Tourism Office Toran Tourist Bungalow, Chowpatty, Porbandar, Tel: 245476. <BR>Tourist Information. Bureau, Collector Office, Ground Floor, Porbandar Tel: 2245475<BR>A picturesque little seaside resort on the west coast of Gujarat, Porbandar is dominated by the legacy of Mahatma Gandhi, the Father of the Nation, who was born here in 1869. A famous trade centre inhabited by rich merchants and traders from Africa and the Gulf in the beginning of the Christian era, the town and its surroundings offer whole lot of attractions to a discerning tourist. Also known as Sudamapuri in ancient times, after Sudama, the devoted friend of Lord Krishna, the place is dotted with several religious shrines. The picturesque coastal setting, lovely mangroves abounding in avian population and carefree days go a long way in making Porbandar an enticing destination.</HTML>");
img=new ImageIcon(getClass().getResource("/images/porbandar2.jpg"));
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
gujarat gjrt=new gujarat();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
gjrt.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
gjrt.setVisible(true);
gjrt.setTitle("Famous Places of Gujarat");
gjrt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
porbandar prbndr=new porbandar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
prbndr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
prbndr.setVisible(true);
prbndr.setTitle("Porbandar");
prbndr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
