package Beginning;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class An_Improved_Math_Learning_Tool {
    public static void main(String[] args) {
        System.out.println("What is 2 - 1?");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the question: ");
        int x = input.nextInt();
        if (x == 1) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
