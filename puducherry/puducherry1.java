package puducherry;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class puducherry1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
puducherry1()
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
l1=new JLabel("<HTML>Puducherry<BR><BR>Fast Fact <BR>Temperature : Summer: 34 - 24 C Winter: 25 - 31.2 C <BR>Season : Throughout the year <BR>Clothing : Tropical <BR>STD Code : 0413 <BR>Conducted Tour: The Pondicherry Tourism and Transport Development Corporation (PTTDC) Counter at Goubert Avenue (Tel: 0413 2339497/4575) conducts city sightseeing covering Aurobindo Ashram, Auroville, Water Sports Complex, Botanical Garden and Museum. Reservations can be made at the Tourist Information Bureau, Goubert Avenue. <BR>Tourism Office : 40 Goubert Avenue (Beach Road). Tel: 0413 2339497; New Bus stand Tel: 0413 2339497/4575<BR>A French colony up to 1954, Puducherry (earlier known as Pondicherry) is a small conclave in India that retains a distinctly French ambience and culture. This small, quiet Union Territory is well known for its fine cuisine and good hotels. The Ashram founded by Sri Aurobindo, the well-known philosopher, attracts thousands of people from all over the country and abroad who come here to learn yoga and to meditate. Puducherry is definitely a place to unwind for a great weekend getaway from Chennai or Bengaluru.</HTML>");
img=new ImageIcon(getClass().getResource("/images/puducherry2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,350);
l2.setBounds(380,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
puducherry pdchry=new puducherry();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pdchry.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pdchry.setVisible(true);
pdchry.setTitle("Puducherry");
pdchry.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
puducherry1 pdchry1=new puducherry1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pdchry1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pdchry1.setVisible(true);
pdchry1.setTitle("Puducherry");
pdchry1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
