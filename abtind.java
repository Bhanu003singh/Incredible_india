import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class abtind extends JFrame implements ActionListener
{
ImageIcon img;
JLabel l1,l2; 
JButton b1;
Font f;
abtind()
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
f=new Font("",Font.BOLD,12);
l1=new JLabel("<HTML>India, officially the Republic of India (Bharat Ganrajya), is a country in South Asia. It is the seventh-largest country by area, the second-most populous country with over 1.2 billion people, and the most populous democracy in the world. Bounded by the Indian Ocean on the south, the Arabian Sea on the south-west, and the Bay of Bengal on the south-east, it shares land borders with Pakistan to the west; China, Nepal, and Bhutan to the north-east; and Burma and Bangladesh to the east. In the Indian Ocean, India is in the vicinity of Sri Lanka and the Maldives; in addition, India's Andaman and Nicobar Islands share a maritime border with Thailand and Indonesia.<BR>Home to the ancient Indus Valley Civilisation and a region of historic trade routes and vast empires, the Indian subcontinent was identified with its commercial and cultural wealth for much of its long history. Four world religions—Hinduism, Buddhism, Jainism, and Sikhism—originated here, whereas Zoroastrianism, Christianity, and Islam arrived in the 1st millennium CE and also helped shape the region's diverse culture. Gradually annexed by and brought under the administration of the British East India Company from the early 18th century and administered directly by the United Kingdom from the mid-19th century, India became an independent nation in 1947 after a struggle for independence that was marked by non-violent resistance led by Mahatma Gandhi.<BR>The Indian economy is the world's tenth-largest by nominal GDP and third-largest by purchasing power parity (PPP).Following market-based economic reforms in 1991, India became one of the fastest-growing major economies; it is considered a newly industrialised country. However, it continues to face the challenges of poverty, corruption, malnutrition, inadequate public healthcare, and terrorism. A nuclear weapons state and a regional power, it has the third-largest standing army in the world and ranks seventh in military expenditure among nations. India is a federal constitutional republic governed under a parliaindtary system consisting of 28 states and 7 union territories. India is a pluralistic, multilingual, and multi-ethnic society. It is also home to a diversity of wildlife in a variety of protected habitats.<BR>The name India is derived from Indus, which originates from the Old Persian word Hindus. The latter term stems from the Sanskrit word Sindhu, which was the historical local appellation for the Indus River. The ancient Greeks referred to the Indians as Indoi , which translates as 'the people of the Indus'.The geographical term Bharat (pronounced, which is recognised by the Constitution of India as an official name for the country, is used by many Indian languages in its variations. The eponym of Bharat is Bharata, a theological figure that Hindu scriptures describe as a legendary emperor of ancient India. Hindustan was originally a Persian word that meant 'Land of the Hindus'; prior to 1947, it referred to a region that encompassed northern India and Pakistan. It is occasionally used to solely denote India in its entirety.<HTML>");
l1.setFont(f);
img=new ImageIcon(getClass().getResource("/images/india.gif"));
l2=new JLabel(img);
b1=new JButton("Back");
l1.setBounds(30,10,680,650);
l2.setBounds(730,30,img.getIconWidth(),img.getIconHeight());
b1.setBounds(450,650,100,35);
b1.addActionListener(this);
add(l1);add(l2);add(b1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.dispose();
menu men=new menu();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
men.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
men.setVisible(true);
men.setTitle("Menu Frame");
men.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
abtind ind=new abtind();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ind.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ind.setVisible(true);
ind.setTitle("About India");
ind.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}


