package Oct_25_OOP;

import java.util.Date;

/**
 *
 * @author admin
 */
public class BusinessPerson extends Person implements Tax {
    String name;
    String citizenID;
    String phone;
    String email;
    double salary;
    double business_income;
    double other_income;

    public BusinessPerson() {
    }

    public BusinessPerson(String name, String citizenID, String phone, String email, double salary, double business_income, double other_income) {
        this.name = name;
        this.citizenID = citizenID;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.business_income = business_income;
        this.other_income = other_income;
    }

    public BusinessPerson(String name, String citizenID, String phone, String email, double salary, double business_income, double other_income, String birthday, String gender, String blood_type) {
        super(birthday, gender, blood_type);
        this.name = name;
        this.citizenID = citizenID;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.business_income = business_income;
        this.other_income = other_income;
    }
    
    public String getName() {
        return name;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public double getBusiness_income() {
        return business_income;
    }

    public double getOther_income() {
        return other_income;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBusiness_income(double business_income) {
        this.business_income = business_income;
    }

    public void setOther_income(double other_income) {
        this.other_income = other_income;
    }
    
    @Override
    public double payTax(double income, String start_time, String end_time) {
        double percent = 0;
        if (income > 50000000) {
           percent = 3;
        }
        else if (income > 10000000) {
            percent = 2;
        }
        return percent;
    }
    
}
