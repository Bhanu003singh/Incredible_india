package andamanandnicobar;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class andaman1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
andaman1()
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
l1=new JLabel("<HTML>Andaman & Nicobar Islands<BR><BR>Fast Facts <BR>Temperature 31C-23C <BR>Season October to May <BR>Clothing Cotton <BR>STD Code 03192 (Port Blair) <BR>Languages spoken: Hindi, Bengali, Telugu, Tamil, English, Nicobarese <BR>Tourism Centres: India Tourism 189 Junglighat Main Road, Old Super Shoppe Building, Port Blair, Tel: 03192 233006. Permits It is advisable to carry a few extra passport photographs and copies of your passport, as you would need to submit these to the authorities at Port Blair on arrival for your permit to visit the Island. <BR>Visiting the Andaman and Nicobar Islands is a unique and exhilarating experience. Spectacular scenery, white sandy beaches and swaying palms combine with monuments and museums, world-class diving, swimming and sun basking make this a truly out-of-the-world experience. The Archipelago contains 362 volcanic islands scattered in the Bay of Bengal, with only 37 of these being inhabited. These lush green islands have colourful historical past, with strings of invasions by the French, Dutch, Japanese and British and wars between settlers and the native tribes. The Cellular Jail, where hundreds of Indian revolutionaries were imprisoned during the Indian freedom struggle, still stands tall. Descendents of these political prisoners and the local tribes of the area are the inhabitants of modern day Andaman and Nicobar. The tropical rain forests that loom close to the seashore are home to unique species of birds, and to tribes that still haven't learned to use fire. </HTML>");
img=new ImageIcon(getClass().getResource("/images/nicobar.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+10,1200,350);
l2.setBounds(420,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
andaman andmn=new andaman();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
andmn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
andmn.setVisible(true);
andmn.setTitle("Andaman & Nicobar Islands");
andmn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
andaman1 andmn1=new andaman1();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
andmn1.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
andmn1.setVisible(true);
andmn1.setTitle("Andaman & Nicobar Islands");
andmn1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
