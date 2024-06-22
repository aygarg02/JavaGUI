import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(70, 70, 100, 100);

    }
    class myrouter{
        public static  void main (String args[]){
            return;
        }
    }

}
