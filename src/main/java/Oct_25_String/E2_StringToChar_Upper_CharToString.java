package Oct_25_String;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class E2_StringToChar_Upper_CharToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = scan.nextLine();
        char[] a = s.toCharArray();
        boolean check = true;
        for (int i = 0; i < a.length; i++) {
            if (check) {
                a[i] = Character.toUpperCase(a[i]);
                check = false;
            }
            if (a[i] == ' ') {
                check = true;
            }
        }
        s = String.valueOf(a);
        System.out.println(s);
    }    
}
