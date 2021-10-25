package Oct_25_OOP;
import java.util.Date;
/**
 *
 * @author admin
 */
public class Person {
        String birthday;
        String gender;
        String blood_type;

    public Person() {
    }
         
    public Person(String person, String gender, String blood_type) {
        this.birthday = person;
        this.gender = gender;
        this.blood_type = blood_type;
    }

    public String getPerson() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setPerson(String person) {
        this.birthday = person;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }
      
}
