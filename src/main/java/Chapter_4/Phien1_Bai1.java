package Chapter_4;

import java.util.Scanner;



/**
 *
 * @author admin
 */
public class Phien1_Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Enter a number: ");
        x = input.nextInt();
        System.out.println((x >= 0) ? "Number is positive" : "Number is negative");
    }
}
