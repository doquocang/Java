package October_6_Phien_2;

/**
 *
 * @author admin
 */
public class P2_b6 {
    public static void main(String[] args) {
        System.out.println("All primes in the range are: ");
            for (int i = 10000; i < 99999; i+=2) {
                if (prime(i)) {
                    System.out.print(" " + i);
                }
            }
    }
    public static boolean prime(int n) { 
        if (n < 2) {
            return false;
        }
        int x = (int) Math.sqrt(n);
        for (int i = 2; i <= x; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }    
}
