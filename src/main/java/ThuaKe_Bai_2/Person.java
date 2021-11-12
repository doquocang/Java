package ThuaKe_Bai_2;

import java.io.Serializable;
import java.util.Scanner;
import java.lang.Cloneable;
import java.io.Serializable;
import java.lang.Comparable;


/**
 *
 * @author admin
 */
public class Person implements Serializable, Cloneable {
    String name;
    char gender;
    int birth_year;

    public Person() {
    }

    public Person(String name, char gender, int birth_year) {
        this.name = name;
        this.gender = gender;
        this.birth_year = birth_year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    @Override
    public String toString() {
        return "<Person> " + 
                "Name: " + name + 
                ", Gender: " + gender + 
                ", birth_year: " + birth_year;
    }
    
}
