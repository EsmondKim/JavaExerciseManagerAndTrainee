package teksystems.com.models;

public class Manager extends Employee {
    public Manager(long id, String name, String address, Long phone, double salary) {
        super(id, name, address, phone);
        basicSalary = salary;
    }//Manager

    @Override
    public double calculateTransportAllowance() {
        return 15 * basicSalary/100;
    }//calculateTransportAllowance()

}//extends Employee
