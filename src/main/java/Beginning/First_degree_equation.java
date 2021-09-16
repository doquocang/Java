package Beginning;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class First_degree_equation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = input.nextDouble();
        System.out.println("Enter b: ");
        double b = input.nextDouble();
        System.out.print("The solution of equation ax + b = 0 is: " + (-b/a));
    }
}
