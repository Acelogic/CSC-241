package AbstractClass;

public class EmployeeDemo {

    public static void main(String[] args) {
        Engineer eng1 = new Engineer("Evans", "Marry", 2500.0);
        SalesRep sr1  = new SalesRep("Smith", "Bob", 1000.0, 700.50);
        StaffAssistant sal = new StaffAssistant("Taylor", "Tim", 27.50, 74);

        Employee[] workers = new Employee[3];

        workers[0] = eng1;
        workers[1] = sal;
        workers[2] = sr1;

        for (Employee e : workers){
            e.printPaycheck();
        }
    }


}
