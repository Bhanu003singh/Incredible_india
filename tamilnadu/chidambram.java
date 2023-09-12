package tamilnadu;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class chidambram extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
chidambram()
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
l1=new JLabel("<HTML>Chidambram<BR><BR>Fast Facts <BR>Temperature: Summer:37 - 36.4 C Winter: 21.3 - 20 C <BR>Season: September to February <BR>Clothing: Light cottons <BR>Language spoken: Tamil, English, Hindi, Sourashtran <BR>STD Code: 04144 Tourism Office: Railway station Road. Chidambaram 608 001 Tel: 04144 238739<BR>Chidambram is a holy pilgrimage site for devotees of Lord Shiva and Lord Vishnu. Legend has it that Lord Shiva himself came to reside here to please the saints but found that Godess Kali was already in residence. It was decided that a dance competition would be held and the winner would reside in Chidambram. <BR>Lord Shiva performed his cosmic dance Tandav while the Lasya was performed by Goddess Kali. Lord Shiva won the competition and became Lord of Chidambaram. The dance performed by Shiva came to be known as Oorthuva Thandavam. In recent times, Chidambaram has also become well known for the Annamalai University, the first residential university in Tamil Nadu.</HTML>");
img=new ImageIcon(getClass().getResource("/images/chidambaram.jpg"));
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
tamilnadu tn=new tamilnadu();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
tn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
tn.setVisible(true);
tn.setTitle("Famous Places of Tamil Nadu");
tn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
chidambram chdmbrm=new chidambram();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chdmbrm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chdmbrm.setVisible(true);
chdmbrm.setTitle("Chidambram");
chdmbrm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
