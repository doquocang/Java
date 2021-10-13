package Oct_13_Phien1;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n = 0;
        System.out.println("Enter m, n: ");

        boolean check = true;
        while (check) {
            m = input.nextInt();
            n = input.nextInt();
            if (m > n) {
                check = false;
            } else {
                System.out.println("Require re-enter! (m must be greater than n)");
            }
        }
        System.out.println(n);
    }
}
