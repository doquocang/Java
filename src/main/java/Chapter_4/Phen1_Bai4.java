package Chapter_4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Phen1_Bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, day;
        System.out.println("Enter a number: ");
        x = input.nextInt();
        day = x%7;
        switch (day) {
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;   
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;    
        }
    }
}
