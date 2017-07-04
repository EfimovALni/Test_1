import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alex on 2.7.17.
 */
public class Test extends JFrame{
    public JButton one;
    public JButton two;


    public double width;
    public double height;

    public static void main(String[] args) {

        new Test();
    }

    public Test() {
        super ("Test");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.width;
        height = screenSize.height;

//        Buttons buttons = new Buttons();
        buttons();
        GUI(this);


    }
    private void GUI(Test app) {

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize((int) width / 5,(int) height / 3);
        app.setLayout(null);
        app.setLocation(400, 300);
        app.setVisible(true);
    }

    public void buttons(){

        one = new JButton("1");
        one.setBounds(20,20,60,60);
        one.setFont(new Font("Comic Sanc", Font.PLAIN, 20));
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("one");
                System.out.println((int) width / 5);
                System.out.println((int) height / 3);
            }
        });
        add(one);

        two = new JButton("2");
        two.setBounds(50, 50, Test.getWindows().length / 10 , Test.getFrames().length / 4);
        two.setFont(new Font("Arial", Font.PLAIN, 20));
        add(two);
    }

}
