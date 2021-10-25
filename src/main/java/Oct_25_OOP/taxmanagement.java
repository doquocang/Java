package Oct_25_OOP;

/**
 *
 * @author admin
 */
public class taxmanagement {
    public static void main(String[] args) {
        Student a = new Student("Rei Ayanami", "01", "01234", "rei@gmail.com", "2002-02-02", "Nu", "A");
        Worker b = new Worker("Asuka", "02", "62346", "asuka@gmail.com", 16000000, 69,"2002-01-02", "Nu", "AB");
        BusinessPerson c = new BusinessPerson("Kenji", "03", "98346", "kenji@gmail.com", 15000000, 10000000, 40000000,"2001-02-02", "Nam", "O");
        System.out.println("Student tax: ");
        System.out.println(a.payTax(0, "2020-02-02", "2002-02-02") + " %");
        System.out.println(b.payTax(b.salary + b.other_income, "2020-02-02", "2002-02-02") + " %");
        System.out.println(c.payTax(c.salary + c.other_income + c.business_income, "2020-02-02", "2002-02-02") + " %");
    }
    
}
