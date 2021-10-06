package October_6;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class P1_b3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Enter n: ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of all numbers from 1 to " + n + " is " + sum);
    }
}
