package westbengal;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class darjeeling extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
darjeeling()
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
f=new Font("",Font.BOLD,12);
l1=new JLabel("<HTML>Darjeeling<BR><BR>Fast Facts<BR> Temperature: Summer: 14.9-8.6C Winter: 6.11-1.50 C<BR> Season: March to Middle June and October to December. <BR>Clothing : Light Woollens & Tropical; Winter- Heavy Woollens <BR>Languages spoken: Gorkha, Tibetan, Bengali, Hindi, English. <BR>STD Code: 0354. Tourism Centres: Tourist Bureau, Government of West Bengal, 1 Nehru Road, Darjiling-734101, Tel: 2254-050/ 2254-102. <BR>Darjeeling  is a picture perfect  hill station  sitting atop a ridge at 2134m is replete with Buddhist monasteries, trekking trails and awesome mountain views. People flock to this lovely hill station to escape the heat and humidity of the plains and beat the stress of city life. In Darjeeling feast your eyes on the panoramic views of the snow clad peaks of the Himalayas that are straight out of a postcard and provide a welcome relief from the dust and soot of urban India.High up near the Himalayas with Mt. Kanchenjunga as a backdrop, Darjeeling in the state of West Bengal, is worth a visit, where, ancient forests, quaint houses and friendly people make the trip to this most famous hill station of India worth it. The mystique of Darjeeling is glamorous thanks to its landscape. The toy train enables travellers to explore the wonderful hill station at a calm pace, soaking in the environs and culture of every part of destination that is Darjeeling.</HTML>");
img=new ImageIcon(getClass().getResource("/images/darjeeling1.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+2,1200,350);
l2.setBounds(400,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
westbengal wb=new westbengal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
wb.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
wb.setVisible(true);
wb.setTitle("Famous Places of West Bengal");
wb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
darjeeling drjlng=new darjeeling();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
drjlng.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
drjlng.setVisible(true);
drjlng.setTitle("Darjeeling");
drjlng.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
