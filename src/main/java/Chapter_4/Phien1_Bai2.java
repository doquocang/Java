package Chapter_4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Phien1_Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter a, b, c : ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a >= b && a >= c) {
            System.out.println("The greatest: " + a);
	}
        if (b >= a && b >= c) {
            System.out.println("The greatest: " + b);
	}
	if (c >= a && c >= b) {
            System.out.println("The greatest: " + c);
	}
    }
}
