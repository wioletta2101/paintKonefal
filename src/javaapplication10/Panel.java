
package javaapplication10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Panel extends JPanel implements MouseListener, MouseMotionListener{

    private int x=-1;
    private int y=-1;
    private int z=-1;
    private int p=-1;
    
 public Panel()
 {
    addMouseListener(this);
    addMouseMotionListener(this);

 }
 public void mouseExited(MouseEvent e)
 {
//    System.out.println("mouseExited");
 }
 public void mouseEntered(MouseEvent e)
 {
//     System.out.println("mouseEntered");
 }
 public void mousePressed(MouseEvent e)
 {
          x=e.getX();
          y=e.getY();
          //repaint(); 
     System.out.println("mousePressed");
      
 }
 public void mouseReleased(MouseEvent e)
 {
     z=e.getX();
      p=e.getY();
      repaint();
     
     System.out.println("mouseReleased");
 }

 public void mouseClicked(MouseEvent e)
 {
     
//     x=e.getX();
//     y=e.getY();
//     repaint(); 

//    JOptionPane.showMessageDialog(null,
//   e.getPoint().toString());
 }
 
 public void paint(Graphics g)
 {
     //rysowanie kolka
//    g.setColor(Color.RED);
//    if(x!=-1 && y!=-1)
//    g.clearRect(0, 0, getSize().width, getSize().height);
//    g.drawOval(x-25, y-25, 50, 50);
     
     //rysowanie linii
     g.setColor(Color.RED);
     if(x!=-1 && y!=-1)
     g.drawLine(x, y, z, p);
     
 }
 
 public void mouseMoved(MouseEvent e)
 {
//    x=e.getX();
//     y=e.getY();
////     repaint(); 
     
 }
  public void mouseDragged (MouseEvent e)
 {
      
 }
 
 
 
}
