package westbengal;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class kolkata extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
kolkata()
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
l1=new JLabel("<HTML>Kolkata<BR><BR>Fast Fact<BR> Temperature : Summer: 41.7-38.1C Winter: 29.3-9.6 C <BR>Season : Throughout the year <BR>Clothing : Tropical <BR>Languages spoken : Bengali, English, Hindi etc. <BR>STD Code: 033 <BR>Tourism Office:Indiatourism, Kolkata, 4 Shakespeare Sarani, Kolkata-700 071. <BR>Tel: 0332282-1475 / 5813/ 7731<BR><BR>Established in 1690 as the trading post for the English East India Company by Job Charnock, Kolkata, or Calcutta as it was formerly called, is the present capital of the eastern state of West Bengal and one of the largest cities in India. <BR>The city that once served as the showpiece capital of the British power in India is noteworthy for its colonial architecture including the Victoria Memorial. <BR>Other important sights include the Howrah Bridge, an engineering marvel that links the city and Howrah Station, the Indian Museum. Gateway to eastern India,and home to prominent intellectuals, the city is fiercely loved by Kolkatans.</HTML>");
img=new ImageIcon(getClass().getResource("/images/howrah-bridge-kolkata.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+50,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
westbengal wb=new westbengal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
wb.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
wb.setVisible(true);
wb.setTitle("Famous Places of West Bengal");
wb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
kolkata kolk=new kolkata();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kolk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kolk.setVisible(true);
kolk.setTitle("Kolkata");
kolk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
