package csc241hw03;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
;

/**
 * @author mcruz
 */

public class Main {
    public static void main(String[] args) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            Handler handler= new Handler();
            File input = new File("deliveries.xml");

            saxParser.parse(input, handler);

            System.out.println("---=== Report ===---");
            double total = 0;
            // Iterating over each Vehicle
            for(Vehicle vehicle : handler.getVehicleList()) {
                System.out.println(vehicle.getType() + " " + "("+ vehicle.getID()+")");
                System.out.println("\t Customers");
                // Iterating over each Package on the Vehicle and printing consumer info
                // From each one
                for(Package pkg : vehicle.getPackages()) {
                    Customer customer = pkg.getCustomer();
                    System.out.println("\t\t\t" + customer.getLastName() + ", " + customer.getFirstName() + "at " + customer.getStreetAddress() +", " + customer.getZipCode());

                }
                // Obtaining the sum of the packages from each vehicle
                for(Package pkg : vehicle.getPackages()) {
                   total = total + pkg.getTotal();

                }
                System.out.println("\t Total");
                System.out.println("\t\t "+total);
                // Reset the Total for the next Vehicle
                total = 0;
            }
            System.out.println("---=== End of Report ===---");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}