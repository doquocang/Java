package October_6_Phien_2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class P2_b5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of primes: ");
        int count = 0, i = 0;
        int n = scan.nextInt();
        System.out.printf("All primes are: ", n);
        while(count < n) {
            if (prime(i)) {
                System.out.print(" " + i);
                count++;
            }
            i++;
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