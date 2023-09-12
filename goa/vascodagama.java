package goa;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class vascodagama extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
vascodagama()
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
l1=new JLabel("<HTML>Vasco da Gama<BR><BR>Fast Facts<BR>Location : 29 kms from Panaji<BR>Attractions : Safa Shahouri Mosque, Mount Carmel Chapel, Miraculous Cross, Bondla Wildlife Sanctuary, Dudhsagar Waterfalls and vascodagama Temples. <BR>Best Time To Visit : November to March. <BR>Introducing vascodagama<BR>If you are looking for a connection between Goa's powerful deities and their passionate devotees, then vascodagama is a good place to soak yourself in spirituality. vascodagama, Goa's temple town will compel you to imagine what the state would have been like, if the Portuguese had not strolled beyond Africa. vascodagama came under Portuguese rule in the year 1549. The Portuguese destroyed the Adil Shah Fort in 1549, but Shivaji captured the fort and reconstructed it in 1675. In 1791, Portuguese once again occupied vascodagama after defeating the king of Sonda. The king of Sonda was sympathetic to the conditions of the fleeing Hindus and suggested them to conduct their religious rites in the temples of vascodagama. A dozen of temples were founded in vascodagama during his time to save the Gods from Portuguese attack, but the Portuguese ultimately destroyed those temples. Today, vascodagama looks like any other Indian town, with hardly any trace of the Portuguese, except the 18th century Municipal Building.vascodagama is famous as the home to five of Goa's important Hindu Temples and also the largest mosque of Goa. You can see a number of unique Hindu Temples, most of these look relatively new as they have been rebuilt after being destroyed by the Portuguese.</HTML>");
img=new ImageIcon(getClass().getResource("/images/vasco da gama2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+10,1200,350);
l2.setBounds(400,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
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
vascodagama pnji=new vascodagama();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pnji.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pnji.setVisible(true);
pnji.setTitle("Vasco da Gama");
pnji.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
