package nagaland;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class nagaland1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
nagaland1()
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
l1=new JLabel("<HTML>Nagaland<BR><BR>Fast Facts <BR>Area : 16,579 sq km <BR>Population :1,988,636 <BR>Season : October to May<BR> Capital : Kohima <BR>Languages spoken : Angami, Ao, Chang, Konyak, Lotha, Sangtam, Sema, Chakhesang, Nagamese and English. STD Code : 0370<BR>Useful Information:Foreign Tourists earlier needed Restricted Area Permit to visit Nagaland,this regulation has been lifted recently from January 2011 onwards.The state is bounded by Arunachal Pradesh and parts of Assam in the North, Manipur is the South, Myanmar on the East and Assam in the West. Nagaland is a vibrant hill state that offers an incomparably rich traditional and cultural heritage. Nagaland is inhabited by 16 major tribes along with sub-tribes. Each of the 16 tribes and sub-tribes hasits own languages, customs and traditions. Nagaland is largely a mountainous, rich in flora and fauna. Very little is known of Naga history before the Burmese invasion of 1816 and the area’s inclusion into East India Company’s dominion.</HTML>");
img=new ImageIcon(getClass().getResource("/images/nagaland2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,280);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
nagaland nglnd=new nagaland();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
nglnd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
nglnd.setVisible(true);
nglnd.setTitle("Nagaland");
nglnd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
nagaland1 nglnd1=new nagaland1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
nglnd1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
nglnd1.setVisible(true);
nglnd1.setTitle("Nagaland");
nglnd1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
