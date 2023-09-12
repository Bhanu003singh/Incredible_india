package kerala;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class wayanad extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
wayanad()
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
l1=new JLabel("<HTML>Wayanad<BR><BR>Fast Fact<BR> Temperature: Summer: 36 -20 C Winter: 32 -16 C <BR>Best Season : October to May <BR>Clothing : Tropical <BR>Languages spoken : Malayalam, English <BR>STD Code: 04936 <BR>Tourist Office: District Tourism Promotion Council, Kalpetta . <BR>Telefax: 202134 Pookot 255207 Tourist Information Centre, Collectorate Ph: 204441<BR>Wayanad is one of the districts in Kerala that has been able to retain its pristine nature. Hidden away in the hills of this land are some of the oldest tribes, as yet untouched by civilisation. Wayanad is known for its picturesque mist clad hill stations, sprawling spice plantations, luxuriant forests and rich cultural traditions. Kalpetta is the headquarters of the district. Mananthavady, Sulthan Bathery and Vythiri are other important towns in the district. The leading tourist centers of South India like Ooty, Mysore, Coorg, Kozhikode and Kannur are around this region. </HTML>");
img=new ImageIcon(getClass().getResource("/images/wayanad2.jpg"));
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
kerala kerla=new kerala();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kerla.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kerla.setVisible(true);
kerla.setTitle("Famous Places of Kerala");
kerla.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
wayanad wynd=new wayanad();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
wynd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
wynd.setVisible(true);
wynd.setTitle("Wayanad");
wynd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
