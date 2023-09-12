package odisha;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class cuttack extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
cuttack()
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
l1=new JLabel("<HTML>Cuttack<BR><BR>Fast Fact <BR>Temperature: Summer: 45-19 C Winter: 22-04 C <BR>Season : October to March <BR>Clothing : Summer- Light cottons, Winter- Light woollens <BR>Languages spoken : Oriya, Hindi, English <BR>STD Code: 0671 <BR>Tourism Office: Government of Odisha Tourist Office, Cuttack, Arunodaya Market Building, Link Road, Cuttack-753001, <BR>Tel: 0671 2312225. <BR>Cuttack is Orissa’s oldest city and was established in 989 AD. A relaxed and laid-back city, Cuttack is today mainly a farmer and trader town, offering a refreshing array of landscapes, activities and characters, and whether one is city-lover keen on shopping, a history or archaeology enthusiast, a religious person, there is something on offer for everyone. Steeped in history, Barabati Fort is one of the principal visitor attractions in Orissa. The fort casts its historical shadow against the natural surroundings, and both history and nature blend into a rich, seamless harmony. </HTML>");
img=new ImageIcon(getClass().getResource("/images/cuttack2.jpg"));
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
cuttack cutk=new cuttack();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
cutk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
cutk.setVisible(true);
cutk.setTitle("Cuttack");
cutk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
