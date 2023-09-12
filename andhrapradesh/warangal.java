package andhrapradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class warangal extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
warangal()
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
l1=new JLabel("<HTML>Warangal<BR><BR>Warangal was the capital of Kakatiya kingdom ruled by the Kakatiya dynasty from the 12th to the 14th centuries. Warangal also known as Orugallu, Ekasila Nagaram and Andhra Nagaram, Andhra refers to Andhra Maha Vishnu. The old name is Orugallu. Oru means one and Kallu means stone. The Kakatiyas left many monuments, including an impressive fortress, four massive stone gateways, the Swayambhu temple dedicated to Shiva, and the Ramappa temple situated near Ramappa Lake. The cultural and administrative distinction of the Kakatiyas was mentioned by the famous traveller Marco Polo. Famous or well-known rulers included Ganapathi Deva, Prathapa Rudra, and Rani (queen) Rudrama Devi. After the defeat of PratapaRudra, the Musunuri Nayaks united seventy two Nayak chieftains and captured Warangal from Delhi sultanate and ruled for fifty years. Jealousy and mutual rivalry between Nayaks ultimately led to the downfall of Hindus in 1370 A.D. and success of Bahmanis. Bahmani Sultanate later broke up into several smaller sultanates, of which the Golconda sultanate ruled Warangal. The Mughal emperor Aurangzeb conquered Golconda in 1687, and it remained part of the Mughal empire until the southern provinces of the empire split away to become the state of Hyderabad in 1724 which included the Telangana region and some parts of Maharashtra and Karnataka. Hyderabad was annexed to India in 1948, and became an Indian state. In 1956 Hyderabad was partitioned as part of the States Reorganization Act, and Telangana, the Telugu-speaking region of Hyderabad state which includes Warangal, became part of Andhra Pradesh.</HTML>");
img=new ImageIcon(getClass().getResource("/images/warangal2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+1,1200,320);
l2.setBounds(500,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+10,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
andhrapradesh ap=new andhrapradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ap.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ap.setVisible(true);
ap.setTitle("Famous Places of Andhra Pradesh");
ap.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
warangal wrngl=new warangal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
wrngl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
wrngl.setVisible(true);
wrngl.setTitle("Warangal");
wrngl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
