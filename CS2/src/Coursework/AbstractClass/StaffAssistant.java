package Coursework.AbstractClass;

public class StaffAssistant extends Employee {

double hourlyWage;
double hourssWorked;

public StaffAssistant(String lastName, String firstName, double wage, double hours){
    super(lastName, firstName);
    hourlyWage = wage;
    hourssWorked = hours;
}
    @Override
    public void printPaycheck() {

    }
}
