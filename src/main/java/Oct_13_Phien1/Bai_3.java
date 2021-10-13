package Oct_13_Phien1;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        String s = "Hello"; 
        System.out.println("Enter n: ");
        boolean check = true;
        while (check) {
            n = input.nextInt();
            if (n > 0) {
                check = false;
            } else {
                System.out.println("Require re-enter! (n must greater than zero)");
            }
        }
        for (int i = 0; i < n; i++) {
            Bai_3.Output(s);
        }
    }
    public static void Output(String s) {
        System.out.printf("%S\n", s);
    }
}
