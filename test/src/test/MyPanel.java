package test;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

class MyPanel extends JPanel implements KeyListener
{
    int x=10;
    int y=10;
    //÷ÿ–¥paint∑Ω∑®
    public void paint(Graphics g){
         
        super.paint(g);
         
        g.fillOval(x, y, 12, 12);
        //g.drawRect(50, 50, 10,5);
         
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        if(e.getKeyCode()==KeyEvent.VK_UP){
            y-=10;
            System.out.println("ladfnsadf");
             
        }else if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y+=10;
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){
             
            x-=10;
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
             
            x+=10;
        }
        this.repaint();
         
    }
    @Override
    public void keyTyped(KeyEvent e) {
      
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
     
}