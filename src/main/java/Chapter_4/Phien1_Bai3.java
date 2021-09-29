package Chapter_4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Phien1_Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x;
        System.out.println("Enter a floating-point number: ");
        x = input.nextFloat();
        if (x < -1000000) {
            System.out.println("Large Negative");
        }
        else if (x < -1) {
            System.out.println("Negative");
        }
        else if (x < 0) {
            System.out.println("Small Negative");
        }
        else if (x == 0) {
            System.out.println("Zero");
        }
        else if (x < 1) {
            System.out.println("Small Positive");
        }    
        else if (x < 1000000) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Large Positve");
        }
    }
}
