/**
 * ���ܣ������¼�����������
 * 1.������ϻ�һ��С��������ͨ�������������ҵĶ�
 */
package test;
import java.awt.*;
 
import javax.swing.*;
 
import java.awt.event.*;
 
public class lan1 extends JFrame{
 
    MyPanel mp=null;
    public static void main(String[] args) {
        lan1 test1=new lan1();
 
    }
 
    public  lan1(){
         
        mp=new MyPanel();
         
        this.add(mp);
         
        this.addKeyListener(mp);
         
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
     
}

