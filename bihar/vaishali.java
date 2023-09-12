package bihar;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class vaishali extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
vaishali()
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
l1=new JLabel("<HTML>Vaishali<BR><BR>Fast Facts <BR>Temperature Summer: 45-32C Winter: 28-04C <BR>Season October to March<BR> Clothing Light cotton in summer and woollen in winter <BR>Languages spoken: Hindi, English, Magdhi <BR>STD Code 06224 <BR>Vaishali attracts visitors who come to this district town in Bihar for a close encounter with history and spirituality. One of the greatest cities of the 5th century BC, Vaishali is credited with being the world's first republic to have a duly elected assembly of representatives and efficient administration. The place finds mention in the great epic Ramayana. Buddha spent the last rainy season of life near the city of Vaishali and Lord Mahavir, the founder of Jainism, was born here. The second Buddhist Council was held in this town 100 years after Buddha’s death. </HTML>");
img=new ImageIcon(getClass().getResource("/images/vaishali2.jpg"));
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
bihar bihr=new bihar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bihr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bihr.setVisible(true);
bihr.setTitle("Famous Places of Bihar");
bihr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
vaishali vshli=new vaishali();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
vshli.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
vshli.setVisible(true);
vshli.setTitle("Vaishali");
vshli.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
