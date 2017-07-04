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

    public double width = 0.0;
    public double height = 0.0;

    public static void main(String[] args) {

        new Test();
    }

    public Test() {
        super ("Test");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // For calculate screen

        width = screenSize.width;
        height = screenSize.height;

        GUI(this);

//        GUI gui = new GUI();

//        Buttons buttons = new Buttons();


        buttons();
    }

    private void GUI(Test app) {
        int appWidth = 300,
            appHeight = 500;

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(appWidth, appHeight);
        app.setLayout(null);
        app.setLocation(((int) width / 2) - (appWidth / 2),((int) height / 2) - (appHeight / 2));
        app.setVisible(true);

    }

    public void buttons(){

        one = new JButton("1");
        one.setBounds(20,20,60,60);
        one.setFont(new Font("Comic Sanc", Font.PLAIN, 20));
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Width app.:  " + (width / 5) +  "\tHeight app.: " + height / 3);
            }
        });
        add(one);

        two = new JButton("2");
        two.setBounds(100, 100, (int) width / 40 , (int) height / 20);
        two.setFont(new Font("Arial", Font.PLAIN, 20));
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Width btn.: " + two.getWidth() + "\tHeight btn.: " + two.getHeight());
            }
        });
        add(two);
    }

}
