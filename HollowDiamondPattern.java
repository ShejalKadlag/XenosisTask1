import java.util.Scanner;

public class HollowDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();
        scanner.close();
        
        int n = rows / 2;

        // Upper part of the diamond
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            if (i > 0) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            if (i > 0) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}