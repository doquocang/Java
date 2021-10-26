package Oct_25_String;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class E6_count_the_occurrences_of_string {
    static int getOccuringString(String str, String subStr) {           
        int M = subStr.length();       
        int N = str.length();       
        int res = 0;
        for (int i = 0; i <= N - M; i++) {
            int j;           
            for (j = 0; j < M; j++) {
                if (str.charAt(i + j) != subStr.charAt(j)) {
                    break;
                }
            }
            if (j == M) {               
                res++;               
                j = 0;               
            }           
        }       
        return res;  
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = scan.nextLine();
        System.out.println("Enter string to find: ");
        String sub_S = scan.nextLine();
        System.out.println("The number of occurrences of the string just entered is: ");
        System.out.println(getOccuringString(s, sub_S));
    }
}
