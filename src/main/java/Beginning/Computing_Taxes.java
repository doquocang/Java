package Beginning;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Computing_Taxes {
    public static void main(String[] args) {
        System.out.println("Enter Status Code: ");
        Scanner input = new Scanner(System.in);
        int status = input.nextInt();
        if (status == 0) {
            System.out.println("Compute tax for single filers.");
        } else if (status == 1) {
            System.out.println("Compute tax for married file jointly or or qualifying widow(er).");
        } else if (status == 2) {
            System.out.println("Compute tax for married file separately.");
        } else if (status == 3) {
            System.out.println("Compute tax for head of household.");
        } else {
            System.out.println("Wrong Status Code");
        }
    }
}
