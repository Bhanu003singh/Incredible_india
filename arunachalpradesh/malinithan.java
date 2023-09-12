package arunachalpradesh;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class malinithan extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
malinithan()
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
l1=new JLabel("<HTML>Malinithan<BR><BR>Malinithan is a temple site in ruins. It is situated at the foot of the Siang hills under the Likabali Sub-Division of West Siang District of Arunachal Pradesh.  It is only 1 Km east of Likabali, the nearest administrative centre. Relics of stone images of Malinithan came to be noted from the early twenties of the present century.  In course of series of excavation from 1968 and ending 1971, ruins of temples and valuable scriptures were unearthed at this site. The fame of Malinithan as a holy place of worship draws a large number of visitors and piligrims.The site excavated   has beautifully designed and decorated basement of a temple, divine images, icons of deities, animal motifs and floral designs, carved columns and panels. These rich granite sculptures belong to 14 -15 century , the more important being Indra on Airavat, Surya on Chariot and huge Nandi bull. The temple dedicated to Goddess Durga at Malinithan is built on the classical tradition of Orissa. <BR>According to the local legend associated with the place, Lord Krishna carried away Rukmini the daughter of King Bhismaka on the eve of her marriage with Shishupal. Krishna and Rukmini were welcomed here by Parvati with garlands. Parvati thus acquired the name Malini and the place Malinithan.</HTML>");
img=new ImageIcon(getClass().getResource("/images/malinithan.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+30,1200,350);
l2.setBounds(400,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
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
malinithan mlnthn=new malinithan();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mlnthn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mlnthn.setVisible(true);
mlnthn.setTitle("Malinithan");
mlnthn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
