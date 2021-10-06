package October_6;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class P1_b8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter n: ");
        n = scan.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
