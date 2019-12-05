package csc241hw06;

public class Customer {

    private String lastName;
    private String firstName;
    private String address;
    private String zipCode;
    private String accountNumber;

    public Customer(String lastName, String firstName, String address, String zipCode, String accountNumber){
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.zipCode = zipCode;
        this.accountNumber = accountNumber;

    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getStreetAddress(){
        return address;
    }

    public String getZipCode(){
        return zipCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
