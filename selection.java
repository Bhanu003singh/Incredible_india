import javax.swing.plaf.metal.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import andamanandnicobar.*;import andhrapradesh.*;import arunachalpradesh.*;import assam.*;import bihar.*;import chandigarh.*;import chhattisgarh.*;import dadraandnagarhaveli.*;import damananddiu.*;import delhi.*;import goa.*;import gujarat.*;import haryana.*;import himachalpradesh.*;import jammuandkashmir.*;import jharkhand.*;import karnataka.*;import kerala.*;import lakshadweep.*;import madhyapradesh.*;import maharashtra.*;import manipur.*;import meghalaya.*;import mizoram.*;import nagaland.*;import odisha.*;import puducherry.*;import punjab.*;import rajasthan.*;import sikkim.*;import tamilnadu.*;import tripura.*;import uttarakhand.*;import uttarpradesh.*;import westbengal.*;
import java.util.*;
class selection extends JFrame implements ActionListener,ItemListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36;
ImageIcon img;                  
Choice ch;
selection()
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
img=new ImageIcon(getClass().getResource("/images/andamannicobar.jpg"));
img=new ImageIcon(getClass().getResource("/images/andhrapradesh1.jpg"));
img=new ImageIcon(getClass().getResource("/images/arunachalpradesh.jpg"));
img=new ImageIcon(getClass().getResource("/images/assam.gif"));
img=new ImageIcon(getClass().getResource("/images/bihar.gif"));
img=new ImageIcon(getClass().getResource("/images/chandigarh2.jpg"));
img=new ImageIcon(getClass().getResource("/images/chhattisgarh1.jpg"));
img=new ImageIcon(getClass().getResource("/images/dadraandnagarhaveli1.jpg"));
img=new ImageIcon(getClass().getResource("/images/damandiu.jpg"));
img=new ImageIcon(getClass().getResource("/images/delhi.gif"));
img=new ImageIcon(getClass().getResource("/images/goa1.jpg"));
img=new ImageIcon(getClass().getResource("/images/gujarat.gif"));
img=new ImageIcon(getClass().getResource("/images/haryana.jpg"));
img=new ImageIcon(getClass().getResource("/images/himachalpradesh1.jpg"));
img=new ImageIcon(getClass().getResource("/images/jammukashmir1.jpg"));
img=new ImageIcon(getClass().getResource("/images/jharkhand.gif"));
img=new ImageIcon(getClass().getResource("/images/karnataka.jpg"));
img=new ImageIcon(getClass().getResource("/images/kerala.jpg"));
img=new ImageIcon(getClass().getResource("/images/lakshadweepmap.jpg"));
img=new ImageIcon(getClass().getResource("/images/madhyapradesh.jpg"));
img=new ImageIcon(getClass().getResource("/images/maharashtra.jpg"));
img=new ImageIcon(getClass().getResource("/images/manipur.jpg"));
img=new ImageIcon(getClass().getResource("/images/meghalaya3.jpg"));
img=new ImageIcon(getClass().getResource("/images/mizoram.jpg"));
img=new ImageIcon(getClass().getResource("/images/nagaland3.jpg"));
img=new ImageIcon(getClass().getResource("/images/odisha.jpg"));
img=new ImageIcon(getClass().getResource("/images/pondicherry.gif"));
img=new ImageIcon(getClass().getResource("/images/punjab1.jpg"));
img=new ImageIcon(getClass().getResource("/images/rajasthan.gif"));
img=new ImageIcon(getClass().getResource("/images/sikkim3.jpg"));
img=new ImageIcon(getClass().getResource("/images/tamilnadu1.jpg"));
img=new ImageIcon(getClass().getResource("/images/tripura.png"));
img=new ImageIcon(getClass().getResource("/images/uttarakhand1.jpg"));
img=new ImageIcon(getClass().getResource("/images/uttarpradesh.gif"));
img=new ImageIcon(getClass().getResource("/images/westbengal.gif"));
l1=new JLabel("Select your State");     
ch=new Choice();
ch.add("Select Destination");
ch.add("Andaman & Nicobar Islands");ch.add("Andhra Pradesh");ch.add("Arunachal Pradesh");ch.add("Assam");ch.add("Bihar");ch.add("Chandigarh");ch.add("Chattisgarh");ch.add("Dadra & Nagar Haveli");ch.add("Daman & Diu");ch.add("Delhi");ch.add("Goa");ch.add("Gujarat");ch.add("Haryana");ch.add("Himachal Pradesh");ch.add("Jammu & Kashmir");ch.add("Jharkhand");ch.add("Karnataka");ch.add("Kerala");ch.add("Lakshadweep");ch.add("Madhya Pradesh");ch.add("Maharashtra");ch.add("Manipur");ch.add("Meghalaya");ch.add("Mizoram");ch.add("Nagaland");ch.add("Odisha");ch.add("Puducherry");ch.add("Punjab");ch.add("Rajasthan");ch.add("Sikkim");ch.add("Tamil Nadu");ch.add("Tripura");ch.add("Uttarakhand");ch.add("Uttar Pradesh");ch.add("West Bengal");
l1.setBounds(80,160,200,35);
ch.setBounds(80,210,180,35);
ch.addItemListener(this);
b1=new JButton("Back to Menu");
b1.setBounds(80,280,170,30);
l2=new JLabel(img);
l2.setBounds(440,20,img.getIconWidth(),img.getIconHeight());
b2=new JButton("Explore");
l3=new JLabel(img);
l3.setBounds(400,20,img.getIconWidth(),img.getIconHeight());
b3=new JButton("Explore");
l4=new JLabel(img);
l4.setBounds(360,20,img.getIconWidth(),img.getIconHeight());
b4=new JButton("Explore");
l5=new JLabel(img);
l5.setBounds(340,20,img.getIconWidth(),img.getIconHeight());
b5=new JButton("Explore");
l6=new JLabel(img);
l6.setBounds(400,20,img.getIconWidth(),img.getIconHeight());
b6=new JButton("Explore");
l7=new JLabel(img);
l7.setBounds(480,20,img.getIconWidth(),img.getIconHeight());
b7=new JButton("Explore");
l8=new JLabel(img);
l8.setBounds(480,20,img.getIconWidth(),img.getIconHeight());
b8=new JButton("Explore");
l9=new JLabel(img);
l9.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
b9=new JButton("Explore");
l10=new JLabel(img);
l10.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
b10=new JButton("Explore");
l11=new JLabel(img);
l11.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
b11=new JButton("Explore");
l12=new JLabel(img);
l12.setBounds(460,20,img.getIconWidth(),img.getIconHeight());
b12=new JButton("Explore");
l13=new JLabel(img);
l13.setBounds(370,20,img.getIconWidth(),img.getIconHeight());
b13=new JButton("Explore");
l14=new JLabel(img);
l14.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
b14=new JButton("Explore");
l15=new JLabel(img);
l15.setBounds(430,20,img.getIconWidth(),img.getIconHeight());
b15=new JButton("Explore");
l16=new JLabel(img);
l16.setBounds(410,20,img.getIconWidth(),img.getIconHeight());
b16=new JButton("Explore");
l17=new JLabel(img);
l17.setBounds(390,20,img.getIconWidth(),img.getIconHeight());
b17=new JButton("Explore");
l18=new JLabel(img);
l18.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
b18=new JButton("Explore");
l19=new JLabel(img);
l19.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
b19=new JButton("Explore");
l20=new JLabel(img);
l20.setBounds(440,20,img.getIconWidth(),img.getIconHeight());
b20=new JButton("Explore");
l21=new JLabel(img);
l21.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
b21=new JButton("Explore");
l22=new JLabel(img);
l22.setBounds(390,20,img.getIconWidth(),img.getIconHeight());
b22=new JButton("Explore");
l23=new JLabel(img);
l23.setBounds(435,20,img.getIconWidth(),img.getIconHeight());
b23=new JButton("Explore");
l24=new JLabel(img);
l24.setBounds(380,20,img.getIconWidth(),img.getIconHeight());
b24=new JButton("Explore");
l25=new JLabel(img);
l25.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
b25=new JButton("Explore");
l26=new JLabel(img);
l26.setBounds(410,20,img.getIconWidth(),img.getIconHeight());
b26=new JButton("Explore");
l27=new JLabel(img);
l27.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
b27=new JButton("Explore");
l28=new JLabel(img);
l28.setBounds(390,20,img.getIconWidth(),img.getIconHeight());
b28=new JButton("Explore");
l29=new JLabel(img);
l29.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
b29=new JButton("Explore");
l30=new JLabel(img);
l30.setBounds(390,20,img.getIconWidth(),img.getIconHeight());
b30=new JButton("Explore");
l31=new JLabel(img);
l31.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
b31=new JButton("Explore");
l32=new JLabel(img);
l32.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
b32=new JButton("Explore");
l33=new JLabel(img);
l33.setBounds(430,20,img.getIconWidth(),img.getIconHeight());
b33=new JButton("Explore");
l34=new JLabel(img);
l34.setBounds(410,20,img.getIconWidth(),img.getIconHeight());
b34=new JButton("Explore");
l35=new JLabel(img);
l35.setBounds(410,20,img.getIconWidth(),img.getIconHeight());
b35=new JButton("Explore");
l36=new JLabel(img);
l36.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
b36=new JButton("Explore");


