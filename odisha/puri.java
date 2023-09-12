package odisha;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class puri extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
puri()
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
l1=new JLabel("<HTML>Puri<BR><BR>Fast Fact <BR>Temperature : Summer: 40-26 C Winter: 27-17 C <BR>Season : Throughout the year <BR>Clothing : Summer-Light cotton, Winter-Light woollen <BR>Languages spoken : Oriya, Bengali, Hindi, English <BR>STD Code : 06752 <BR>Tourism Office : Govt. of Odisha Tourist Office Puri, V.I.P Chhak, Station Road, Puri-2, <BR>Tel: 06752-222664 <BR>Puri is one of the four main Hindu pilgrim centres in India and is famous for its Jagannath Temple. This 65 metre high temple built in the 12th century AD dominates the landscape. Over one million people flock to this holy place every year to participate in the Rath Yatra or Car Festival. This annual ritual spread, over the entire summer and monsoon seasons, make this the most fruitful time to visit Puri. Puri is well-known for its golden beach with miles of yellow sand, blue waves, white surf and bright sunshine. With equable climate, Puri is a popular tourist resort frequented by visitors throughout the year.</HTML>");
img=new ImageIcon(getClass().getResource("/images/puri2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
odisha odsh=new odisha();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
odsh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
odsh.setVisible(true);
odsh.setTitle("Famous Places of Odisha");
odsh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
puri pri=new puri();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pri.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pri.setVisible(true);
pri.setTitle("Puri");
pri.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
