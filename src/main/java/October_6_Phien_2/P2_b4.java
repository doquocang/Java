package October_6_Phien_2;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class P2_b4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0, num2 = 1;
        System.out.println("Enter the number of Fibonance: ");
        int n = scan.nextInt();
        System.out.println("Fibonacci series: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + ", ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
  }
}
