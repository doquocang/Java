package Nov_03_E3_File;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author admin
 */
public class File {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:\\testout.txt"));
            System.out.println("Enter string: ");
            String s = scan.nextLine();
            oos.writeObject(s);
            System.out.println("Success...");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("D:\\testout.txt"));
            // read student
            String s2 = (String) ois.readObject();
            System.out.println(s2);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
