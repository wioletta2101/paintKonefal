package javaapplication10;
import javax.swing.*;



public class JavaApplication10 
{

    
    public static void main(String[] args) 
    {
         
        JFrame frame = new JFrame();
        Panel panel = new Panel();
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setVisible(true);

    
    
    }
}
