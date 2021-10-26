package Oct_25_String;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class E7_Reverse_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String storageS = "";
        char ch;
        System.out.println("Enter string: ");
        String s = scan.nextLine();
        for (int i = 0; i < s.length(); i++) {
            ch= s.charAt(i);
            storageS = ch + storageS;
        }
        System.out.println("Reversed string: " + storageS);
    }
}
