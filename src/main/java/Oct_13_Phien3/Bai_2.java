package Oct_13_Phien3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        a = Set(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
        System.out.println();
        System.out.println("Enter the number to search: ");
        int x = scan.nextInt();
        int b[] = Search(a, x);
        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                System.out.print(b[i] +" ");
            }
        }
    }
        
    public static int[] Set(int a[]) {
        
        for (int i = 0; i < a.length; i++) {
            Random rand = new Random();
            a[i] = rand.nextInt(100)+1;
        }
        return a;
    }
    
    public static int[] Search(int a[], int find) {
        int j = 0;
        int b[] = new int[100];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == find) {
                b[j] = i + 1;
                j++;
            }      
        }
        return b;
    }
}
