package Beginning;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Simple_Math {
    public static void main(String[] args) {
        System.out.println("Enter the number of seconds: ");
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        System.out.println("Minute(s): " + t/60);
        System.out.println("Second(s): " + t%60);
    }
}
