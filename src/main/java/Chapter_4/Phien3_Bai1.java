package Chapter_4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Phien3_Bai1 {
    public static void main(String[] args) {
        double f, c; 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fahrenheit degree: ");
        f = input.nextDouble();
        c = (double) 5/9 *(f - 32);
        System.out.println("Celsius degree: " + c);
    }
}
