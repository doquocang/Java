package October_6;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class P1_b9 {
    public static void main(String[] args) {
        int reverse = 0; 
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("a= ");
        n = scan.nextInt();
        while(n != 0)   
        {  
            int remain = n % 10;  
            reverse = reverse * 10 + remain;  
            n = n/10;  }  
            System.out.println("The reverse of the given number is: " + reverse);  
    }
}
