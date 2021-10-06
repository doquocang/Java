package October_6;

/**
 *
 * @author admin
 */
public class P1_b7 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        System.out.println("Fibonacci series up to 10 terms: ");
        for (int i = 1; i <= 10; ++i) {
          System.out.print(num1 + ", ");
          int sotieptheo = num1 + num2;
          num1 = num2;
          num2 = sotieptheo;
        }
  }
}
