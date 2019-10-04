/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coursework.Inheritance;

/**
 *
 * @author jearly
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student s1 = new Student("Jim", 19);
        
        Person p1 = new Person("Mary", 20);       
        
        UnderGrad u1 = new UnderGrad("Tim", 18);
        
        Person[] everyone = new Person[3];
        everyone[0] = p1;
        everyone[1] = s1;
        everyone[2] = u1;
        
        System.out.println("ELEMENT 1:" + everyone[1].age);
        
        if (everyone[2] instanceof Student) {
            System.out.println("This is a student");
        }
        
        System.out.println("CLASS:" + everyone[2].getClass().getName());
        
        
        Person p2 = new Person("Jane", 19);
        p2.accountNum = "12345";
        
        Student s2 = new Student("Tessa", 21);
        s2.accountNum = "56789";
        
        System.out.println("PERSON: " + p2.getAcctNum());
        System.out.println("STUDENT: " + s2.getAcctNum());
        
    }
    
}
