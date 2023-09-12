package kerala;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class varkala extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
varkala()
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
l1=new JLabel("<HTML>Varkala<BR><BR>Fast Fact <BR>Temperature: Summer: 40 -22 C Winter: 33 -12 C <BR>Best Season : Throughout the year <BR>Clothing : tropical <BR>Languages spoken : Malayalam, English <BR>STD Code: 0470 <BR>Tourist Office: Kerala Tourism Information Office Near Govt. Guest House, Papanasam Beach, Varkala. <BR>Tel: +91-471-2602126 (PP).<BR> A famous beach destination in southern Kerala, Varkala comes lauded as a sacred pilgrimage center too. Like the white cliffs of Dover, the pink  cliffs at the Varkala Beach offer sensational view of the Arabian Sea. Mineral water springs originating from the cliff is believed to possess medicinal properties. A dip in the holy waters at the beach is believed to purge the body of impurities and the soul of all sins; hence the name 'Papanasam beach'. The place is home to 2000-year-old Vishnu Shrine of Janardhanaswamy. The Sivagiri Mutt established by the great social reformer, Sree Narayana Guru is another start attraction of the place.</HTML>");
img=new ImageIcon(getClass().getResource("/images/varkala2.jpg"));
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
kerala kerla=new kerala();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kerla.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kerla.setVisible(true);
kerla.setTitle("Famous Places of Kerala");
kerla.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
varkala vrkla=new varkala();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
vrkla.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
vrkla.setVisible(true);
vrkla.setTitle("Varkala");
vrkla.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
