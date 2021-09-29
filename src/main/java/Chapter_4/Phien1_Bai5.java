package Chapter_4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Phien1_Bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b, _a, _b;
        System.out.println("Enter a floating-point number 1: ");
        a = input.nextFloat();
        System.out.println("Enter a floating-point number 2:");
        b = input.nextFloat();
        _a = Math.round(a * 1000) / 1000;
        _b = Math.round(b * 1000) / 1000;
        System.out.println((_a == _b) ? "They are same" : "They are different");
    }
}
