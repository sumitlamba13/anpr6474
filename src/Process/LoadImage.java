/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author HP
 */
public class LoadImage extends JFrame{

    public LoadImage() {
        setSize(500,500);
        setLocationRelativeTo(null);
        setTitle(" hello world ");
        addWindowListener(new WindowAdapter(){
           
            public void Windowclosing(WindowEvent e){
                dispose();
            }       
        });
    }
    public LoadImage(Image img){
        this();
        ImageIcon icon=new ImageIcon();
        JLabel lbl = new JLabel();
        lbl.setIcon(icon);
        add(lbl);
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadImage().setVisible(true);
            }
        });
    }
}
