import java.lang.String;

public class Main {
    public static void main(String[] args) {

        String epic = "*";

        // Up Triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // Down Triangle
        System.out.println(" ");
        for (int i = 5; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // Cube
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}