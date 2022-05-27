import javax.swing.*;
import java.util.Scanner;
import java.awt.*;

public class mainfile5 
{
    JFrame fr=new JFrame("clock Demo");
    JLabel la=new JLabel("bharat mahan hai");

    public mainfile5()
    {
        fr.setSize(400,400);
        fr.setLocationRelativeTo(null);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setLayout(new FlowLayout(FlowLayout.CENTER,150,100));
        fr.add(la);
        setTime();

        fr.setVisible(true);
    }
    public void setTime()
    {
        la.setFont(new Font("lucida calligraphy",Font.BOLD,25));
    }
    public static void main(String[] args) 
    {
        new mainfile5()
    }    
}
