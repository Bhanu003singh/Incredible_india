package rajasthan;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class jaipur extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
jaipur()
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
l1=new JLabel("<HTML>Jaipur<BR><BR>Fast Fact <BR>Temperature : Summer: 42.2-36.6 C Winter: 27.5 -15.5C <BR>Season : October to March. <BR>Clothing Summer- light tropical or cotton, Winter - Woollens <BR>Languages spoken Hindi, Rajasthani and English <BR>STD Code : 141. Tourism Office India Tourism Jaipur, State Hotel Complex, KhasaKothi, Tel: 0141-2372200 <BR>Jaipur, dubbed the Pink City after the colour-wash of its old city’s walls, is indeed a visual treat. The city, which is the Holy Grail of Indian tourism, boasts its assembly of world-renowned monuments. The monuments which draw the largest crowds to Jaipur are the Palace of Winds or Hawa Mahal, Jai Singh's City Palace and Jantar Mantar Observatory, built by the city's founder, Maharaja Sawai Jai Singh II, a man famed for his talents as a politician, astronomer, and mathematician. <BR>Other attractions that will detain you in the capital of Rajasthan are Ram Niwas Bagh and Govindji Temple, Ram Niwas Bagh, the city garden, houses Albert Hall (Central Museum).</HTML>");
img=new ImageIcon(getClass().getResource("/images/jaipur2.jpg"));
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
jaipur jpr=new jaipur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jpr.setVisible(true);
jpr.setTitle("Jaipur");
jpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
