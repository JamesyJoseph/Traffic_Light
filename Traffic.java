import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TrafficLight implements ActionListener
   {
    JFrame f;
    JRadioButton rb1;
    JRadioButton rb2;
    JRadioButton rb3;
    Color redc;
    Color yellowc;
    Color greenc;
    TrafficLight()
      {
       f=new Frame("TRAFFIC LIGHT");
       rb1=new JRadioButton("RED");
       rb2=new JRadioButton("YELLOW");
       rb2=new JRadioButton("GREEN");
       f.add(rb1);
       f.add(rb2);
       f.add(rb3);
       rb1.addActionListener(this);
       rb2.addActionListener(this);
       rb3.addActionListener(this);
       f.setSize(600,800);
       f.setLayout(null);
       f.setVisible(true);
      }
    public void actionPerformed(ActionEvent ae)
      {
       if(rb1.isSeleced()==true)
        {
         redc=Color.red;
         yellowc=getBackground();
         greenc=getBackground();
        }
       else if(rb2.isSeleced()==true)
        {
         redc=getBackground();
         yellowc=Color.yellow;
         greenc=getBackground();
        }
       else if(rb3.isSeleced()==true)
        {
         redc=getBackground();
         yellowc=getBackground();
         greenc=Color.green;
        } 
      repaint();
      }
    } 
   class Graphics extends TrafficLight
     {
      Graphics()
      {
      g.drawOval(50,50,50,50);
      g.drawOval(50,110,50,50);
      g.drawOval(50,170,50,50);
      public void paintComponent()
       {
        super.paintComponent(g);
        g.setColor(redc);
        g.fillOval(50,50,50,50);
        g.setColor(yellowc);
        g.fillOval(50,110,50,50);
        g.setColor(greenc);
        g.fillOval(50,170,50,50);
       }
      }
     }
   

class Traffic
   {
    public static void main(String args[])
     {
      TrafficLight tf=new TrafficLight();
      Graphics g=new Graphics();
     }
   }  
  
