import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Paint implements ActionListener {
    JFrame frame;
    public static void main(String[] args) {
class inner{

    frame=new JFrame();
}


        Paint paint=new Paint();
        paint.go();
    }
    public void go(){
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button =new JButton("change color");
        button.addActionListener(this);
        MyDrawPanel drawPannel=new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.NORTH,button);
        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.CENTER,drawPannel);
        System.out.println("this is alos called");
        
        frame.setSize(300,300);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
       frame.repaint();;
    }
}

