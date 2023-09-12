package bihar;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class patna extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
patna()
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
l1=new JLabel("<HTML>Patna<BR><BR>Fast Facts <BR>Temperature: Summer: 40-28C Winter: 29-20C <BR>Season: Throughout the year <BR>Clothing: Summer: Light cotton, Winter: woollens <BR>Languages spoken: Hindi, English <BR>STD Code: 0612 <BR>If your idea of a perfect holiday is a mix of history and culture, then Patna, the capital of the state of Bihar, is the place for you. It is an ancient place that traces its roots to over three millennia. And in each chapter of its history, it has been crowned by a new name -- Kusumpur, Pushpapur, Pataliputra and Azeemabad. Patna is an excellent starting point for visiting the Buddhist and Jain pilgrim centres of Vaishali, Rajgir, Nalanda, Bodhgaya and Pawapuri, not only because of its ample transport connections, but because the history of Patna, evidently one of the oldest cities in the world, is essentially the history of ancient India. </HTML>");
img=new ImageIcon(getClass().getResource("/images/patna2.jpg"));
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
patna ptna=new patna();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ptna.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ptna.setVisible(true);
ptna.setTitle("Patna");
ptna.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
