import javax.swing.plaf.metal.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
class abtdev extends JFrame 
{
ImageIcon img;
JLabel l1,l2;
abtdev()
{
setLayout(null);
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
img=new ImageIcon(getClass().getResource("\Kismat singh\phone\kismat.jpg"));
l1=new JLabel(img);
l2=new JLabel("<HTML>Bhanu is an engineering student studying in JMIT college,Radaur one of the oldest colleges of Haryana . He is a IT student in 4rd year.<BR>He lives in Yamunanagar and did his schooling from New Happy Public School, one of the best schools of Yamunanagar.<BR>He passed his 10th and 12th with 84%. <BR>He has recently completed his Industrial Training in Core Java.</HTML>");
l1.setBounds(30,30,img.getIconWidth(),img.getIconHeight());
l2.setBounds(img.getIconWidth()+60,30,320,300);
add(l1);add(l2);
}
public static void main(String args[])
{
abtdev dev=new abtdev();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
dev.setSize((int)dimension.getWidth()/2+40,(int)dimension.getHeight()/2+70);
dev.setVisible(true);
dev.setTitle("About Project Developer");
dev.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}

