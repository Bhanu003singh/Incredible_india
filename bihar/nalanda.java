package bihar;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class nalanda extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
nalanda()
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
l1=new JLabel("<HTML>Nalanda<BR><BR>Fast Facts <BR>Temperature : Summer: 37.8-17.8C Winter: 27.8-10.6 C <BR>Season : October to March <BR>Clothing : Light cotton in summer and woollen in winter.<BR> Languages spoken : Hindi English, <BR>STD Code : 06112 <BR>Tourism Office : Tourist Bhawan, Beer Chand Patel Path Patna 800001 <BR>Tel: 06112 225411 Fax: 236218 <BR>The ruins of Nalanda stand testimony to one of the greatest centres of learning in recorded history. This once world famous university attracted students from other parts of the world during the 5th-12th centuries AD. A famous centre of Buddhist learning in ancient India, the University of Nalanda has been referred to by the renowned 7th century Chinese traveller Hiuen-Tsang in glowing terms. Nalanda is also the birthplace of Sariputra, one of the chief disciples of the Lord Buddha. The antiquity of the place can be gauged from the fact that the Buddha used to make frequent visits to this place. </HTML>");
img=new ImageIcon(getClass().getResource("/images/nalanda2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+20,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
bihar bihr=new bihar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bihr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bihr.setVisible(true);
bihr.setTitle("Famous Places of Bihar");
bihr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
nalanda nlnda=new nalanda();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
nlnda.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
nlnda.setVisible(true);
nlnda.setTitle("Nalanda");
nlnda.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
