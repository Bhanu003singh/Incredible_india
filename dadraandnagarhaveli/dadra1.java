package dadraandnagarhaveli;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class dadra1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
dadra1()
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
l1=new JLabel("<HTML>Dadra & Nagar Haveli<BR><BR>Fast Fact <BR>Temperature : Summer: 37-23C Winter: 33-10 C <BR>Season : October to May <BR>Clothing: Cotton Tropical <BR>Languages spoken: Gujarati, Marathi, Hindi and English <BR>STD Code : 0260. <BR>Tourism Office Asst Director Tourism, UT of Dadra & Nagar Haveli, Silvassa, Tel: 2641399<BR>Endowed with nature's munificence, the Union Territory of Dadra and Nagar Haveli is wedged between the highly industrialised cities of Mumbai, Surat and Vapi. From 1779 to 1954, the land was administered by the Portuguese colonialists and later, after its liberation, by a local administration until 1961 when it was merged with the Indian Union. The capital, Silvassa, is a laidback, sleepy town with tall trees lining the roads, lush green forests and quaint sylvan surroundings. With an area of 487 sq km, the union territory captivates tourists with its promise of a gorgeous kaleidoscope of flora and fauna and matchless colonial charm.</HTML>");
img=new ImageIcon(getClass().getResource("/images/dadra1.jpg"));
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
dadra ddra=new dadra();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ddra.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ddra.setVisible(true);
ddra.setTitle("Dadra & Nagar Haveli");
ddra.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
dadra1 ddra1=new dadra1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ddra1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ddra1.setVisible(true);
ddra1.setTitle("Dadra & Nagar Haveli");
ddra1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
