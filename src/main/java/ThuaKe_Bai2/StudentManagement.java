package ThuaKe_Bai2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.ObjectOutputStream;

/**
 *
 * @author admin
 */
public class StudentManagement {
    
    public static void main(String[] args) {
        //Nhap thong tin va so luong sinh vien
        System.out.println("Nhap so luong hoc sinh: ");
        Scanner scan = new Scanner(System.in);    
        int n = scan.nextInt();
        Student[] st = nhap(n);
        
        System.out.println("Danh sach sinh vien vua nhap:");
        ArrayList<Student> stList = new ArrayList<>();
        Collections.addAll(stList, st);
        xuat(stList);
        
        System.out.println("Sap xep danh sach sinh vien theo diem giam dan:");
        stList.sort(Comparator.reverseOrder());
        xuat(stList);
        
        System.out.println("Nhap xuat du lieu vao file: ");
        //nhap du lieu vao file
        write(stList);
        
        //lay du lieu tu file
        ArrayList<Student> stList_File = read();
        System.out.println("\nDu lieu cua file vua lay ra: ");
        xuat(stList_File);
    }
    
    public static Student[] nhap(int n) {
        Student[] student = new Student[n];
        for (int i = 0; i < n; i++) {
            student[i] = new Student();
            Scanner scan = new Scanner(System.in); 
            System.out.println("Nhap ten:");
            student[i].name = scan.nextLine();
            System.out.println("Nhap nam sinh:");
            student[i].birth_year = scan.nextInt();
            System.out.println("Nam la M, nu la F");
            System.out.println("Nhap gioi tinh:");
            student[i].gender = scan.next().charAt(0);
            scan.nextLine();
            System.out.println("Nhap ma hoc sinh:");
            student[i].studentID = scan.nextLine();
            System.out.println("Nhap nam nhap hoc:");
            student[i].academic_year = scan.nextInt();
            System.out.println("Nhap gpa:");
            student[i].gpa = scan.nextFloat();
            System.out.println("Nhap diem hoat dong:");
            student[i].social_activities = scan.nextFloat();
            System.out.println("---.---");
        }
        return student;
    }
    
    public static void xuat(ArrayList<Student> studentList) {
        for(int i = 0; i < studentList.size(); i++) {
            System.out.println(
                    "Name: " + studentList.get(i).getName() + "\n" +
                    "Gener: " + studentList.get(i).getGender() + "\n" +
                    "Birth day: " + studentList.get(i).getGender() + "\n" +
                    "Student Id: " + studentList.get(i).getGender() + "\n" +
                    "Nam nhap hoc: " + studentList.get(i).getGender() + "\n" +
                    "Gpa: " + studentList.get(i).getGpa() + "\n" +
                    "Social activities: " + studentList.get(i).getSocial_activities() +
                    "\n---.---");
        } 
    }
    
    public static void write(ArrayList<Student> studentList) {
        System.out.println("Nhap duonng dan: ");
        Scanner scan = new Scanner(System.in);
        String path = scan.nextLine();
        path += "\\";
        System.out.println("Nhap ten thu muc muon tao: ");
        path += scan.nextLine();
        try {
            File st_File_Path = new File(path + ".txt");
            FileOutputStream fos = new FileOutputStream(st_File_Path);
            ObjectOutputStream oos = new ObjectOutputStream(fos); 
            System.out.println("Duong dan thu muc: " + 
                    st_File_Path.getAbsolutePath() + "\n");
            oos.writeObject(studentList);
            oos.flush();
            oos.close(); 
        } catch(IOException e) {
            System.out.println("Error");
        }
    }
    
    public static ArrayList<Student> read() {
        ArrayList<Student> studentList_File = new ArrayList<>();
        System.out.println("Nhap duonng dan muon doc thu muc: ");
        Scanner scan = new Scanner(System.in);
        String path = scan.nextLine();
        try {   
            FileInputStream f = new FileInputStream(path); 
            try (ObjectInputStream inStream = new ObjectInputStream(f)) {
                studentList_File = (ArrayList<Student>) inStream.readObject();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error Read file");
        }
        return studentList_File;
    }
    
}
