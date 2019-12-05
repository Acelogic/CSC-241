package csc241hw04;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

;

/**
 * @author mcruz
 */

public class Main {
    public static void main(String[] args) {
//        String lastName = "Last";
//        String firstName = "First";
//        String address = "123 Main St";
//        String zipCode = "13126-111";
//        String acctNum = "876-543-21";
//
//        Customer c1 = new Customer(lastName, firstName, address, zipCode, acctNum);
//        // Check
//        System.out.println("---=== Create Customer ===---");
//        System.out.println("Last name match: " + (lastName + ":" + c1.getLastName() + ":" + c1.getLastName().equals(lastName)));
//        System.out.println("First name match: " + (firstName + ":" + c1.getFirstName() + ":" + c1.getFirstName().equals(firstName)));
//        System.out.println("Address match: " + (address + ":" + c1.getStreetAddress() + ":" + c1.getStreetAddress().equals(address)));
//        System.out.println("Zip code: " + (zipCode + ":" + c1.getZipCode() + ":" + c1.getZipCode().equals(zipCode)));
//        System.out.println("Account match: " + (acctNum + ":" + c1.getAccountNumber() + ":" + c1.getAccountNumber().equals(acctNum)));
//
//        // Create a Van
//        System.out.println("---=== Create Van ===---");
//        String type = "Blah";
//        String id = "12345";
//        Vehicle v1 = new Van(type, id);
//        // Check
//        System.out.println("Type match: " + (type + ":" + v1.getType() + ":" + v1.getType().equals("Van")));
//        System.out.println("Id match: " + (id + ":" + v1.getID() + ":" + v1.getID().equals(id)));
//        System.out.println("Array size: " + v1.getPackages().length); // Should be zero
//
//        // Create a Cart
//        System.out.println("---=== Create Cart ===---");
//        type = "Blah";
//         id = "23456";
//        Vehicle v2 = new Cart(type, id);
//        // Check
//        System.out.println("Type match: " + (type + ":" + v2.getType() + ":" + v2.getType().equals("Cart")));
//        System.out.println("Id match: " + (id + ":" + v2.getID() + ":" + v2.getID().equals(id)));
//        System.out.println("Array size: " + v2.getPackages().length); // Should be zero
//
//        // Create a Scooter
//        System.out.println("---=== Create Scooter ===---");
//        type = "Blah";
//        id = "34567";
//        Vehicle v3 = new Scooter(type, id);
//        // Check
//        System.out.println("Type match: " + (type + ":" + v3.getType() + ":" + v3.getType().equals("Scooter")));
//        System.out.println("Id match: " + (id + ":" + v3.getID() + ":" + v3.getID().equals(id)));
//        System.out.println("Array size: " + v3.getPackages().length); // Should be zero
//
//        // Create a Drone
//        System.out.println("---=== Create Drone ===---");
//        type = "Blah";
//        id = "45678";
//        Vehicle v4 = new Drone(type, id);
//        // Check
//        System.out.println("Type match: " + (type + ":" + v4.getType() + ":" + v4.getType().equals("Drone")));
//        System.out.println("Id match: " + (id + ":" + v4.getID() + ":" + v4.getID().equals(id)));
//        System.out.println("Array size: " + v4.getPackages().length); // Should be zero
//
//        // Create Taxable
//        System.out.println("---=== Create Taxable ===---");
//        String productName = "Ear Buds";
//        String isbn = "09876543210";
//        double unitPrice = 10.0;
//        int quantity = 1;
//
//        Product p1 = new Taxable(productName, isbn, unitPrice, quantity);
//        // Check
//        System.out.println("Product name match: " + productName + ":" + p1.getProductName() + ":" + p1.getProductName().equals(productName));
//        System.out.println("ISBN name match: " + isbn + ":" + p1.getISBN() + ":" + p1.getISBN().equals(isbn));
//        System.out.println("Unit price match: " + unitPrice + ":" + p1.getUnitPrice() + ":" + (p1.getUnitPrice() == unitPrice));
//        System.out.println("Quantity match: " + quantity + ":" + p1.getQuantity() + ":" + (p1.getQuantity() == quantity));
//        System.out.println("Price with tax: " + p1.getPrice());
//
//        // Create NonTaxable
//        System.out.println("---=== Create NonTaxable ===---");
//        productName = "Milk";
//        isbn = "08765432109";
//        unitPrice = 2.79;
//        quantity = 1;
//
//        Product p2 = new NonTaxable(productName, isbn, unitPrice, quantity);
//        // Check
//        System.out.println("Product name match: " + productName + ":" + p2.getProductName() + ":" + p2.getProductName().equals(productName));
//        System.out.println("ISBN name match: " + isbn + ":" + p2.getISBN() + ":" + p2.getISBN().equals(isbn));
//        System.out.println("Unit price match: " + unitPrice + ":" + p2.getUnitPrice() + ":" + (p2.getUnitPrice() == unitPrice));
//        System.out.println("Quantity match: " + quantity + ":" + p2.getQuantity() + ":" + (p2.getQuantity() == quantity));
//        System.out.println("Price (no tax): " + p2.getPrice());
//
//        // Create Package
//        System.out.println("---=== Create Package ===---");
//
//        String trackingNum = "abcd1234";
//        String pkgType = "box";
//        Package pkg1 = new Package(trackingNum, pkgType, c1);
//        // Check
//        System.out.println("Tracking number match: " + trackingNum + ":" + pkg1.getTrackingNumber() + ":" + (pkg1.getTrackingNumber().equals(trackingNum)));
//        System.out.println("Package type match: " + pkgType + ":" + pkg1.getType() + ":" + (pkg1.getType().equals(pkgType)));
//        System.out.println("Products length: " + pkg1.getProducts().length); // Should be zero
//
//        // Add two products and try again
//        pkg1.addProduct(p1);
//        pkg1.addProduct(p2);
//        System.out.println("Products length (after add): " + pkg1.getProducts().length); // Should be two
//
//        System.out.println("Weight match: " + pkg1.getWeight() + ":" + (pkg1.getWeight() == 0));
//        pkg1.setWeight(2.0);
//        System.out.println("Weight after set: " + pkg1.getWeight() + ":" + (pkg1.getWeight() == 2));
//
//        System.out.println("Customer account number: " + pkg1.getCustomer().getAccountNumber());
//
//        // Check delivery attempt time
//        System.out.println("Delivery attempt time (should be null): " + pkg1.getDeliveryAttempt());
//        pkg1.markUndelivered();
//        System.out.println("Delivery attempt time (should be set): " + pkg1.getDeliveryAttempt());
//
//        // Check delivery time
//        System.out.println("Delivery time (should be null): " + pkg1.getDeliveryTime());
//        pkg1.markDelivered();
//        System.out.println("Delivery time (should be set): " + pkg1.getDeliveryTime());
//
//        // Compute total price
//        System.out.println("Total package price: " + pkg1.getTotal());


        // Create Products
        Product p1 = new Taxable("ear buds", "1234", 1.0, 1);
        Product p2 = new NonTaxable("ear buds", "2345", 1.0, 1);
        Product p3 = new NonTaxable("phone charger", "3456", 1.0, 1);
        Product p4 = new Taxable("pokeman cards", "4567", 1.0, 1);


        System.out.println("COMPARETO (p1,p2): " + p1.compareTo(p2));
        System.out.println("COMPARETO (p2,p3): " + p2.compareTo(p3));
        System.out.println("COMPARETO (p1,p1): " + p1.compareTo(p1));
        System.out.println();

        // Insert into tree
        ProductBST t1 = new ProductBST();
        t1.insert(p2);
        t1.insert(p1);
        t1.insert(p3);
        t1.insert(p2);
        //t1.insert(p4);

        // Check contains
        System.out.println("---=== Checking Contains() ===---");
        System.out.print(p1 + " is ");
        if (!t1.contains(p1)) {
            System.out.print("not ");
        }
        System.out.println("in the tree");

        System.out.println("---=== Products In Order ===---");
        System.out.println("Left-Visit-Right");
        System.out.println(t1.inOrder());

        System.out.println("---=== Products Pre Order ===---");
        System.out.println("Visit-Left-Right");
        System.out.println(t1.preOrder());

        System.out.println("---=== Products Post Order ===---");
        System.out.println("Left-Right-Visit");
        System.out.println(t1.postOrder());

        // Remove a productp
        System.out.println("---=== After Remove ===---");
        t1.remove(p1);
        System.out.print(p1 + " is ");
        if (!t1.contains(p1)) {
            System.out.print("not ");
        }
        System.out.println("in the tree");

    }

    }

