package Coursework.AbstractClass;

public class Engineer extends Employee {

    double weeklySalary;

    public Engineer(String firstName, String lastName, double weeklySalary){
        super(lastName,firstName);
        this.weeklySalary = weeklySalary;
    }


    @Override
    public void printPaycheck() {
    double payAmount = weeklySalary *2;
        System.out.println(this.getLastName() + ","
                + this.getFirstName() + ": " + payAmount );
    }
}