b2.setBounds(580,img.getIconHeight()+5,100,30);
b3.setBounds(620,img.getIconHeight()+10,100,30);
b4.setBounds(600,img.getIconHeight()+10,100,30);
b5.setBounds(610,img.getIconHeight()+5,100,30);
b6.setBounds(610,img.getIconHeight()+5,100,30);
b7.setBounds(700,img.getIconHeight()+60,100,30);
b8.setBounds(600,img.getIconHeight()+10,100,30);
b9.setBounds(620,img.getIconHeight()+10,100,30);
b10.setBounds(620,img.getIconHeight()+10,100,30);
b11.setBounds(600,img.getIconHeight()+5,100,30);
b12.setBounds(600,img.getIconHeight()+10,100,30);
b13.setBounds(610,img.getIconHeight()+10,100,30);
b14.setBounds(610,img.getIconHeight()+5,100,30);
b15.setBounds(610,img.getIconHeight()+10,100,30);
b16.setBounds(620,img.getIconHeight()+10,100,30);
b17.setBounds(610,img.getIconHeight()+10,100,30);
b18.setBounds(600,img.getIconHeight()+5,100,30);
b19.setBounds(600,img.getIconHeight()+5,100,30);
b20.setBounds(600,img.getIconHeight()+5,100,30);
b21.setBounds(620,img.getIconHeight()+5,100,30);
b22.setBounds(610,img.getIconHeight()+5,100,30);
b23.setBounds(660,img.getIconHeight()+10,100,30);
b24.setBounds(630,img.getIconHeight()+10,100,30);
b25.setBounds(620,img.getIconHeight()+10,100,30);
b26.setBounds(620,img.getIconHeight()+10,100,30);
b27.setBounds(610,img.getIconHeight()+5,100,30);
b28.setBounds(620,img.getIconHeight()+10,100,30);
b29.setBounds(620,img.getIconHeight()+20,100,30);
b30.setBounds(620,img.getIconHeight()+10,100,30);
b31.setBounds(610,img.getIconHeight()+25,100,30);
b32.setBounds(630,img.getIconHeight()+30,100,30);
b33.setBounds(610,img.getIconHeight()+30,100,30);
b34.setBounds(620,img.getIconHeight()+30,100,30);
b35.setBounds(630,img.getIconHeight()+30,100,30);
b36.setBounds(615,img.getIconHeight()+30,100,30);

 l2.setVisible(false);b2.setVisible(false);l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);

