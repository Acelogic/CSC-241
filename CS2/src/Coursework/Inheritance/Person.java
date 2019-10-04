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
public class Person {
    
    String name;
    int age;
    
    protected String accountNum;
    
    // Constructor
    public Person (String n, int a){
        name = n;
        age = a;
    }
    
    public String getAcctNum(){
        return accountNum;
    }
}
