package teksystems.com;

import teksystems.com.models.Employee;
import teksystems.com.models.Manager;
import teksystems.com.models.Trainee;

public class InheritanceActivity {
    public static void main(String [] args) {
        createMgr();
        createTrainee();
    }//main

    private static void createMgr() {
    Manager peter = new Manager (126534L, "Peter", "Chennai India", 237844L, 65000);
        System.out.println(peter.calculateSalary());
        System.out.println(peter.calculateTransportAllowance());
    }//createMgr()

    private static void createTrainee() {
        Trainee jack = new Trainee (29846, "Jack", "Mumbai India", 442085L, 45000);
        System.out.println(jack.calculateSalary());
        System.out.println(jack.calculateTransportAllowance());
    }//createTrainee()

}//InheritanceActivity
