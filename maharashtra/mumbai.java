package maharashtra;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class mumbai extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
mumbai()
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
l1=new JLabel("<HTML>Mumbai<BR><BR>Fast Fact <BR>Temperature: Summer: 33.3-22. 7C Winter: 29.5-19.4 C <BR>Best Season : Throughout the year <BR>Clothing : Tropical Languages spoken : Marathi, Hindi and English, <BR>STD Code: 022 Tourist Office: Indiatourism Office, 123, M Karve Road, Opp Church Gate, Mumbai-400 020. Tel: 22033144/5, 22074333/4. Fax: 22014496.<BR> Mumbai is a fascinating city, a compact mix of the traditional and the modern. A lively and varied place, this waterfront city, also the capital of Maharashtra, boasts a vibrant and cosmopolitan identity. Few cities in the world leave the tourists with such vivid impressions, whether it's the glitz and glamour of 'Bollywood', the spectacular array of Victorian buildings of the British Raj, the seaside rendezvous on the Juhu Beach, or the maze of alleyways and lively streets of Mumbai. <BR>For many tourists, however, its world-class museums and galleries - notably the superb Chhatrapati Shivaji Maharaj Vastu Sangrahalay, with its collection of the antiquities, - are reason enough to visit. This blend of old and new worlds makes for a fascinating exploration of the city's streets.<BR> An orientation of Mumbai is best begun from the Gateway of India, the most famous colonial landmark While Mumbai itself could take a lifetime to explore, it's also ideal as a base for visiting beautiful rock-cut Shiva temple on Elephanta Island - a short trip by launch across the harbor offering some respite from the frenetic activity of the city.</HTML>");
img=new ImageIcon(getClass().getResource("/images/Mumbai.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+5,1200,350);
l2.setBounds(410,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
maharashtra mh=new maharashtra();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mh.setVisible(true);
mh.setTitle("Famous Places of Maharashtra");
mh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
mumbai mum=new mumbai();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mum.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mum.setVisible(true);
mum.setTitle("Mumbai");
mum.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
