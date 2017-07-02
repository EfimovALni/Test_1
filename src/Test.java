/**
 * Created by alex on 2.7.17.
 */
public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            System.out.println("Number of you dog: " + i);
        }

        age(20);
    }

    private static void age(int i) {
        for (int j = 0; j < i; j+=2) {
            System.out.print("._-");
        }
    }
}
