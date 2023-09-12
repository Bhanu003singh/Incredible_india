package odisha;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class konark extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
konark()
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
l1=new JLabel("<HTML>Konark<BR><BR>Fast Facts <BR>Temperature: Summer: 40-26C  Winter: 27-17C <BR>Season: Throughout the year <BR>Clothing Summer: Light cotton, Winter: Light woollen <BR>Languages spoken Oriya, Bengali, Hindi, English <BR>STD Code: 06758 <BR>Tourism Centres: Government of Odisha Tourist Office, Konark-752111, Telefax: 06758236821<BR>Apart from TajMahal, if there is another monument that symbolises Indiait is the majestic Sun Temple at Konark, a UNESCO World Heritage. Built in the 13th century by King NarasimhaDev of the Ganga dynasty, this temple stands regally amidst the sand dunes bordering the Bay of Bengal. It represents the very pinnacle of the Kalinga School of Temple Architecture. In fact, Konark Sun temple, also known as Black Pagoda, is the most resplendent of thesites in Orissa, one certainly not to miss even in the most perfunctory of tours.The Annual Konark Festival and the Dance and Music festival held here in December and February, respectively, are great attractions. </HTML>");
img=new ImageIcon(getClass().getResource("/images/konark2.jpg"));
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
odisha odsh=new odisha();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
odsh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
odsh.setVisible(true);
odsh.setTitle("Famous Places of Odisha");
odsh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
konark knrk=new konark();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
knrk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
knrk.setVisible(true);
knrk.setTitle("Konark");
knrk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
