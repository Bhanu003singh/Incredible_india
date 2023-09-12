package kerala;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class kochi extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
kochi()
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
l1=new JLabel("<HTML>Kochi<BR><BR>Fast Facts <BR>Area: 83.52 Sq. Km. <BR>Altitude: Sea Level. <BR>Temperature: Summer:  35 - 22 C. Winter:  32 - 20 C. Rainfall: 254 m. (June to October). <BR>Season: October to March. STD Code: 0484. <BR>Kochi, the commercial hub of Kerala, is one of the most picturesque places in Kerala with an all weather harbour and a grand seascape and is termed the ‘Queen of the Arabian Sea’. The earliest verifiable history of Kochi kingdom is traced to the last Perumal of the second Chera Dynasty, Rama Varma Kulashekara Perumal in the 12th century. Chinese and Arab traders are believed to have been the first traders to this port, heralding a wave of subsequent visitors, the Portuguese, Dutch and British, who brought in the era of colonial power to the region. Kochi was able to offer in abundance the best of spices to the world, a reputation that continues to this day. In addition to spices, the voyagers also coveted the fine ivory, sandalwood, perfumes and gold that came to this market town. At one point nothing but a small fishing village, the destiny of Kochi changed in 1341, with the flooding of the Periyar River, which rendered the then popular Kodungallur ineffective. Among many repercussions of this event was the creation of a natural harbour at Kochi. It was Sir Robert Bristow, an experienced harbour engineer who came to Kochi in 1920 who was responsible for the modernization of Kochi harbour. The city is now the proud owner of one of the most beautiful ports of the country that is the biggest in Kerala and is also one of the premier industrial trading and commercial centres of southern India. Kochi expanded to include many towns and villages surrounding it and the corporation of Kochi was formed in 1967.</HTML>");
img=new ImageIcon(getClass().getResource("/images/kochi.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+80,1200,350);
l2.setBounds(450,30,img.getIconWidth(),img.getIconHeight());
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
kochi kchi=new kochi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kchi.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kchi.setVisible(true);
kchi.setTitle("Kochi");
kchi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
