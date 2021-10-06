package October_6;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class P1_b4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Enter n: ");
        n = scan.nextInt();
        while(n > 0) {
            sum += n%10;
            n = n/10;
        }
        System.out.println("The total number of digits is: " + sum);
    }
}
