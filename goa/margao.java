package goa;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class margao extends JFrame implements ActionListener
{
JLabel l1,l2;
JButton b1;
ImageIcon img;
Font f;
margao()
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
l1=new JLabel("<HTML>Margao<BR><BR>Fast Facts<BR>Location : 33 kms from Panaji<BR>Attractions : Town Square, Church Square, Monte Hill, Grace Church, St. Sebastian Chapel, Damodar Temple, Hari Mandir etc. <BR>Best Time To Visit : October to March<BR>Introducing Margao<BR>A riverine city, green paddy fields and low rolling hills is what defines Margao much better. Don't close your eyes if your are coming to Margao from other parts of Goa because you might miss some spectacular vistas. Its shaded streets are lined with graceful colonial mansions and churches, its colourful markets are full of the Goan products, with some items not found anywhere else. Margao is an ideal base from which you can venture forth into rural Salcete and also to many towns of Goa. The capital of Salcete province, Margao is a commercial and industrial centre of the Southern Goa. Margao was prosperous settlement even before the arrival of the Portuguese and it was an important centre for trade, learning and religious activities. The town was founded in the Portuguese pattern along the sweeping curves, around the Holy Spirit Church. Today the new buildings have mushroomed everywhere but this pleasant provincial town still displays many reminders of its Portuguese past.</HTML>");
img=new ImageIcon(getClass().getResource("/images/margao2.jpg"));
l1.setFont(f);
l2=new JLabel(img);
l2.setIcon(img);
b1=new JButton("Back");
b1.addActionListener(this);
l1.setBounds(80,img.getIconHeight()+20,1200,350);
l2.setBounds(400,30,img.getIconWidth(),img.getIconHeight());
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
margao mrgao=new margao();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mrgao.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mrgao.setVisible(true);
mrgao.setTitle("Margao");
mrgao.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
