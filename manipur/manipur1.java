package manipur;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class manipur1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
manipur1()
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
l1=new JLabel("<HTML>Manipur<BR><BR>Fast Facts <BR>Area: 22,327 sq km <BR>Population: 2,293,896 <BR>Capital: Imphal <BR>Principal Languages: Manipuri, Hindi, English <BR>Best time to visit: October to May <BR>Useful information: Foreign Tourists earlier needed Restricted Area Permit to visit Manipur has been lifted recently for 1 year from January, 2011 onwards.<BR> Manipur is blessed with an amazing variety of flora and fauna, with over 67 percent of its geographical area being hill tracts covered by forests. There are 500 varieties of orchids which grow in Manipur of which 472 have been identified, in addition to 'Siroi Lily' which is the only terrestrial lily grown on the hill tops of Siroi hill, Ukhrul. However, the most unique is the Sangai, the dancing deer. The floating mass of vegetation on the Loktak Lake sustains small herds of this endemic deer which unfortunately has the dubious distinction of being the most threatened Cervid (known as Phumdi) in the world. The state of Manipur shares 352 km common International boundary with Myanmar and lies south of Nagaland, north of Mizoram and east of Assam.</HTML>");
img=new ImageIcon(getClass().getResource("/images/manipur2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+10,1200,350);
l2.setBounds(380,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
manipur mnipur=new manipur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mnipur.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mnipur.setVisible(true);
mnipur.setTitle("Manipur");
mnipur.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
manipur1 mnipur1=new manipur1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mnipur1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mnipur1.setVisible(true);
mnipur1.setTitle("Manipur");
mnipur1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
