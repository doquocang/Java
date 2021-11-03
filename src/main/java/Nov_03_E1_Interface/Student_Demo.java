package Nov_03_E1_Interface;
import java.io.*;

/**
 *
 * @author admin
 */
public class Student_Demo {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
       
        Student a = new Student("Do Quoc An", "22/2/2002", "Nam", 1.1, 2);
        Student b = (Student)a.clone();
        System.out.println("Thong tin hoc sinh b");
        System.out.println(b.toString());
       
        System.out.println("So sanh 2 diem trung binh cua 2 hoc sinh");
        System.out.println(a.compareTo(b));
        
        System.out.println("Dua du lieu hoc sinh a vao file");
        FileOutputStream fos
            = new FileOutputStream("D:\\xyz.txt");
        ObjectOutputStream oos
            = new ObjectOutputStream(fos);
        oos.writeObject(a);
        
        System.out.println("Lay du lieu tu file");
        // De-serializing 'a'
        FileInputStream fis
            = new FileInputStream("D:\\xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student c = (Student)ois.readObject(); // 
        System.out.println(c.toString());
        oos.close();
        ois.close();
    }   
}
