package arunachalpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class bomdila extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
bomdila()
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
l1=new JLabel("<HTML>Bomdila<BR><BR>Bomdila is a beautiful small town situated at a height of about 8000 ft. above the sea level from where one can see the brilliant landscape and snow-clad mountains of the Himalayan Range. The Buddhist monastery of Bomdila is the repository of culture and is among primary attractions of the area.<BR>Bomdila is the headquarters of West Kameng district located at the height of 8500 ft above the sea level.  It has a lot of attractions for the tourists with its cool climate, Apple orchards, artistic people, snow-capped Himalayan peaks and Buddhist Gompas. The Buddhist monastery of Bomdila is the repository of culture..  This place has a tourist lodge, a craft centre displaying local crafts and a shopping centre where the visitors gets  first feel of the local version of Himalayan Buddhist life.<BR>Local site seeing to Dirang valley and the famous Sela Pass (13,700 ft. M.S.L.) are thrilling experience on the way to Tawang. The Orchid Research and Development Station at Tippi and two other Orchid conservation sanctuaries located at Sessa and Dirang are worth seeing places.</HTML>");
img=new ImageIcon(getClass().getResource("/images/bomdila2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+30,1200,350);
l2.setBounds(400,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
arunachal arnchl=new arunachal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
arnchl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
arnchl.setVisible(true);
arnchl.setTitle("Famous Places of Arunachal Pradesh");
arnchl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
bomdila bmdila=new bomdila();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bmdila.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bmdila.setVisible(true);
bmdila.setTitle("Bomdila");
bmdila.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
