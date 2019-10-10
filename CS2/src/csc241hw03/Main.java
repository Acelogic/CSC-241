package csc241hw03;

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
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            Handler handler = new Handler();
            Scanner sc = new Scanner(System.in);
            File input = null;


            System.out.println("Choose Option: \n 1) Type in xml file name manually \n 2) Browse the file system for your xml file");
            try {
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Enter the File Name (Case Sensitive & Include Extension)");
                        input = new File(sc.next());
                        break;
                    case 2:
                        JFileChooser chooser = new JFileChooser();
                        chooser.setFileFilter(new FileNameExtensionFilter("XML", "xml"));
                        int returnVal = chooser.showOpenDialog(chooser);
                        String path = null;
                        if (returnVal == JFileChooser.APPROVE_OPTION) {
                            path = chooser.getSelectedFile().getPath();
                        }
                        input = new File(path);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Not a valid input run and try again");
                System.exit(-1);
            }


            saxParser.parse(input, handler);

            System.out.println("---=== Report ===---");
            double total = 0;
            // Iterating over each Vehicle
            for (Vehicle vehicle : handler.getVehicleList()) {
                System.out.println(vehicle.getType() + " " + "(" + vehicle.getID() + ")");
                System.out.println("\t Customers");
                // Iterating over each Package on the Vehicle and printing consumer info
                // From each one
                for (Package pkg : vehicle.getPackages()) {
                    Customer customer = pkg.getCustomer();
                    System.out.println("\t\t\t" + customer.getLastName() + ", " + customer.getFirstName() + " at " + customer.getStreetAddress() + ", " + customer.getZipCode());

                }
                // Obtaining the sum of the package costs from each vehicle
                for (Package pkg : vehicle.getPackages()) {
                    total = total + pkg.getTotal();

                }
                System.out.println("\t Total");
                System.out.println("\t\t " + total);
                // Reset the Total for the next Vehicle
                total = 0;
            }
            System.out.println("---=== End of Report ===---");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}