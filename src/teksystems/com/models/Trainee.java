package teksystems.com.models;

public class Trainee extends Employee {
    public Trainee(long id, String name, String address, Long phone, double salary) {
        super(id, name, address, phone);
        basicSalary = salary;
    }//Trainee

}//extends Employee
