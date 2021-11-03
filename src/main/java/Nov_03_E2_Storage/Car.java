package Nov_03_E2_Storage;

import java.io.Serializable;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Car implements Serializable{
    String name;
    String engine;
    String seats;
    String Production_date;

    public Car() {
    }

    public Car(String name, String engine, String seats, String Production_date) {
        this.name = name;
        this.engine = engine;
        this.seats = seats;
        this.Production_date = Production_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getProduction_date() {
        return Production_date;
    }

    public void setProduction_date(String Production_date) {
        this.Production_date = Production_date;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", engine=" + engine + ", seats=" + seats + ", Production_date=" + Production_date + '}';
    }
    
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scan.nextLine();
        System.out.println("Enter engine: ");
        engine = scan.nextLine();
        System.out.println("Enter the number of seats: ");
        seats = scan.nextLine();
        System.out.println("Enter production date: ");
        Production_date = scan.nextLine();
    }
  
}