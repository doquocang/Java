package October_6_Phien_2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class P2_b2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter n: ");
        n = scan.nextInt();
        if (n >= 0) {
            int fact = 1;
            for(int i = 1; i <= n; i++)
            {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        } else {
            System.out.println("Math ERROR!");
        }
    }
}
