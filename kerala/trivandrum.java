package kerala;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class trivandrum extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
trivandrum()
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
l1=new JLabel("<HTML>Tiruvananthapuram<BR><BR>Fast Fact <BR>Temperature : Summer: 34-28C Winter: 26-20 C <BR>Best Season : September to May <BR>Clothing : Tropical <BR>Languages spoken : Malayalam, English <BR>STD Code: 0471 <BR>Tourist Office: Department of Tourism, Government of Kerala, Park View, ThiruvananthapuramKerala, India - 695 033 <BR>Phone: +91-471-2321132 <BR>Fax: +91-471-2322279.<BR>Thiruvananthapuram ('City of the Sacred Serpent'), the capital of Kerala, is bounded by the Arabian Sea on the west. Also known as Trivandrum in the popular parlance the city is home to temples and museums. The wooded highlands on the Western Ghats in the Eastern, and North Eastern borders give some of the most enchanting picnic spots, a long shoreline, with internationally renowned beaches, historic monuments, backwater stretches and a rich cultural heritage make this district a much sought after tourist destination. With a good infrastructure, the city is an excellent base to explore Varkala, a famous seaside holiday destination.</HTML>");
img=new ImageIcon(getClass().getResource("/images/thiruvananthapuram.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+40,1200,350);
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
trivandrum trvndm=new trivandrum();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
trvndm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
trvndm.setVisible(true);
trvndm.setTitle("Tiruvananthapuram");
trvndm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
