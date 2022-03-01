package teksystems.com.models;

public abstract class Employee {
    //Fields
    public long employeeId;
    public String employeeName;
    public String employeeAddress;
    public Long employeePhone;
    public double basicSalary;
    public double specialAllowance = 250.80;
    public double Hra = 1000.50;

    //Constructor
    public Employee(long id, String Name, String address, Long phone) {
        employeeId = id;
        employeeName = Name;
        employeeAddress = address;
        employeePhone = phone;

    }//Employee overload constructor

    //Methods
    public double calculateSalary() {
        return basicSalary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100);
    }//calculateSalary()

    public double calculateTransportAllowance() {
        return 0.1 * basicSalary;
    }//calculateTransportAllowance()

}//Employee