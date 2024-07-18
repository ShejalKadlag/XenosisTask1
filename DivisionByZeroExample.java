
import java.util.Scanner;

public class DivisionByZeroExample {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int userInput = sc.nextInt();

            int fixedNumber = 10;
            int result = fixedNumber / userInput;

            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
        } finally {
            System.out.println("Cleanup: Scanner resource closed.");
        }

    }
}
