import java.util.Scanner;
import java.awt.*;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.*;

import javafx.scene.paint.Color;
public class mainfile3
{
    JFrame frame=new JFrame("Mouse Activity");
    JPanel panel=new JPanel();
    JLabel label=new JLabel("click here to Stop");
    

    public mainfile3()
    {
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.getContentPane().add(panel);
        panel.setBackground(java.awt.Color.yellow);
        panel.add(label);
        label.setBounds(50,500,400,50);
        label.setForeground(java.awt.Color.red);
        label.setFont(new Font("arial",3,25));
        frame.setVisible(true);
    }
    public static void main(String[] args) 
    {
        new mainfile3();
    }
}
