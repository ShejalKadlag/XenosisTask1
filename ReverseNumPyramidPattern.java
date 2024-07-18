import java.util.*;

public class ReverseNumPyramidPattern {

    public static void printPattern(int n) {
        int i, j;

        for (i = n; i >= 1; i--) // number of rows
        {
            for (j = 1; j <= i; j++) // number of columns
            {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 6;
        printPattern(n);
    }
}
