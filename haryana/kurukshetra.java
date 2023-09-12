package haryana;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class kurukshetra extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
kurukshetra()
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
l1=new JLabel("<HTML>Kurukshetra<BR><BR>Kurukshetra is a land of historical and religious importance. Historically the land belonged to Punjab, but now it is a district in Haryana state of India. It is a holy place and is also known as Dharmakshetra ('Holy City'). According to the Puranas, Kurukshetra is named after King Kuru, the ancestor of Kauravas and Pandavas, as depicted in epic Mahabharata. The importance of the place is attributed to the fact that the Kurukshetra War of the Mahabharata was fought on this land and the Bhagavad Gita was preached on this land during the war when Lord Krishna found Arjuna in a terrible dilemma.</HTML>");
img=new ImageIcon(getClass().getResource("/images/kurukshetra2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+10,1200,380);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
haryana hryna=new haryana();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hryna.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hryna.setVisible(true);
hryna.setTitle("Famous Places of Haryana");
hryna.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
kurukshetra kkr=new kurukshetra();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kkr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kkr.setVisible(true);
kkr.setTitle("Kurukshetra");
kkr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
