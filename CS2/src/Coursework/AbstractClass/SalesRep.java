package Coursework.AbstractClass;

public class SalesRep  extends  Employee{

double weeklySalary;
double salesComission;


public SalesRep(String lastName, String firstName, double weeklySalary, double salesComission){
    super(lastName,firstName);
    this.weeklySalary = weeklySalary;
    this.salesComission = salesComission;
}

    @Override
    public void printPaycheck() {
     double payAmount = (weeklySalary * 2) + salesComission;
        System.out.println(this.getLastName() + ","
                + this.getFirstName() + ": "  + payAmount);
    }
}

