package Beginning;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Quadratic_Equation {
    public static void main(String[] args) {
        int a, b, c;
        double x1, x2, delta;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        System.out.println("Enter c: ");
        c = input.nextInt();
        delta = (Math.pow(b, 2) - 4*a*c);
        
        if (delta < 0) {
            System.out.println("No solution!");
        } else if (delta == 0) {
            System.out.println("The solution is: ");
            x1 = x2 = (-b/2*a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else {
            x1 = (-b + (Math.sqrt(delta)/(2*a)));
            x2 = (-b - (Math.sqrt(delta)/(2*a)));
            System.out.println("The solution is: ");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }
    }
}
