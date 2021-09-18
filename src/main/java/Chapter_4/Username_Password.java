package Chapter_4;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Username_Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input_u, input_p, u, p;
        u = "HuyHoang";
        p = "2021";
        
        System.out.println("Enter Username: ");
        input_u = input.nextLine();
        System.out.println("Enter Password: ");
        input_p = input.nextLine();
        
        if ((input_u.equals(u)) && input_p.equals(p)) {
            System.out.println("Correct Username and Password!");
        } else {
            System.out.println("Incorrect Username or Password!");
        }
    }
}
