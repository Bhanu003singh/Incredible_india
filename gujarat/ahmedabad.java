package gujarat;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ahmedabad extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
ahmedabad()
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
l1=new JLabel("<HTML>Ahmedabad<BR><BR>Fast Fact <BR>Temperature: Summer: 43-23 C Winter: 36-15 C <BR>Season: Throughout the year <BR>Clothing: Tropical <BR>Languages spoken: Gujarati, English and Hindi <BR>STD Code: 079 <BR>Tourism Office: Tourism Corporation of Gujarat Ltd. (TCGL), H.K. House, Ashram Road, Ahmedabad-380 009, Tel: 079 26589172 / 9683. <BR>Fax: 26582183. <BR>Website: www.gujarattourism.com<BR>Named after Sultan Ahmed Shah, who founded the city in 1411, Ahmedabad has a strong association with India’s struggle for independence. It was here that Mahatma Gandhi lived for several years and from here that he started the Dandi March. Today, the city is as famous for its burgeoning IT and scientific industries and avant-garde design as it is for its medieval architecture. Located on the banks of the Sabarmati River, the cutting-edge city once served the capital of Gujarat from 1960 to 1970. It built its fortune on the thriving textile industry, which earned it the nickname 'the Manchester of the East.' Notwithstanding its newfound attractiveness as a business destination, this largest city in Gujarat remains steeped in history and has a wealth of historical attractions.</HTML>");
img=new ImageIcon(getClass().getResource("/images/ahmedabad2.jpg"));
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
ahmedabad ahmdbd=new ahmedabad();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ahmdbd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ahmdbd.setVisible(true);
ahmdbd.setTitle("Ahmedabad");
ahmdbd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
