import javax.swing.plaf.metal.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
class menu extends JFrame implements ActionListener
{
JToolBar jtb;
JButton b1,b2,b3,b4,b5,b6;
Container c;
JPanel jp;
JMenuBar mb;
JMenu file,travel,media,help;
JMenuItem home,exit,desti,gallery,abt_ind,abt_pro_dev;
menu()
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
c=getContentPane();
jp=new JPanel();
jtb=new JToolBar();
b1=new JButton(new ImageIcon(getClass().getResource("/Images/home.jpeg")));
b2=new JButton(new ImageIcon(getClass().getResource("/Images/destination1.jpg")));
b3=new JButton(new ImageIcon(getClass().getResource("/Images/gallery.png")));     
b4=new JButton(new ImageIcon(getClass().getResource("/Images/india.jpg")));
b5=new JButton(new ImageIcon(getClass().getResource("/Images/info1.jpg")));
b6=new JButton(new ImageIcon(getClass().getResource("/Images/exit.png")));
b1.setToolTipText("Go To Home Screen");
b2.setToolTipText("Select Your Destination");
b3.setToolTipText("Open Gallery");
b4.setToolTipText("About India");
b5.setToolTipText("About Project Developer");
b6.setToolTipText("Exit");  
jtb.add(b1);jtb.add(b2);jtb.add(b3);jtb.add(b4);jtb.add(b5);jtb.add(b6);
jp.add(jtb);
c.add(jp,BorderLayout.WEST);
b1.addActionListener(this);b2.addActionListener(this);
b3.addActionListener(this);b4.addActionListener(this);
b5.addActionListener(this);b6.addActionListener(this);

mb=new JMenuBar();
setJMenuBar(mb);
file=new JMenu("File");
travel=new JMenu("Travel");
media=new JMenu("Media");
help=new JMenu("Help");
file.setMnemonic('F');
travel.setMnemonic('T');
media.setMnemonic('M');
help.setMnemonic('H');
home=new JMenuItem("Home");
exit=new JMenuItem("Exit");
desti=new JMenuItem("Destinations");
gallery=new JMenuItem("Gallery");
abt_ind=new JMenuItem("About India");
abt_pro_dev=new JMenuItem("About Project Developer");
file.add(home);file.add(exit);
travel.add(desti);media.add(gallery);
help.add(abt_ind);help.add(abt_pro_dev);
mb.add(file);
mb.add(travel);
mb.add(media);
mb.add(help);
home.addActionListener(this);
exit.addActionListener(this);
desti.addActionListener(this);
gallery.addActionListener(this);
abt_ind.addActionListener(this);
abt_pro_dev.addActionListener(this);
addWindowListener(new wclose());
setResizable(false);
}
class wclose extends WindowAdapter
{
public void windowClosing(WindowEvent we)
{
	login log=new login();
	//log.splash_screen();
	log.setSize(500,190);
	log.setVisible(true);
	//log.show();
	Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	int x = (int) ((dimension.getWidth() - log.getWidth()) / 2);
	int y = (int) ((dimension.getHeight() - log.getHeight()) / 2);
	log.setLocation(x, y); 
}
}
public void actionPerformed(ActionEvent ae)
{
Object ob=ae.getSource();
if(ob==home||ob==b1)
{
this.dispose();
homescreen hmscrn=new homescreen();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hmscrn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hmscrn.setVisible(true);
hmscrn.setTitle("Welcome");
hmscrn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ob==exit||ob==b6)
{
int response = JOptionPane.showConfirmDialog(null, "Really Do you want to Exit?", "Exit Message",
	        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	
	    if (response == JOptionPane.YES_OPTION) 
	    {
	    	setVisible(false);
	    	dispose();
	    	System.exit(0);    
	    }	
}
else if(ob==desti||ob==b2)
{
selection selctn=new selection();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
selctn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
selctn.setVisible(true);
selctn.setTitle("Selection Frame");
selctn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ob==gallery||ob==b3)
{
gallery galry=new gallery();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
galry.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
galry.setVisible(true);
galry.setTitle("Gallery");
galry.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ob==abt_ind||ob==b4)
{
abtind ind=new abtind();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ind.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ind.setVisible(true);
ind.setTitle("About India");
ind.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
else if(ob==abt_pro_dev||ob==b5)
{
abtdev dev=new abtdev();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
dev.setSize((int)dimension.getWidth()/2+40,(int)dimension.getHeight()/2+70);
dev.setVisible(true);
dev.setTitle("About Project Developer");
dev.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
menu men=new menu();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
men.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
men.setVisible(true);
men.setTitle("Menu Frame");
men.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}