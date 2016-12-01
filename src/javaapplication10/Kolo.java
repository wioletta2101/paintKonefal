/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication10;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author student
 */
public class Kolo implements Figura
{
    private int x=-1;
    private int y=-1;
    
     public Kolo( int q, int w)
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