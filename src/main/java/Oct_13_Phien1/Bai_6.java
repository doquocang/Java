package Oct_13_Phien1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter n: ");
        boolean check = true;
        while (check) {
            n = input.nextInt();
            if (n == 1 || n == 2) {
                check = false;
            } else {
                System.out.println("Require re-enter! (n must be 1 or 2)");
            }
        }
        if (n == 1) {
            float a , b;
            System.out.println("Enter a and b: ");
            a = input.nextFloat();
            b = input.nextFloat();
            Bai_6.Equation(a, b);
        } else {
            float a , b, c;
            System.out.println("Enter a, b and c: ");
            a = input.nextFloat();
            b = input.nextFloat();
            c = input.nextFloat();
            Bai_6.Quadratic(a, b, c);
        }  
    }
    
    public static void Equation(double a, double b) {
        double x = -b/a;
        if (a == 0) {
            System.out.println("No solution!");
        } else {
            System.out.println("x = " + x);
        }
    }  
    
    public static void Quadratic(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("No solution!");
            } else {
                System.out.println("The equation has a solution: "
                        + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("The equation has 2 solutions: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("The equation has double solution: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("No solution!");
        }
    }
    
}
