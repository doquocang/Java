package Chapter_4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Phien2_Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Enter year:");
        year = input.nextInt();
        System.out.println(((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) ? "Leap year" : "Not a Leap year");
    }
}
