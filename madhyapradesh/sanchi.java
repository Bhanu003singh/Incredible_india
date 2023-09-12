package madhyapradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class sanchi extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
sanchi()
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
l1=new JLabel("<HTML>Sanchi<BR><BR>Fast Fact Temperature : Summer: 45- 25 C Winter: 22.5 - 10 C <BR>Best Season : October to March <BR>Clothing : Summer- Cotton, light clothing Winter - Light woollens for daywear, heavy woolens for night <BR>Languages spoken : English and Hindi <BR>STD Code: 07482 <BR>Tourist Office: Bhopal Regional Office Palash Residency, Near 45 Bungalow, T.T. Nagar, Bhopal - 462 003. <BR>Tel.: (0755) 2766750,2553006/66/76. Fax: (0755) 2577441.<BR>Sanchi’s stupas, monasteries, temples and pillars dating from the 3rd century BC to the 12th century AD have been declared a World Heritage Site by UNESCO. The most famous of these monuments, Stupa 1, known as the Great Stupa, was originally built by the Mauryan Emperor Ashoka, the then governor of Ujjayini, whose wife Devi was the daughter of a merchant from the adjacent town of Vidisha. <BR>Their son Mahindra and daughter Sanghamitra were born in Ujjayini and sent to Sri Lanka, where they converted to king, the queen and their people to Buddhism. The Sanchi hill goes up in shelves with Stupa 2 situated on a lower shelf, Stupa 1, Stupa 3, the 5th century Gupta Temple No.17 and the 7th century temple No. 18 are on the intermediate shelf and a later monastery is on the crowning shelf. The balustrade surrounding Stupa 2, carved with aniconic representations of the Buddha, was added in the late 2nd century BC under the Satavahanas.</HTML>");
img=new ImageIcon(getClass().getResource("/images/sanchi2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
madhyapradesh mp=new madhyapradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mp.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mp.setVisible(true);
mp.setTitle("Famous Places of Madhya Pradesh");
mp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
sanchi snch=new sanchi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
snch.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
snch.setVisible(true);
snch.setTitle("Sanchi");
snch.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
