package goa;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class canacona extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
canacona()
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
l1=new JLabel("<HTML>Canacona<BR><BR>Fast Facts<BR>Location : 76 kms from Panaji.<BR>Attractions : Palolem Beach, Mallikarjun Temple (Shristal), Cabo Da Rama Fort, Cotigao Wildlife Sanctuary, Agonda Beach etc.<BR>Best Time To Visit : October to March. <BR>Introducing Canacona<BR>Of course, you have explored the marvellous expanses of palm fringed white sands and blue seas, magnificent churches and temples, delightful old mansion and villas, but your Goan tour does not end here, there is much more to see in this lush green paradise. Now your next destination is the Goa's southernmost territory, Canacona - one of the five Talukas of Goa, which boasts of some of the Goa's most spectacular scenery.Set against the picturesque backdrop of Sahyadri mountain range, Canacona is edged by the Arabian sea on its one side. Canacona shares boundaries with Quepeum Taluka in the north and Sangeum Taluka in the north-east, to its south lies the state of Karnataka. Chaudi is the administrative headquarters of Canacona Taluka and it also serves as the gateway to the beaches of South Goa including Agonda and Palolem. </HTML>");
img=new ImageIcon(getClass().getResource("/images/canacona2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(950,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
goa go=new goa();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
go.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
go.setVisible(true);
go.setTitle("Famous Places of Goa");
go.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
canacona cana=new canacona();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
cana.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
cana.setVisible(true);
cana.setTitle("Canacona");
cana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
