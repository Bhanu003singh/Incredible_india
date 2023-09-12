package uttarpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class allahabad extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
allahabad()
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
l1=new JLabel("<HTML>Allahabad<BR><BR>Fast Fact <BR>Temperature : Summer: 43- 30C Winter: 25- 3C <BR>Best Season : October to March <BR>Clothing : Summer- Cotton, Winter - Woolens <BR>Languages spoken : Hindi, Urdu and English <BR>STD Code: 0532 Tourist Office: Government of U.P. Regional Tourist Office Tourist Bungalow Civil Lines Allahabad Tel: (0532)2408873. <BR>A city of many dimensions is what befits a description of Allahabad. In addition to being a major pilgrimage centre, the city has played an important part in the formation of modern India. Hindu mythology states that Lord Brahma, the creator god, chose a land for 'Prakrishta Yajna'. <BR>This land, at the confluence of three holy rivers - Ganga, Yamuna and Saraswati, blessed by gods, came to be known as 'Prayag' or 'Allahabad'. Foreseeing the sanctity of the place, Lord Brahma also called it as 'Tirth Raj' or 'King of all pilgrimage centers’.' The Scriptures - Vedas and the great epics - Ramayana and Mahabharata, refer to this place as Prayag. Centuries followed. Allahabad became the headquarters of North Western Provinces, after being shifted from Agra.</HTML>");
img=new ImageIcon(getClass().getResource("/images/allahabad2.jpg"));
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
uttarpradesh up=new uttarpradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
up.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
up.setVisible(true);
up.setTitle("Famous Places of Uttar Pradesh");
up.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
allahabad alhbd=new allahabad();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
alhbd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
alhbd.setVisible(true);
alhbd.setTitle("Allahabad");
alhbd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
