import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.util.*;

public class mainfile5 
{
    JFrame fr=new JFrame("clock Demo");
    JLabel la=new JLabel();

    public mainfile5()
    {
        fr.setSize(400,400);
        fr.setLocationRelativeTo(null);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setLayout(new FlowLayout(FlowLayout.CENTER,150,100));
        fr.add(la);
        new TimeThread().start();

        fr.setVisible(true);
    }
    public void setTime()
    {
        la.setFont(new Font("arial",Font.BOLD,25));
        Date dt=new Date();
        int h= dt.getHours();
        int m=dt.getMinutes();
        int s=dt.getSeconds();
        //adding the time to the string using the ternary operator
        String time=(h<10?"0"+h:h)+":"+(m<10?"0"+m:m)+":"+(s<10?"0"+s:s);
        
        la.setText(time);
    }
    class TimeThread extends Thread
    {
        public void run()
        {
            while(true)
            {
            setTime();
            try 
            {
            sleep(1000); 
            }
            catch (Exception e) 
            {}  
        } 
        }
    }
    public static void main(String[] args) 
    {
        new mainfile5();
    }    
}
