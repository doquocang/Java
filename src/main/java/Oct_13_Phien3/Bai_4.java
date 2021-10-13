package Oct_13_Phien3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        a = Set(a);
        bubbleSort(a);
        Print(a);
        System.out.println("");
        bubbleSortDeg(a);
        Print(a);
        
        System.out.println();
        System.out.println("Enter the number to search: ");
        int x = scan.nextInt();
        System.out.println(SearchFirst(a, x));
        
        System.out.println();
        System.out.println("Enter the number to search: ");
        int x2 = scan.nextInt();
        int b[] = Search(a, x2);
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
    
    public static void Print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
    }
   
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    
    public static void bubbleSortDeg(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] < arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
    
    public static int SearchFirst(int a[], int find) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == find)
                return i + 1;
        }
        return -1;
    }
}