b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);b10.addActionListener(this);b11.addActionListener(this);b12.addActionListener(this);b13.addActionListener(this);b14.addActionListener(this);b15.addActionListener(this);b16.addActionListener(this);b17.addActionListener(this);b18.addActionListener(this);b19.addActionListener(this);b20.addActionListener(this);b21.addActionListener(this);b22.addActionListener(this);b23.addActionListener(this);b24.addActionListener(this);b25.addActionListener(this);b26.addActionListener(this);b27.addActionListener(this);b28.addActionListener(this);b29.addActionListener(this);b30.addActionListener(this);b31.addActionListener(this);b32.addActionListener(this);b33.addActionListener(this);b34.addActionListener(this);b35.addActionListener(this);b36.addActionListener(this);

add(l1);add(ch);add(b1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);add(l9);add(l10);add(l11);add(l12);add(l13);add(l14);add(l15);add(l16);add(l17);add(l18);add(l19);add(l20);add(l21);add(l22);add(l23);add(l24);add(l25);add(l26);add(l27);add(l28);add(l29);add(l30);add(l31);add(l32);add(l33);add(l34);add(l35);add(l36);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);add(b11);add(b12);add(b13);add(b14);add(b15);add(b16);add(b17);add(b18);add(b19);add(b20);add(b21);add(b22);add(b23);add(b24);add(b25);add(b26);add(b27);add(b28);add(b29);add(b30);add(b31);add(b32);add(b33);add(b34);add(b35);add(b36);
}
public void itemStateChanged(ItemEvent ie)                      
{
if(ch.getSelectedIndex()==1)
{
img=new ImageIcon(getClass().getResource("/images/andamannicobar.jpg"));
l2.setBounds(440,20,img.getIconWidth(),img.getIconHeight());
l2.setIcon(img);
l2.setVisible(true);b2.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==2)
{ 
img=new ImageIcon(getClass().getResource("/images/andhrapradesh1.jpg"));
l3.setBounds(400,20,img.getIconWidth(),img.getIconHeight());
l3.setIcon(img);  
l3.setVisible(true);b3.setVisible(true);
l2.setVisible(false);b2.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==3)
{ 
img=new ImageIcon(getClass().getResource("/images/arunachalpradesh.jpg"));
l4.setBounds(360,20,img.getIconWidth(),img.getIconHeight());
l4.setIcon(img);
l4.setVisible(true);b4.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l2.setVisible(false);b2.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==4)
{ 
img=new ImageIcon(getClass().getResource("/images/assam.gif"));
l5.setBounds(340,20,img.getIconWidth(),img.getIconHeight());
l5.setIcon(img);
l5.setVisible(true);b5.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l2.setVisible(false);b2.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==5)
{ 
img=new ImageIcon(getClass().getResource("/images/bihar.gif"));
l6.setBounds(400,20,img.getIconWidth(),img.getIconHeight());
l6.setIcon(img);
l6.setVisible(true);b6.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l2.setVisible(false);b2.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==6)
{ 
img=new ImageIcon(getClass().getResource("/images/chandigarh2.jpg"));
l7.setBounds(480,20,img.getIconWidth(),img.getIconHeight());
l7.setIcon(img);
l7.setVisible(true);b7.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l2.setVisible(false);b2.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==7)
{ 
img=new ImageIcon(getClass().getResource("/images/chhattisgarh1.jpg"));
l8.setBounds(480,20,img.getIconWidth(),img.getIconHeight());
l8.setIcon(img);
l8.setVisible(true);b8.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l2.setVisible(false);b2.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==8)
{ 
img=new ImageIcon(getClass().getResource("/images/dadraandnagarhaveli1.jpg"));
l9.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
l9.setIcon(img);
l9.setVisible(true);b9.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l2.setVisible(false);b2.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==9)
{ 
img=new ImageIcon(getClass().getResource("/images/damandiu.jpg"));
l10.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
l10.setIcon(img);
l10.setVisible(true);b10.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l2.setVisible(false);b2.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==10)
{ 
img=new ImageIcon(getClass().getResource("/images/delhi.gif"));
l11.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
l11.setIcon(img);
l11.setVisible(true);b11.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l2.setVisible(false);b2.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==11)
{ 
img=new ImageIcon(getClass().getResource("/images/goa1.jpg"));
l12.setBounds(460,20,img.getIconWidth(),img.getIconHeight());
l12.setIcon(img);
l12.setVisible(true);b12.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l2.setVisible(false);b2.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==12)
{ 
img=new ImageIcon(getClass().getResource("/images/gujarat.gif"));
l13.setBounds(370,20,img.getIconWidth(),img.getIconHeight());
l13.setIcon(img);
l13.setVisible(true);b13.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l2.setVisible(false);b2.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==13)
{ 
img=new ImageIcon(getClass().getResource("/images/haryana.jpg"));
l14.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
l14.setIcon(img);
l14.setVisible(true);b14.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l2.setVisible(false);b2.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==14)
{ 
img=new ImageIcon(getClass().getResource("/images/himachalpradesh1.jpg"));
l15.setBounds(430,20,img.getIconWidth(),img.getIconHeight());
l15.setIcon(img);
l15.setVisible(true);b15.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l2.setVisible(false);b2.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==15)
{ 
img=new ImageIcon(getClass().getResource("/images/jammukashmir1.jpg"));
l16.setBounds(410,20,img.getIconWidth(),img.getIconHeight());
l16.setIcon(img);
l16.setVisible(true);b16.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l2.setVisible(false);b2.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==16)
{ 
img=new ImageIcon(getClass().getResource("/images/jharkhand.gif"));
l17.setBounds(390,20,img.getIconWidth(),img.getIconHeight());
l17.setIcon(img);
l17.setVisible(true);b17.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l2.setVisible(false);b2.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==17)
{ 
img=new ImageIcon(getClass().getResource("/images/karnataka.jpg"));
l18.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
l18.setIcon(img);
l18.setVisible(true);b18.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l2.setVisible(false);b2.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==18)
{ 
img=new ImageIcon(getClass().getResource("/images/kerala.jpg"));
l19.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
l19.setIcon(img);
l19.setVisible(true);b19.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l2.setVisible(false);b2.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==19)
{ 
img=new ImageIcon(getClass().getResource("/images/lakshadweepmap.jpg"));
l20.setBounds(440,20,img.getIconWidth(),img.getIconHeight());
l20.setIcon(img);
l20.setVisible(true);b20.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l2.setVisible(false);b2.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==20)
{ 
img=new ImageIcon(getClass().getResource("/images/madhyapradesh.jpg"));
l21.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
l21.setIcon(img);
l21.setVisible(true);b21.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l2.setVisible(false);b2.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==21)
{ 
img=new ImageIcon(getClass().getResource("/images/maharashtra.jpg"));
l22.setBounds(390,20,img.getIconWidth(),img.getIconHeight());
l22.setIcon(img);
l22.setVisible(true);b22.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l2.setVisible(false);b2.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==22)
{ 
img=new ImageIcon(getClass().getResource("/images/manipur.jpg"));
l23.setBounds(435,20,img.getIconWidth(),img.getIconHeight());
l23.setIcon(img);
l23.setVisible(true);b23.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l2.setVisible(false);b2.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==23)
{ 
img=new ImageIcon(getClass().getResource("/images/meghalaya3.jpg"));
l24.setBounds(380,20,img.getIconWidth(),img.getIconHeight());
l24.setIcon(img);
l24.setVisible(true);b24.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l2.setVisible(false);b2.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==24)
{ 
img=new ImageIcon(getClass().getResource("/images/mizoram.jpg"));
l25.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
l25.setIcon(img);
l25.setVisible(true);b25.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l2.setVisible(false);b2.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==25)
{ 
img=new ImageIcon(getClass().getResource("/images/nagaland3.jpg"));
l26.setBounds(410,20,img.getIconWidth(),img.getIconHeight());
l26.setIcon(img);
l26.setVisible(true);b26.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l2.setVisible(false);b2.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==26)
{ 
img=new ImageIcon(getClass().getResource("/images/odisha.jpg"));
l27.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
l27.setIcon(img);
l27.setVisible(true);b27.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l2.setVisible(false);b2.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==27)
{ 
img=new ImageIcon(getClass().getResource("/images/pondicherry.gif"));
l28.setBounds(390,20,img.getIconWidth(),img.getIconHeight());
l28.setIcon(img);
l28.setVisible(true);b28.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l2.setVisible(false);b2.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==28)
{ 
img=new ImageIcon(getClass().getResource("/images/punjab1.jpg"));
l29.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
l29.setIcon(img);
l29.setVisible(true);b29.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l2.setVisible(false);b2.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==29)
{ 
img=new ImageIcon(getClass().getResource("/images/rajasthan.gif"));
l30.setBounds(390,20,img.getIconWidth(),img.getIconHeight());
l30.setIcon(img);
l30.setVisible(true);b30.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l2.setVisible(false);b2.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==30)
{ 
img=new ImageIcon(getClass().getResource("/images/sikkim3.jpg"));
l31.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
l31.setIcon(img);
l31.setVisible(true);b31.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l2.setVisible(false);b2.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==31)
{ 
img=new ImageIcon(getClass().getResource("/images/tamilnadu1.jpg"));
l32.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
l32.setIcon(img);
l32.setVisible(true);b32.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l2.setVisible(false);b2.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==32)
{ 
img=new ImageIcon(getClass().getResource("/images/tripura.png"));
l33.setBounds(430,20,img.getIconWidth(),img.getIconHeight());
l33.setIcon(img);
l33.setVisible(true);b33.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l2.setVisible(false);b2.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==33)
{ 
img=new ImageIcon(getClass().getResource("/images/uttarakhand1.jpg"));
l34.setBounds(410,20,img.getIconWidth(),img.getIconHeight());
l34.setIcon(img);
l34.setVisible(true);b34.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l2.setVisible(false);b2.setVisible(false);l35.setVisible(false);b35.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==34)
{ 
img=new ImageIcon(getClass().getResource("/images/uttarpradesh.gif"));
l35.setBounds(410,20,img.getIconWidth(),img.getIconHeight());
l35.setIcon(img);
l35.setVisible(true);b35.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l2.setVisible(false);b2.setVisible(false);l36.setVisible(false);b36.setVisible(false);
}
if(ch.getSelectedIndex()==35)
{ 
img=new ImageIcon(getClass().getResource("/images/westbengal.gif"));
l36.setBounds(450,20,img.getIconWidth(),img.getIconHeight());
l36.setIcon(img);
l36.setVisible(true);b36.setVisible(true);
l3.setVisible(false);b3.setVisible(false);l4.setVisible(false);b4.setVisible(false);l5.setVisible(false);b5.setVisible(false);l6.setVisible(false);b6.setVisible(false);l7.setVisible(false);b7.setVisible(false);l8.setVisible(false);b8.setVisible(false);l9.setVisible(false);b9.setVisible(false);l10.setVisible(false);b10.setVisible(false);l11.setVisible(false);b11.setVisible(false);l12.setVisible(false);b12.setVisible(false);l13.setVisible(false);b13.setVisible(false);l14.setVisible(false);b14.setVisible(false);l15.setVisible(false);b15.setVisible(false);l16.setVisible(false);b16.setVisible(false);l17.setVisible(false);b17.setVisible(false);l18.setVisible(false);b18.setVisible(false);l19.setVisible(false);b19.setVisible(false);l20.setVisible(false);b20.setVisible(false);l21.setVisible(false);b21.setVisible(false);l22.setVisible(false);b22.setVisible(false);l23.setVisible(false);b23.setVisible(false);l24.setVisible(false);b24.setVisible(false);l25.setVisible(false);b25.setVisible(false);l26.setVisible(false);b26.setVisible(false);l27.setVisible(false);b27.setVisible(false);l28.setVisible(false);b28.setVisible(false);l29.setVisible(false);b29.setVisible(false);l30.setVisible(false);b30.setVisible(false);l31.setVisible(false);b31.setVisible(false);l32.setVisible(false);b32.setVisible(false);l33.setVisible(false);b33.setVisible(false);l34.setVisible(false);b34.setVisible(false);l35.setVisible(false);b35.setVisible(false);l2.setVisible(false);b2.setVisible(false);
}
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
men.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
if(ae.getSource()==b2)
{
andaman andmn=new andaman();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
andmn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
andmn.setVisible(true);
andmn.setTitle("Andaman & Nicobar Islands");
andmn .setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b3)
{
andhrapradesh ap=new andhrapradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ap.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ap.setVisible(true);
ap.setTitle("Famous Places of Andhra Pradesh");
ap.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b4)
{
arunachal arnchl=new arunachal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
arnchl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
arnchl.setVisible(true);
arnchl.setTitle("Famous Places of Arunachal Pradesh");
arnchl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b5)
{
assam assm=new assam();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
assm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
assm.setVisible(true);
assm.setTitle("Assam");
assm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b6)
{
bihar bihr=new bihar();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
bihr.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
bihr.setVisible(true);
bihr.setTitle("Famous Places of Bihar");
bihr.setDefaultCloseOperation(DISPOSE_ON_CLOSE) ;
}
if(ae.getSource()==b7)
{
chandigarh chd=new chandigarh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chd.setVisible(true);
chd.setTitle("Famous Places of Chandigarh");
chd .setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b8)
{
chhattisgarh chtsgrh=new chhattisgarh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
chtsgrh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
chtsgrh.setVisible(true);
chtsgrh.setTitle("Famous Places of Chhattisgarh");
chtsgrh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b9)
{
dadra ddra=new dadra();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
ddra.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
ddra.setVisible(true);
ddra.setTitle("Dadra & Nagar Haveli");
ddra.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b10)
{
daman damn=new daman();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
damn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
damn.setVisible(true);
damn.setTitle("Daman & Diu");
damn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b11)
{
delhi dl=new delhi();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
dl.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
dl.setVisible(true);
dl.setTitle("Famous Places of Delhi");
dl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b12)
{
goa go=new goa();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
go.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
go.setVisible(true);
go.setTitle("Famous Places of Goa");
go.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b13)
{
gujarat gjrt=new gujarat();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
gjrt.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
gjrt.setVisible(true);
gjrt.setTitle("Famous Places of Gujarat");
gjrt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b14)
{
haryana hryna=new haryana();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hryna.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hryna.setVisible(true);
hryna.setTitle("Famous Places of Haryana");
hryna.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b15)
{
himachal hp=new himachal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
hp.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
hp.setVisible(true);
hp.setTitle("Famous Places of Himachal Pradesh");
hp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b16)
{
jammukashmir jk=new jammukashmir();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jk.setVisible(true);
jk.setTitle("Famous Places of Jammu & Kashmir");
jk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b17)
{
jharkhand jhrknd=new jharkhand();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
jhrknd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
jhrknd.setVisible(true);
jhrknd.setTitle("Famous Places of Jharkhand");
jhrknd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b18)
{
karnataka kntk=new karnataka();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kntk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kntk.setVisible(true);
kntk.setTitle("Famous Places of Karnataka");
kntk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b19)
{
kerala kerla=new kerala();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
kerla.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
kerla.setVisible(true);
kerla.setTitle("Famous Places of Kerala");
kerla.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b20)
{
lakshadweep lkshdwp=new lakshadweep();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
lkshdwp.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
lkshdwp.setVisible(true);
lkshdwp.setTitle("Lakshadweep");
lkshdwp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b21)
{
madhyapradesh mp=new madhyapradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mp.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mp.setVisible(true);
mp.setTitle("Famous Places of Madhya Pradesh");
mp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b22)
{
maharashtra mh=new maharashtra();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mh.setVisible(true);
mh.setTitle("Famous Places of Maharashtra");
mh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b23)
{
manipur mnipur=new manipur();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mnipur.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mnipur.setVisible(true);
mnipur.setTitle("Manipur");
mnipur.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b24)
{
meghalaya mghlya=new meghalaya();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mghlya.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mghlya.setVisible(true);
mghlya.setTitle("Meghalaya");
mghlya.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b25)
{
mizoram mzorm=new mizoram();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
mzorm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
mzorm.setVisible(true);
mzorm.setTitle("Mizoram");
mzorm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b26)
{
nagaland nglnd=new nagaland();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
nglnd.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
nglnd.setVisible(true);
nglnd.setTitle("Nagaland");
nglnd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b27)
{
odisha odsh=new odisha();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
odsh.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
odsh.setVisible(true);
odsh.setTitle("Famous Places of Odisha");
odsh.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b28)
{
puducherry pdchry=new puducherry();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pdchry.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pdchry.setVisible(true);
pdchry.setTitle("Puducherry");
pdchry.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b29)
{
punjab pnjb=new punjab();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
pnjb.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
pnjb.setVisible(true);
pnjb.setTitle("Famous Places of Punjab");
pnjb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b30)
{
rajasthan rjsthn=new rajasthan();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
rjsthn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
rjsthn.setVisible(true);
rjsthn.setTitle("Famous Places of Rajasthan");
rjsthn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b31)
{
sikkim sikkm=new sikkim();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
sikkm.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
sikkm.setVisible(true);
sikkm.setTitle("Sikkim");
sikkm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b32)
{
tamilnadu tn=new tamilnadu();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
tn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
tn.setVisible(true);
tn.setTitle("Famous Places of Tamil Nadu");
tn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b33)
{
tripura tripra=new tripura();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
tripra.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
tripra.setVisible(true);
tripra.setTitle("Tripura");
tripra.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b34)
{
uttarakhand uk=new uttarakhand();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
uk.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
uk.setVisible(true);
uk.setTitle("Famous Places of Uttarakhand");
uk.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b35)
{
uttarpradesh up=new uttarpradesh();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
up.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
up.setVisible(true);
up.setTitle("Famous Places of Uttar Pradesh");
up.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
if(ae.getSource()==b36)
{
westbengal wb=new westbengal();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
wb.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
wb.setVisible(true);
wb.setTitle("Famous Places of West Bengal");
wb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}

public static void main(String args[])
{
selection selctn=new selection();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
selctn.setSize((int)dimension.getWidth(),(int)dimension.getHeight());
selctn.setVisible(true);
selctn.setTitle("Selection Frame");
selctn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}
