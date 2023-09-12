package westbengal;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class shantiniketan extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
shantiniketan()
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
l1=new JLabel("<HTML>Shantiniketan<BR><BR>Fast Facts <BR>Temperature :Summer: 39-34C Winter: 15-12 C <BR>Season :Throughout the year <BR>Clothing : Summer - Cotton/Tropical, Winter - Woollens<BR>Languages spoken : Bengali, Hindi, English <BR>STD Code : 03463<BR> Shantiniketan (the abode of peace) is famous for the world renowned ViswaBharati University founded by the Nobel laureate Rabindranath Tagore in 1921. <BR>In this universityyou will find a unique setting for imparting education, with classes held in the open. Situated in the lush surroundings, this university is a veritable abode of peace and tranquillity where with prior appointment you can spend time with students and teachers to learn more.<BR> Located in the Birbhum district of West Bengal,Santiniketan is also a repository of exotic sculptures, frescoes, murals and paintings of Rabindranath,Nandlal Bose, Ramkinkar, BindobehariMukhopadhyaya and many other artists of international fame.</HTML>");
img=new ImageIcon(getClass().getResource("/images/shantiniketan2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,350);
l2.setBounds(400,30,img.getIconWidth(),img.getIconHeight());
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
shantiniketan shnt=new shantiniketan();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
shnt.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
shnt.setVisible(true);
shnt.setTitle("Shantiniketan");
shnt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
