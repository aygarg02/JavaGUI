import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;
public class Animation {

JFrame frame;
int x=10;
int y=10;

public static void main(String[] args) {
    Animation ani=new Animation();
    ani.go();
}
public void go(){
    
    frame=new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    MyDrawPanel myDrawPanel=new MyDrawPanel();
    frame.getContentPane().add(myDrawPanel);
    frame.setSize(300,300);
    frame.setVisible(true);
    for(int i=0;i<1024;i++){
        x++;y++;
        myDrawPanel.repaint();
        try{
            Thread.sleep(50);
        }
        catch(Exception e){
          
        };
    }
    frame.setSize(300,300);
    frame.setVisible(true);
}
class MyDrawPanel extends JPanel{
   
    public void paintComponent(Graphics g){
    g.setColor(getBackground());
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.orange);
        // System.out.println("this is the systen of calls");
        g.fillOval(x, y, 100, 100);
    }

}





    
}
