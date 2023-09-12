package haryana;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class gurgaon extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
gurgaon()
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
l1=new JLabel("<HTML>Gurgaon<BR><BR>Gurgaon, is the second largest city in the Indian state of Haryana and is a part of the National Capital Region. It is located 30 km south of national capital New Delhi, about 10 kilometers from Dwarka Sub City and 268 km south of Chandigarh, the state capital.Gurgaon has been deemed a non-city due to the lack of comprehensive infrastructure and its corporate enclaves, including a dearth of sidewalks, convenience stores, and public parks. Private real estate companies such as DLF Universal, Tata Housing, Unitech Group, ABW Group, Sidhartha Group, Puri Constructions, Sobha Developers and others constructed offices in Gurgaon, near Delhi Airport and National Highway 8 and then leased them to Fortune 500 and Indian companies at rates cheaper than Bangalore or Mumbai.<BR>There are many malls in Gurgaon city. Notable amongst them are the Ambience Mall (near the Gurgaon-Delhi toll plaza), Sahara Mall, Metropolitan Mall, City Centre Mall and Plaza Mall, (all on the MG Road, also known as the Mall Road), Wedding Mall (near Sohna Road). Newly opened Star Mall (on NH-8, near 32nd milestone) and Omaxe Mall (Sohna Road) are also drawing attention. Visitor attractions ==<BR>Culture Gully and Nautanki Mahal auditorium, Kingdom of Dreams, Gurgaon.* Kingdom of Dreams * Appu Ghar * Tau Devilal Biodiversity Park, Sector 52 * Rajiv Gandhi Renewable Energy Park,Sector 29, Gurgaon (energy information centre, Coffee Shops) * Ambience Mall (2nd Largest mall of India) * Sultanpur Bird Sanctuary * Shani Dev Temple * Damdama Lake * Leisure Valley Park * Sanskriti Museums: Museum Of Folk And Tribal Art * Pataudi Palace * Sai Dham * Sheetla Mata Temple * Sohna hot water spring * Wet N Wild * Air Force station </HTML>");
img=new ImageIcon(getClass().getResource("/images/gurgaon2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,330);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(930,img.getIconHeight()+60,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
haryana hryna=new haryana();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hryna.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hryna.setVisible(true);
hryna.setTitle("Famous Places of Haryana");
hryna.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
gurgaon grgaon=new gurgaon();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
grgaon.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
grgaon.setVisible(true);
grgaon.setTitle("Gurgaon");
grgaon.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
