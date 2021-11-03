package Nov_03_E2_Storage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author admin
 */
public class Car_Info {
    public static void main(String[] args) throws IOException {
        
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:\\testout.txt"));
            Car car_1 = new Car();
            car_1.input();
            oos.writeObject(car_1);
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
            Car car_1 = (Car) ois.readObject();
            System.out.println(car_1.toString());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
    
}