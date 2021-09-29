package Chapter_4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Phien2_Bai1 {
    static boolean checkYear(int year)
    {
        return (((year % 4 == 0) && (year % 100 != 0)) ||
            (year % 400 == 0));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, year, day = 28;
        System.out.println("Enter a month number:");
        month = input.nextInt();
        System.out.println("Enter a year number:");
        year = input.nextInt();
        switch (month) {
            case 1: day = 31;
                break;
            case 2: if (checkYear(year)) day = 29;
                break;
            case 3: day = 31;
                break;
            case 4: day = 30;
                break;   
            case 5: day = 31;
                break;
            case 6: day = 30;
                break;
            case 7: day = 31;
                break;   
            case 8: day = 31;
                break;   
            case 9: day = 30;
                break;    
            case 10: day = 31;
                break;   
            case 11: day = 30;
                break; 
            case 12: day = 31;
                break;       
        }
        System.out.println("Has: " + day + "days");
    }
}
