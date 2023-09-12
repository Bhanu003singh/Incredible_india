package uttarakhand;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class nainital extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
nainital()
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
f=new Font("",Font.BOLD,14);
l1=new JLabel("<HTML>Nainital<BR><BR>Fast Fact <BR>Temperature : Summer: 26.7 -10.6 C Winter: 15.6 -2.8C <BR>Season : April to June & Mid-Sept to Mid-Nov Clothing Summer- Light Woolens and tropical Winter- Heavy woollens <BR>Languages spoken Hindi, Punjabi, English and Pahari <BR>STD Code : 05942. Tourism Office Divisional Manager Tourism/ Manager Adventure Tourism, Kumaon Mandal Vikas Nigam Ltd., Oak Park House, Mallital, Nainital Tel No.: (05942)- 231504, 236356<BR> Nainital, an old-world hill station in the Kumaon, is set around the ebony-emerald Naini Tal (Lake) ringed by hills. Founded by Mr. P. Barron, a European merchant and an enthusiastic hunter in 1841, the city derives its name from a temple dedicated to the goddess 'Naini Devi'. Located at a height of 1938 meters, this famous hill station of India is surrounded by pine forests. <BR>Its numerous lakes, stunning mountain vistas are a paradise for holidaymakers and nature lovers. A travel to Nainital is a fairytale panoramic tour through the Himalayan Mountains where nature is both the backdrop and the director.</HTML>");
img=new ImageIcon(getClass().getResource("/images/nainital1.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+50,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
uttarakhand uk=new uttarakhand();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
uk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
uk.setVisible(true);
uk.setTitle("Famous Places of Uttarakhand");
uk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
nainital nntl=new nainital();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
nntl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
nntl.setVisible(true);
nntl.setTitle("Nainital");
nntl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
