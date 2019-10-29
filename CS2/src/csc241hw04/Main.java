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
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            Handler handler = new Handler();
            Scanner sc = new Scanner(System.in);
            File input = null;


            System.out.println("Enter the File Name (Case Sensitive & Include Extension)");
            System.out.println("( If you want to browse the filesystem for your own .xml file type in f )");
            try {
                String usrString = sc.next();
                if (usrString.equals("f")) {
                    JFileChooser chooser = new JFileChooser();
                    chooser.setFileFilter(new FileNameExtensionFilter("XML", "xml"));
                    int returnVal = chooser.showOpenDialog(chooser);
                    String path = null;
                    if (returnVal == JFileChooser.APPROVE_OPTION) {
                        path = chooser.getSelectedFile().getPath();
                    }
                    input = new File(path);
                } else {
                    input = new File(usrString);
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
                System.out.println("\t\t " + String.format("%.2f", total));
                // Reset the Total for the next Vehicle
                total = 0;

            }
            System.out.println("---=== End of Report ===---");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}