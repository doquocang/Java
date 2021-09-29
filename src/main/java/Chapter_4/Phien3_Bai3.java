package Chapter_4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Phien3_Bai3 {
    public static void main(String[] args) {
        int n, sum; 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number n(0 <= n <= 1000): ");
        n = input.nextInt();
        sum = (n%10) + (n/10)%10 + ((n/100)%10);
        System.out.println("The sum of all digits in: " + n + " is: " + sum);
    }
}
