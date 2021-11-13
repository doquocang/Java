package ThuaKe_Bai2;

import java.lang.Cloneable;
import java.io.Serializable;
import java.lang.Comparable;
/**
 *
 * @author admin
 */
public class Student extends Person implements Cloneable, Serializable, Comparable<Student> {
    String studentID;
    int academic_year;
    float gpa;
    float social_activities;

    public Student() {
    }
    
    public Student(String studentID, int academic_year, float gpa, float social_activities, String name, char gender, int birth_year) {
        super(name, gender, birth_year);
        this.studentID = studentID;
        this.academic_year = academic_year;
        this.gpa = gpa;
        this.social_activities = social_activities;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(int academic_year) {
        this.academic_year = academic_year;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getSocial_activities() {
        return social_activities;
    }

    public void setSocial_activities(float social_activities) {
        this.social_activities = social_activities;
    }

    @Override
    public String toString() {
        return "<Student> " + 
                "Name: " + name + 
                ", Gender: " + gender + 
                ", birth_year: " + birth_year +
                "studentID=" + studentID + 
                ", academic_year=" + academic_year + 
                ", gpa=" + gpa + 
                ", social_activities=" + social_activities;
    }
    
    @Override
    public int compareTo(Student st) {
        if (this.gpa == st.gpa && this.social_activities == st.social_activities) {
            return 0;
        } 
        if (this.gpa == st.gpa && this.social_activities > st.social_activities) {
            return 1;
        }
        if (this.gpa > st.gpa) {
            return 1;
        }
        return -1;
    }  
    
}
