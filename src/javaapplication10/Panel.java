
package javaapplication10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Panel extends JPanel implements MouseListener{

    private int x=-1;
    private int y=-1;
    
 public Panel()
 {
    addMouseListener(this);
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
//     System.out.println("mousePressed");
 }
 public void mouseReleased(MouseEvent e)
 {
//     System.out.println("mouseReleased");
 }

 public void mouseClicked(MouseEvent e)
 {
     x=e.getX();
     y=e.getY();
     repaint(); 
//    JOptionPane.showMessageDialog(null,
//   e.getPoint().toString());
 }
 
 public void paint(Graphics g)
 {
     
    g.setColor(Color.RED);
    if(x!=-1 && y!=-1)
    g.drawOval(x-25, y-25, 50, 50);
//    g.clearRect(0, 0, getSize().width, getSize().height);

 }
}
