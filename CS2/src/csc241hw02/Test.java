package csc241hw02;

public class Test {
    public static void main(String[] args) {
        System.out.println("---=== Create Product ===---");
        String productName = "cereal";
        String isbn = "09876543210";
        double unitPrice = 20;
        int quantity = 1;



        Taxable p1 = new Taxable(productName, isbn, unitPrice, quantity);
        NonTaxable p2 = new NonTaxable(productName, isbn, unitPrice, quantity);


        System.out.println("DEBUG: Taxable Price: " + p1.getPrice());
        System.out.println("DEBUG: Non-Taxable-Price: " + p2.getPrice());

        Van van = new Van("Cat", "2342");
        Drone drone = new Drone("Dog", "12432");
        Cart cart = new Cart("Blah", "21345");
        Scooter scooter = new Scooter("Scoot", "23453");

        System.out.println("DEBUG: " +van.getType());
        System.out.println("DEBUG: " +drone.getType());
        System.out.println("DEBUG: " +cart.getType());
        System.out.println("DEBUG: " +scooter.getType());

        // Create a Customer
        String lastName = "Last";
        String firstName = "First";
        String address = "123 Main St";
        String zipCode = "13126-111";
        String acctNum = "876-543-21";

        Customer cust = new Customer(lastName, firstName, address, zipCode, acctNum);
        Package pkg = new Package("23", "test", cust );
        pkg.addProduct(p1);
        pkg.addProduct(p2);

        System.out.println("Net Price: " + pkg.getTotal());



    }


}

