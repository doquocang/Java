package Chapter_4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Phien3_Bai4 {
    public static void main(String[] args) {
        int m, leftover_d, y, d ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter minutes: ");
        m = input.nextInt();
        d = m/60/24;
        y = d/365;
        leftover_d = d%365;
        System.out.println(m + " minutes is approximately: " + y +" years and "  + leftover_d + " days");
    }
}
