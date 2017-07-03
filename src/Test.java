/**
 * Created by alex on 2.7.17.
 */
public class Test {
    private static boolean flag;

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++){
            System.out.println("Number of you dog: " + i);
        }

        age(20);
        morning(5);
    }

    private static void age(int i) {
        for (int j = 0; j < i; j+=2) {
            System.out.print("_|-");
        }
        flag = true;
    }

    private static void morning(int i) {
        if (flag == true) {
            System.err.println("I'm happy & successful");
        }
    }
}
