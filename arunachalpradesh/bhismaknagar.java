package arunachalpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class bhismaknagar extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
bhismaknagar()
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
l1=new JLabel("<HTML>Bhismaknagar<BR><BR>Bhismaknagar in Arunachal Pradesh is a holy heritage site of the Idu Mishmis. Bhimaknagar Arunachal Pradesh is a symbol of past grandeur and signifies the high standard of civilisation that once marked Bhismaknagar. It is believed that, Arunachal Pradesh Bhismaknagar was a strong hold of the Chutiyas in 12th-16th centuries BC. The excavations at this ancient town of Arunachal Pradesh throws new light on its much earlier relics. It speaks for the Catholic spirit of the ancient Indians and the contribution made by the Idus to the synthetic fabric of Indian culture. Archaeological ruins of Bhismaknagar Fort Bhismaknagar fort, located nearly 30 km from Roing dates back to 8th century BC. This fort is recorded as the oldest archaeological site in this region. It lies in Dibang Valley district. The fort is sacred heritage of the Idu Mishmis. It is a symbol of past glory and portrays the high standard of civilisation that once presented the splendour of Bhismaknagar. <BR>Dibang Valley<BR>The lush green surroundings of this valley is enchanting. The natural beauty of the valley is eye soothing. Trek through this beautiful valley and recollect some of your past glories.The accommodation at Bhismaknagar consists of Circuit House Roing, Inspection Bunglow Sunpura.</HTML>");
img=new ImageIcon(getClass().getResource("/images/bhismaknagar2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+10,1200,350);
l2.setBounds(400,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+80,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
arunachal arnchl=new arunachal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
arnchl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
arnchl.setVisible(true);
arnchl.setTitle("Famous Places of Arunachal Pradesh");
arnchl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
bhismaknagar bhsmk=new bhismaknagar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bhsmk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bhsmk.setVisible(true);
bhsmk.setTitle("Bhismaknagar");
bhsmk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
