package odisha;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class similipal extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
similipal()
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
l1=new JLabel("<HTML>Similipal National Park<BR><BR>Fast Fact <BR>Temperature: Summer: 40-20 C Winter: 20-4.4 C <BR>Best Season: November to 15 June <BR>Clothing: Woollen in winter <BR>Languages spoken: Oriya, Hindi, English <BR>STD Code: 06792 (Baripada) <BR>Tourism Office: Government of Odisha Tourist Office, Baghra Road, Baripada- 757 001. District: Mayurbhanj, Odisha. <BR>Tele: 06792- 252710. <BR>Occupying an area of 2,700 square km in the Mayurbhanj district, Similipal National Park is wild and beautiful. Once the personal hunting grounds of the Mayurbhanj maharajas, the park is now a Project Tiger reserve -- India’s homegrown initiative to protect the tigers’ dwindling numbers. Other than tigers, this wild life sanctuary is also the abode of wild animals like leopards, elephants and rare reptile like mugger crocodiles. Thanks to its varied terrain and abundance of water bodies in the form of hills, waterfalls and rivers, the avian population in the park is also rich.</HTML>");
img=new ImageIcon(getClass().getResource("/images/similipal2.jpg"));
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
similipal simlpl=new similipal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
simlpl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
simlpl.setVisible(true);
simlpl.setTitle("Similipal National Park");
simlpl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
