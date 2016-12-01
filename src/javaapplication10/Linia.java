
package javaapplication10;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author student
 */
public class Linia implements Figura
{
    private int x=-1;
    private int y=-1;
    
     public Linia( int q, int w)
    {
        this.x = q;
        this.y = w;
    }
     
    public void paint(Graphics g)
    {

       // rysowanie kolka
       g.setColor(Color.RED);
       if(x!=-1 && y!=-1)
       g.drawOval(x-25, y-25, 50, 50);

   }
}
