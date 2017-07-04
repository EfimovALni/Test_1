import javax.swing.*;

/**
 * Created by alex on 2.7.17.
 */
public class Test extends JFrame{
    private static boolean flag;

    public static void main(String[] args) {

        Operations operations = new Operations();

        for (int i = 0; i < 3; i++){
            System.out.println("Number of you dog: " + i);
        }

        Age age = new Age();
        morning(operations.left);

        new Test();
    }

    private static void morning(int left) {
        System.err.println("\nI'm happy & successful");
    }

    public Test() {
        super ("Test");
        GUI(this);
        Buttons buttons = new Buttons();

    }
    private void GUI(Test app) {
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(200,300);
        app.setLocation(500, 600);
        app.setVisible(true);

    }
}
