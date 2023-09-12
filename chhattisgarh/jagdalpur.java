package chhattisgarh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class jagdalpur extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
jagdalpur()
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
l1=new JLabel("<HTML>Jagdalpur<BR><BR>Fast Facts <BR>Area : 8.50 Sq. Km <BR>Altitude : 1824 ft. <BR>Temperature : Summer : 41.0-31.0°C. <BR>Winter : 17.5-12.0°C <BR>Season: September to March. <BR>STD Code: 07782 <BR>Tourist Information Centres:<BR> Chhattisgarh Tourism Board, Paryatan Bhavan, G.E.Road, Raipur – 492 006. <BR>Tel: 0771 – 4066415, 4028634 / 35 / 36. Fax: 4066425. Email : visitcg@rediffmail.com<BR> Website : www.chhattisgarhtourism.net<BR>Jagdalpur, the headquarters of the Bastar district is a small developing town and is a good base to visit the surrounding villages to see the life and culture of the tribes. </HTML>");
img=new ImageIcon(getClass().getResource("/images/jagdalpur2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+10,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
chhattisgarh chtsgrh=new chhattisgarh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chtsgrh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chtsgrh.setVisible(true);
chtsgrh.setTitle("Famous Places of Chhattisgarh");
chtsgrh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
jagdalpur jgdlpr=new jagdalpur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jgdlpr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jgdlpr.setVisible(true);
jgdlpr.setTitle("Jagdalpur");
jgdlpr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
