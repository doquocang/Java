package October_6_Phien_2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class P2_b1 {
    public static void main(String[] args) {
        for (int i = 10; i <= 200;i ++) {
            if (i%7 == 0 && i%5 != 0) {
                System.out.println(i);
            }
        }
    }
}
