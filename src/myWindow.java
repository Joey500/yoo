/**
 * Created by Pavilion on 7-4-2016.
 */
import javax.swing.JFrame;
import java.awt.*;

public class myWindow extends JFrame{
    public static void main(String[] args) {
     new myWindow();


    }
    public myWindow(){
        setSize(500,550);
        setVisible(true);
        setTitle("myWindow");

    }
    public void paint(Graphics g){
        g.drawRect(50,50,100,50);
        g.setColor(Color.GREEN);
        g.drawOval(200,50,100,28);
        g.fillRect(50,200,100,28);
    }
}
