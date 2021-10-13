package Oct_13_Phien3;

import java.util.Random;

/**
 *
 * @author admin
 */
public class Bai_3 {
    public static void main(String[] args) {
        int a[] = new int[100];
        a = Set(a);
        bubbleSort(a);
        Print(a);
        System.out.println("");
        bubbleSortDeg(a);
        Print(a);
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
}
