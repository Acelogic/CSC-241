package csc241hw01;

import jdk.swing.interop.SwingInterOpUtils;

public class Testing {

    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("ADD PACKAGE / ADD PRODUCT TESTING");
        System.out.println("-----------------------------------");

        Customer mCruz = new Customer("Miguel", "Cruz", "25 Rud RD", "11364", "123456790");
        Product p1 = new Product("Compilers: Principles, Techniques, and Tools", "0321486811", 135.52, 1);
        Product p2 = new Product("The Pragmatic Programmer", "9780201616224", 31.44, 1);
        Product p3 = new Product("C Programming Language, 2nd Edition", "0131103628", 61.00, 1);

        // addPackage & addProduct Testing

        // Testing out making products and adding products to each package
        Package pkg1 = new Package("0987654321", "book", mCruz);
        pkg1.addProduct(p1);

        Package pkg2 = new Package("1029384756", "book", mCruz);
        pkg2.addProduct(p2);

        Package pkg3 = new Package("0192837465", "book", mCruz);
        pkg3.addProduct(p3);

        // Testing out adding packages onto the vehicle
        Package[] pkgArr = new Package[2];
        pkgArr[0] = pkg1;
        pkgArr[1] = pkg2;

        Vehicle v1 = new Vehicle("Amazon Truck", pkgArr, "12345");

        // Testing out accessing product data from the package arrays which contain the product objects
        System.out.println("TWO PRODUCTS");
        for (Package pkg : v1.getPackages()) {
            for (Product product : pkg.getProducts()) {
                System.out.print(" | " + product.getProductName());
            }
        }

        // Testing out adding a package to the vehicle with addPackage();
        v1.addPackage(pkg3);

        // Testing out accessing product data from the package just added
        System.out.println("\nTHREE PRODUCTS");
        for (Package pkg : v1.getPackages()) {
            for (Product product : pkg.getProducts()) {
                System.out.print(" | " + product.getProductName());
            }
        }

        // Delivery Testing
        System.out.println("\n-----------------------------------");
        System.out.println("Delivery Testing");
        System.out.println("-----------------------------------");

        pkg1.markDelivered();
        pkg2.markUndelivered();
        pkg3.markDelivered();

        for (Package pkg : v1.getPackages()) {
            System.out.println(pkg.getDeliveryTime().toString());
        }
    }
}
