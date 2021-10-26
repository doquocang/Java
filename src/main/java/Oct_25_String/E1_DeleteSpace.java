package Oct_25_String;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class E1_DeleteSpace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = scan.nextLine();
        s = s.replace(" ", "");
        System.out.println(s);
    }
}
