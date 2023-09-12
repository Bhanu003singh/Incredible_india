package haryana;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class yamunanagar extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
yamunanagar()
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
l1=new JLabel("<HTML>Yamunanagar & Jagadhri<BR><BR>Yamuna Nagar is a city and a municipal corporation in Yamuna Nagar district in the Indian state of Haryana. This town is known for the cluster of plywood units. The older town is called Jagadhri. The Jagadhari Railway Station services the city. It is a green, clean and prosperous industrial city. However, due to recent spur in Industrial units in and around the city have resulted in severe air, water and soil pollution issues. The city is turning up rapidly with the opening of multiplexes and various high end brand stores.Yamuna Nagar has the river Yamuna running through the district, and forming the eastern boundary with the neighbouring Saharanpur district.Towards its northern edge is a sub-mountainous region, which has more forest cover and lots of streams; it is the area where the river Yamuna flows out of the hills and into the plains. The northern boundary is also an interstate boundary with the state of Himachal Pradesh to the north.<BR>Jagadhri is a city and a municipal council in Yamuna Nagar district in the Indian state of Haryana. This town is a part of twin towns, constituting Jagadhri and Yamuna Nagar; Jagadhri is the older one and the latter a relatively new town. There is hardly any demarcation between the two towns and almost impossible, without knowing, where one town ends and where other starts.The town is famous for its metal works & brassware including utensils; though nowadays the production of brass ware has fallen off, due to high cost. Subsequently, Jagadhari entered into and made its mark in high quality Aluminium and stainless steel products. In addition, jagadhri has also witnessed the blossoming of a new business, timber trading, in the last decade. There are many shops doing this business these days.Northern Railway Workshop, which employs thousands of employees, is the town's largest single industry, after that the Shree Gopal Paper Mills of Ballarpur Industries Limited is the town's second biggest industry. The third largest employer is Saraswati Sugar Mills & ISGEC, perhaps, the largest sugar mill in all of Asia. Apart from the big three there is the leaf spring company Jai Parabolic, as well as many plywood and board manufacturing companies. Jagadhari now has a Reliance Power plant, which has started, and brass metal industry.</HTML>");
img=new ImageIcon(getClass().getResource("/images/yamunanagar.jpeg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+80,1200,430);
l2.setBounds(520,50,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+80,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
haryana hryna=new haryana();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hryna.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hryna.setVisible(true);
hryna.setTitle("Famous Places of Haryana");
hryna.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
yamunanagar ynr=new yamunanagar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ynr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ynr.setVisible(true);
ynr.setTitle("Yamunanagar & Jagadhri");
ynr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
