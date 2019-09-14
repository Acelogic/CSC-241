package Coursework.AbstractClass;

public abstract class Employee {

    protected String firstName;
    protected String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public abstract void printPaycheck();

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }
}
