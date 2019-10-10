package csc241hw03;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author mcruz
 */

public class Handler extends DefaultHandler {
    private ArrayList<Product> productList = new ArrayList<>();
    private ArrayList<Vehicle> vehicleList = new ArrayList<>();
    private Vehicle vehicle;
    private boolean firstVehicleLoaded;


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {

        if (qName.equals("van")) {
            String id = attributes.getValue(0);
            String type = qName;
            vehicle = new Van(type, id);


        }

        if (qName.equals("cart")) {
            String type = qName;
            String id = attributes.getValue(0);
            vehicle = new Cart(type, id);

        }

        if (qName.equals("drone")) {
            String type = qName;
            String id = attributes.getValue(0);
            vehicle = new Drone(type, id);

        }

        if (qName.equals("scooter")) {
            String type = qName;
            String id = attributes.getValue(0);
            vehicle = new Scooter(type, id);

        }

        if (qName.equals("package")) {


        }

        if (qName.equals("product")) {
            boolean taxable = Boolean.parseBoolean(attributes.getValue(0));
            String productName = attributes.getValue(1);
            String isbn = attributes.getValue(2);
            double unitPrice = Double.parseDouble(attributes.getValue(3));
            int quantity = Integer.parseInt(attributes.getValue(4));

            if (taxable) {
                productList.add(new Taxable(productName, isbn, unitPrice, quantity));


            } else {
                productList.add(new NonTaxable(productName, isbn, unitPrice, quantity));

            }
        }

        if (qName.equals("customer")) {
            String lastName = attributes.getValue(0);
            String firstName = attributes.getValue(1);
            String streetAddress = attributes.getValue(2);
            String zipCode = attributes.getValue(3);
            String accountNumber = attributes.getValue(4);

            // Making Package
            Customer customer = new Customer(lastName, firstName, streetAddress, zipCode, accountNumber);
            Package pkg = new Package(Integer.toString(new Random().nextInt(900000) + 100000), "Amazon", customer);

            // Adding Products to Package
            for (Product p : productList) {
                pkg.addProduct(p);
            }

            // Adding Package to Vehicle
            vehicle.addPackage(pkg);

            // Adding Filled Vehicle to List
            if(!firstVehicleLoaded) {
                vehicleList.add(vehicle);
                firstVehicleLoaded = true;
            }
            // Checks if Vehicle ID has changed or not
            else {
                for (int i = 0; i < vehicleList.size(); i++) {
                    if (!vehicleList.get(i).getID().equals(vehicle.getID())) {
                        vehicleList.add(vehicle);
                    }
                }
            }
            // Clearing Product List
            productList.clear();

        }


    }

    public ArrayList<Vehicle> getVehicleList(){
        return vehicleList;
    }

}
