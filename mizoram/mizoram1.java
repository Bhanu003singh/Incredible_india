package mizoram;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class mizoram1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
mizoram1()
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
l1=new JLabel("<HTML>Mizoram<BR><BR>Fast Facts <BR>Area: 21,081 sq km <BR>Population: 8,91,058 <BR>Capital: Aizawl <BR>Principal Languages: Mizo and English <BR>Best time to visit: October to May <BR>Useful information: Foreign Tourists earlier needed a Restricted Area Permit to visit Mizoram; this restriction has been lifted recently from January, 2011 onwards<BR>Mizoram is veritable treasure trove of natural beauty with its endless variety of landscape, hilly terrains, meandering streams, deep gorges, and rich wealth of flora and fauna. Flanked by Bangladesh on the west and Myanmar on the east and south, Mizoram occupies an importance strategic position having a long international boundary of 722 km. Mizoram is one of India’s most sparsely populated states but has a dazzling mix of cross-cultural vibrancy. Renowned for their hospitality, Mizos are a close-knit society with no class distinction or discrimination on grounds of gender. The entire society is knitted together by a code of ethics -- 'Tlawmngaihna' -- an untranslatable term meaning that everyone has a duty to be hospitable kind, unselfish and helpful to others.</HTML>");
img=new ImageIcon(getClass().getResource("/images/mizoram2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,350);
l2.setBounds(330,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
mizoram mzorm=new mizoram();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mzorm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mzorm.setVisible(true);
mzorm.setTitle("Mizoram");
mzorm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
mizoram1 mzorm1=new mizoram1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mzorm1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mzorm1.setVisible(true);
mzorm1.setTitle("Mizoram");
mzorm1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
