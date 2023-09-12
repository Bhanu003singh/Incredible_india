package goa;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class panaji extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
panaji()
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
l1=new JLabel("<HTML>Panaji<BR><BR>Fast Facts<BR>Location : Goa<BR>Attractions : Altinho Hill, Bishop's Palace (Altinho), Boca de Vaca Spring, Mahalaxmi Temple, Kala Academy, Idalcao Palace, Immaculate Conception Church, Fontainhas etc.<BR>Best Time To Visit : November to February<BR>Introducing Panaji<BR>When Old Goa grew unhygenic and was struck with disease and death, the Portuguese decided to shift their capital to Panaji. They pulled down the imposing structures of Old Goa and carried the stones to Panaji, where they set up several impressive structure. That was how Panaji, situated on the left banks of Mandovi river, became the capital of Goa in the year 1843. Today, the Portuguese heritage of the city will present itself before you as you make your way through the remarkably well preserved narrow winding streets, old houses with overhanging balconies and numerous small cafes and bars. You will also get the Portuguese touch in dress and lifestyle of the local people. Other than exploring the Portuguese legacy, Panaji will also throw open for you numerous other options to enjoy yourself. It is the cultural capital of the state and as such provides you an opportunity to stir your soul with performances of local artists. Also, since the city of Panaji is netted, as if in a spider's net, with the network of waterways, river cruises are quiet an activity to enjoy. At one point of time, Panaji was the fishermen's habitat and hence the fish market of the town provides a visual impact in itself. The colourful fishes caught by the fishermen are sold here.</HTML>");
img=new ImageIcon(getClass().getResource("/images/panaji.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+40,1200,350);
l2.setBounds(350,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(900,img.getIconHeight()+100,100,25);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
goa go=new goa();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
go.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
go.setVisible(true);
go.setTitle("Famous Places of Goa");
go.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}}
public static void main(String args[])
{
panaji pnji=new panaji();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pnji.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pnji.setVisible(true);
pnji.setTitle("Panaji");
pnji.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
