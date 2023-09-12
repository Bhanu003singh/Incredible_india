package tamilnadu;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class coimbatore extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
coimbatore()
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
f=new Font("",Font.BOLD,14);
l1=new JLabel("<HTML>Coimbatore<BR><BR>Fast Facts <BR>Temperature: Summer: 39.4 - 23.3 C Winter: 32.8 - 20.7 C <BR>Season: Throughout the year (best season September-February) <BR>Clothing: Tropical <BR>STD Code: 0422 Tourism Office: Tourist Information Counter, Gandhipuram (opposite bus terminus) Tel: 0422 2303176<BR>Coimbatore, an ancient city, was the capital of a small tribal village, Kongunad, before the 2nd century AD until it was brought under Chola control in the 2nd-3rd centuries AD by Karikalan, the first of the early Cholas. <BR>Among its other great rulers were the Rashtrakutas, Chalukyas, Pandyas, Hoysalas and the Vijayanagara kings. When Kongunad fell to the British along with the rest of the state, its name was changed to Coimbatore. Today, Coimbatore (Kovai in Tamil) is a commercial city of considerable importance; it is home to over 60 spinning and weaving mills and textiles is its main industry. It is also well known for motor sports with regular events being held at the Kari Motor Speedway.</HTML>");
img=new ImageIcon(getClass().getResource("/images/coimbatore.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+70,1200,350);
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
coimbatore cmbtr=new coimbatore();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
cmbtr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
cmbtr.setVisible(true);
cmbtr.setTitle("Coimbatore");
cmbtr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
