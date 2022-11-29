import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd number greater than 3 :");
        x = scanner.nextInt();
        if (x > 3 && x % 2 != 0) {
            petron(x);

        } else
            System.out.println("true");
    }

    public static void petron(int x) {
        for (int i = 0; i <= x / 2; i++) {
            for (int j = x / 2 - i; j > 0; j--) {
                System.out.println("  ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        for (int i = x / 2 + 1; i <= x - 1; i++) {
            for (int j = 1; j <= i - x / 2; j++) {
                System.out.print("   ");
            }
            for (int j = 2 * x - 2 * i - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}