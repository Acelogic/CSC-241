package csc241hw01;

public class Main {
    public static void main(String[] args) {
        // Create a Customer
        String lastName = "Last";
        String firstName = "First";
        String address = "123 Main St";
        String zipCode = "13126-111";
        String acctNum = "876-543-21";

        Customer c1 = new Customer(lastName, firstName, address, zipCode, acctNum);
        // Check
        System.out.println("---=== Create Customer ===---");
        System.out.println("Last name match: " + (lastName + ":" + c1.getLastName() + ":" + c1.getLastName().equals(lastName)));
        System.out.println("First name match: " + (firstName + ":" + c1.getFirstName() + ":" + c1.getFirstName().equals(firstName)));
        System.out.println("Address match: " + (address + ":" + c1.getStreetAddress() + ":" + c1.getStreetAddress().equals(address)));
        System.out.println("Zip code: " + (zipCode + ":" + c1.getZipCode() + ":" + c1.getZipCode().equals(zipCode)));
        System.out.println("Account match: " + (acctNum + ":" + c1.getAccountNumber() + ":" + c1.getAccountNumber().equals(acctNum)));

        // Creat a Vehicle
        System.out.println("---=== Create Vehicle ===---");
        String type = "Type";
        String id = "12345";
        //Package[] packageArray = new Package[0]; // Should not be used
        Vehicle v1 = new Vehicle(type, id);
        // Check
        System.out.println("Type match: " + (type + ":" + v1.getType() + ":" + v1.getType().equals(type)));
        System.out.println("Id match: " + (id + ":" + v1.getID() + ":" + v1.getID().equals(id)));
        //System.out.println("Array size: " + v1.getPackages().length);

        // Create Product
        System.out.println("---=== Create Product ===---");
        String productName = "cereal";
        String isbn = "09876543210";
        double unitPrice = 1.0;
        int quantity = 1;

        Product p1 = new Product(productName, isbn, unitPrice, quantity);
        System.out.println("Product name match: " + productName + ":" + p1.getProductName() + ":" + p1.getProductName().equals(productName));
        System.out.println("ISBN name match: " +isbn + ":" + p1.getISBN() + ":" + p1.getISBN().equals(isbn));
        System.out.println("Unit price match: " + unitPrice + ":" + p1.getUnitPrice() + ":" + (p1.getUnitPrice() == unitPrice));
        System.out.println("Quantity match: " + quantity + ":" + p1.getQuantity() + ":" + (p1.getQuantity() == quantity));

        // Create Package
        System.out.println("---=== Create Package ===---");

        String trackingNum = "abcd1234";
        String pkgType = "bag";
        Package pkg1 = new Package(trackingNum, pkgType, c1);
        // Check
        System.out.println("Tracking number match: " + trackingNum + ":" + pkg1.getTrackingNumber() + ":" + (pkg1.getTrackingNumber().equals(trackingNum)));
        System.out.println("Package type match: " + pkgType + ":" + pkg1.getType() + ":" + (pkg1.getType().equals(pkgType)));
        System.out.println("Products length: " + pkg1.getProducts().length);// method not defined --JPE

        // Add two products and try again
        pkg1.addProduct(p1);
        pkg1.addProduct(p1);
        System.out.println("Products length (after add): " + pkg1.getProducts().length);

        System.out.println("Weight match: " + pkg1.getWeight()+ ":" + (pkg1.getWeight()==0));
        pkg1.setWeight(2);
        System.out.println("Weight after set: " + pkg1.getWeight()+ ":" + (pkg1.getWeight()==2));

        //System.out.println("Customer account number: " + pkg1.getCustomer().getAccountNumber());

        // Check delivery attempt time
        System.out.println("Delivery attempt time (should be null): " + pkg1.getDeliveryAttempt());
        pkg1.markUndelivered();
        System.out.println("Delivery attempt time (should be set): " + pkg1.getDeliveryAttempt());

        // Check delivery time
        System.out.println("Delivery time (should be null): " + pkg1.getDeliveryTime());
        pkg1.markDelivered();
        System.out.println("Delivery time (should be set): " + pkg1.getDeliveryTime());










    }

}


