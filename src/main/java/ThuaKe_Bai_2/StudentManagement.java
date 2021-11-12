package ThuaKe_Bai_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Writer;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;

/**
 *
 * @author admin
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Nhap so luong hoc sinh: ");
        int n = scan.nextInt();
        scan.nextLine();
        Student[] st = new Student[n];
        //Nhap thong tin sinh vinh
        for (int i = 0; i < n; i ++) {
            st[i] = new Student();
            st[i].nhap();
        }
        //Xuat ra danh sach sinh vien
        for (int i = 0; i < n; i++) {
            System.out.println(st[i].toString() + "\n");
        }
        //Sap xep va in ra man hinh
        ArrayList<Student> stList = new ArrayList<>();
        Collections.addAll(stList, st);
        stList.sort(Comparator.reverseOrder());
        for(int i = 0; i < stList.size(); i++) {
            System.out.println("Name: " + stList.get(i).getName() + "\n" 
                                + "Gpa: " + stList.get(i).getGpa() + "\n"
                                + "Social activities: " + stList.get(i).getSocial_activities() + "\n---.---");
        } 
        //gi du lieu vao file
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Study\\Java\\Test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);   
            oos.writeObject(stList);
            oos.flush();
            oos.close(); 
        } catch(IOException e) {
            System.out.println("Error");
        }
        //lay du lieu tu file
        ArrayList<Student> studentFile = new ArrayList<>();
        try {   
            FileInputStream f = new FileInputStream("D:\\Study\\Java\\Test.txt"); 
            ObjectInputStream inStream = new ObjectInputStream(f);  
            studentFile = (ArrayList<Student>) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error Read file");
        }
        
        //in ra man hinh du lieu vua lay ra.
        for(int i = 0; i < stList.size(); i++) {
            System.out.println("Name: " + stList.get(i).getName() + "\n" 
                                + "Gpa: " + stList.get(i).getGpa() + "\n"
                                + "Social activities: " + stList.get(i).getSocial_activities() + "\n---.---");
        } 
    }
    
}
