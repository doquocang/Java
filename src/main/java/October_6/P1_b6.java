package October_6;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class P1_b6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = scan.nextInt();
        System.out.printf("All primes in the range are: ", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (prime(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean prime(int n) { 
        if (n < 2) {
            return false;
        }
        int x = (int) Math.sqrt(n);
        for (int i = 2; i <= x; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
