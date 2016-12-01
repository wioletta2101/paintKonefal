
package javaapplication10;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Boolean.FALSE;
import java.util.ArrayList;
import javax.swing.*;
public class Panel extends JPanel implements MouseListener, MouseMotionListener{

    ArrayList<Figura> lista;
    int x2,y2;
    //boolean linia = FALSE;
    Linia linia;
    
    
    
    private int x=-1;
    private int y=-1;
    private int z=-1;
    private int p=-1;
    
 public Panel()
 {
    addMouseListener(this);
    addMouseMotionListener(this);
    lista = new ArrayList<Figura>();
   

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
      linia=null;
     
     System.out.println("mouseReleased");
 }

 public void mouseClicked(MouseEvent e)
 {
     
//      lista.add(new Linia(e.getX(), e.getY(), e.getX(), e.getY()));
//      repaint();
     
     
//     lista.add(new Kolo(e.getX(), e.getY()));
//     repaint();
//     x=e.getX();
//     y=e.getY();
//     repaint(); 

//    JOptionPane.showMessageDialog(null,
//   e.getPoint().toString());
 }
 
 public void paint(Graphics g)
 {
     g.clearRect(0, 0, getSize().width, getSize().height);
     for(Figura figura :lista)
         figura.paint(g);
//     //rysowanie kolka
////    g.setColor(Color.RED);
////    if(x!=-1 && y!=-1)
////    g.clearRect(0, 0, getSize().width, getSize().height);
////    g.drawOval(x-25, y-25, 50, 50);
//     
//     //rysowanie linii
//     g.setColor(Color.RED);
//     if(x!=-1 && y!=-1)
//     g.drawLine(x, y, z, p);
     
 }
 
 public void mouseMoved(MouseEvent e)
 {
//    x=e.getX();
//     y=e.getY();
////     repaint(); 
     
 }
  public void mouseDragged (MouseEvent e)
 {
     lista.remove(linia);
     linia = new Linia(x, y, e.getX(), e.getY());
      lista.add(linia);
      repaint();
 }
 
 
 
}
