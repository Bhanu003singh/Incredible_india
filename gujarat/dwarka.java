package gujarat;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class dwarka extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
dwarka()
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
l1=new JLabel("<HTML>Dwarka<BR><BR>Fast Fact <BR>Temperature: Summer: 35 -21 C Winter: 27-13 C <BR>Season: November to March <BR>Clothing: Tropical <BR>Languages spoken: Gujarati, Hindi and English <BR>STD Code: 02892 <BR>Tourism Office: Toran Tourist Bungalow, Near Govt. Guest House, Dwarka, <BR>Tel: 02892 234013; <BR>Office of the Administrator, Dwarka Devasthan Samiti, Dwarkadhish Temple Trust, Dwarka <BR>Tel: 02892 234080<BR>For devout Hindus, a trip to the holy temple town Dwarka in Gujarat is no mere journey, but a yatra, a spiritual pilgrimage. One of the seven sacred cities or ‘Sapta Puris’ as well as one of the four ‘dhams’ - supreme pilgrim centres -- it was once the capital of Lord Krishna’s kingdom. A land of myth and legends, coveted since antiquity for its spirituality, Dwarka has been attracted great saints and pilgrims including Adi Shankaracharya, Narsinh Mehta, Mirabai, Kabir and Nanak. The place is home to numerous temples, the prime amongst them being the Dwarkadhish Temple with its stunning architecture. Dwarka, which finds numerous mentions in myths, legends and sacred and ancient texts, has the distinction of being rebuilt six time after being swallowed by the sea.</HTML>");
img=new ImageIcon(getClass().getResource("/images/dwarka2.jpg"));
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
dwarka dwrka=new dwarka();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
dwrka.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
dwrka.setVisible(true);
dwrka.setTitle("Dwarka");
dwrka.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
