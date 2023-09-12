package bihar;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class sonepur extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
sonepur()
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
l1=new JLabel("<HTML>Sonepur Fair<BR><BR>Fast Fact <BR>Temperature: Summer: 40-30C Winter: 20C -10 C <BR>Best Season : October to March <BR>Clothing : Light cotton in summer and woolen in winter <BR>Languages spoken : Hindi and English <BR>STD Code: 06158<BR>Located on the confluence of river Ganga and Gandak, Sonepur in Saran district of Bihar comes alive with excitement and vibrancy during the famed Sonepur Cattle Fair or Sonepur Mela held on Kartik Poornima (the full moon day) in the month of November. Also known as Harihar Kshetra Mela, this annual celebration, which dates back to the Mauryan period, attracts visitors from all over Asia and offers the visitors the opportunity to enjoy sights, sounds & shopping in a unique way. Till date, it is the biggest cattle fair of Asia and stretches on from fifteen days to one month. </HTML>");
img=new ImageIcon(getClass().getResource("/images/sonepurfair2.jpg"));
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
sonepur sonpr=new sonepur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
sonpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
sonpr.setVisible(true);
sonpr.setTitle("Sonepur Fair");
sonpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
