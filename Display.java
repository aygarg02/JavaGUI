import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class  Display extends JPanel {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        String a="this is the method to be cheacked at the last of the happenn in the window";
        JButton button =new JButton(a);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add( button);
        frame.setSize(300,300);
        frame.setVisible(true);



    }
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);


    }
}
class myDrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);


    }
}