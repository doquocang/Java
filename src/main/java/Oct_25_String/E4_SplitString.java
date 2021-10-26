package Oct_25_String;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class E4_SplitString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap mang: ");
        String s = scan.nextLine();
        String[] splitS = s.split(" ");
        for (String w : splitS) {
            System.out.println(w);
        }
    }    
}
