package damananddiu;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class daman1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
daman1()
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
l1=new JLabel("<HTML>Daman & Diu<BR><BR>Fast Facts <BR>Temperature: Summer: 36-20 C Winter: 30 -20C <BR>Season: October to May <BR>Clothing : Cotton, tropical <BR>Languages spoken: Gujarati, English and Hindi <BR>STD Code: 0260 Tourism Centres: Tourist Information Office, Govt. of Daman & Diu, Paryatan Bhavan, Near ST Bus Depot, Nani Daman-396210. Tel: 2255104. Diu-: STD Code: 02875 Tourism Centres: Tourist Information Office, Marine House, Diu Jetty, Diu - 362520. Tel: 252653, Fax: 252333. <BR>For all its diminutive size, Daman is a huge draw for tourists because it is packed with attractions including stunning scenic landscapes, with a depth of history. Formerly a Portuguese colony, this city in the union territory of Daman & Diu has some of the loveliest beaches in the Arabian Sea. Liberated in 1961, the town still carries haunting memories of a tumultuous era, which witnessed the colonial rule. The river Daman Ganga divides the town into two parts Moti Daman and Nani Daman. Daman is separated from Gujarat by the Kolak River in the north and the Kalai river in the south.<BR>DIU, a beautiful tiny island with a coastal length of 21 Kms, lying on the west coast of India, the island offers a wonderful holiday destination. Separated from the mainland by a tidal creek, Diu derives its name from the Sanskrit word 'Dweep'. Diu was one of the best sea ports and a naval base between the 14th and 16th Century, under the Portuguese rule.</HTML>");
img=new ImageIcon(getClass().getResource("/images/diu1.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,330);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
daman damn=new daman();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
damn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
damn.setVisible(true);
damn.setTitle("Daman & Diu");
damn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
daman1 damn1=new daman1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
damn1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
damn1.setVisible(true);
damn1.setTitle("Daman & Diu");
damn1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
