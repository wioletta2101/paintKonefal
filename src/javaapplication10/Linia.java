
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
    private int z=-1;
    private int p=-1;
    
     public Linia( int q, int w, int e, int t)
    {
        this.x = q;
        this.y = w;
        this.z = e;
        this.p = t;
    }
     
    public void paint(Graphics g)
    {

        //     //rysowanie linii
      g.setColor(Color.RED);
      if(x!=-1 && y!=-1)
      g.drawLine(x, y, z, p);
     
   }
}
