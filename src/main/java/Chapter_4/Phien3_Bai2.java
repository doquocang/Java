package Chapter_4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Phien3_Bai2 {
    public static void main(String[] args) {
        double inch, metre; 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter inch length: ");
        inch = input.nextDouble();
        metre = inch/0.39370/100;
        System.out.println("Metre length is: " + metre);
    }
}
