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
public class Student extends Person {
    boolean resident;
    
    // Constructor
    public Student(String n, int a){
        super(n,a);
        resident = false;
    }
 
    @Override
    public String getAcctNum(){
        return "ACCT: " + accountNum;
        
    }
}
