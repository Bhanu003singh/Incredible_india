package tamilnadu;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ooty extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
ooty()
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
l1=new JLabel("<HTML>Ooty<BR><BR>Fast Facts <BR>Temperature: Summer: 25 C- 10 C Winter: 21 C- 0 C <BR>Season: April to June and September to October <BR>Clothing: Heavy woollen in winter, light woollen in summer <BR>Language spoken: Tamil, Kannada, Malayalam, Hindi, Badaga and English. <BR>STD Code: 0423 Tourism Office: Wenlock Road, Udhagamandalam 643 001, Tel: 0423 244 3977, Fax: 0423 244 4369<BR>Udhagamandalam or Ooty, located at an altitude of 2,240 m, has a unique flavour among Indian towns. Its history, coupled with the pleasant temperate mountain climate and beautiful scenic grandeur against the backdrop of Nilgiri Hills, gives it a colonial charm, typical of a British era hill town which, in fact, it once was. <BR>Udhagamandalam was founded in 1819 by John Sullivan, the then Governor of Coimbatore, who promoted the place’s charms. Udhagamandalam‘s temperatures hover between 9°C to 19°C, offering a cool retreat from the heat of the plains below. It is for this and the beautiful greenery that the town of Udhagamandalam is rightly known as the Queen of Hills.</HTML>");
img=new ImageIcon(getClass().getResource("/images/ooty.jpg"));
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
ooty oty=new ooty();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
oty.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
oty.setVisible(true);
oty.setTitle("Ooty");
oty.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
