package October_6_Phien_2;

import static October_6_Phien_2.P2_b5.prime;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class P2_b8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        if (prime(n)) {
            int num1 = 0, num2 = 1;
            System.out.println("Fibonacci series: ");
            for (int i = 1; i <= n; ++i) {
                System.out.print(num1 + ", ");
                int next = num1 + num2;
                num1 = num2;
                num2 = next;
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
