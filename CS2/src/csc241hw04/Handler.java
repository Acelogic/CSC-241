package csc241hw04;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author mcruz
 */

// Populates objects with parsed XML data without modification of the original specification of the objects

public class Handler extends DefaultHandler {
    private ArrayList<Product> tempProductList = new ArrayList<>();
    private ArrayList<Vehicle> vehicleList = new ArrayList<>();
    private Vehicle vehicle;
    private Customer customer;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {

        String id;
        String type;
        switch (qName) {
            case "van":
                id = attributes.getValue("id");
                type = qName;
                vehicle = new Van(type, id);
                break;
            case "cart":
                id = attributes.getValue("id");
                type = qName;
                vehicle = new Cart(type, id);
                break;
            case "drone":
                id = attributes.getValue("id");
                type = qName;
                vehicle = new Drone(type, id);
                break;
            case "scooter":
                id = attributes.getValue("id");
                type = qName;
                vehicle = new Scooter(type, id);
                break;

            case "product":
                boolean taxable = Boolean.parseBoolean(attributes.getValue("taxable"));
                String productName = attributes.getValue("productName");
                String isbn = attributes.getValue("isbn");
                double unitPrice = Double.parseDouble(attributes.getValue("unitPrice"));
                int quantity = Integer.parseInt(attributes.getValue("quantity"));

                if (taxable) {
                    tempProductList.add(new Taxable(productName, isbn, unitPrice, quantity));


                } else {
                    tempProductList.add(new NonTaxable(productName, isbn, unitPrice, quantity));

                }
                break;

            case "customer":
                String lastName = attributes.getValue("lastName");
                String firstName = attributes.getValue("firstName");
                String streetAddress = attributes.getValue("streetAddress");
                String zipCode = attributes.getValue("zipCode");
                String accountNumber = attributes.getValue("accountNumber");
                customer = new Customer(lastName, firstName, streetAddress, zipCode, accountNumber);
                break;
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);

        switch (qName) {
            case "package":
                Package pkg = new Package(Integer.toString(new Random().nextInt(900000) + 100000), "Amazon", customer);

                // Adding Products from temporary productList to Package
                for (Product p : tempProductList) {
                    pkg.addProduct(p);
                }
                vehicle.addPackage(pkg);
                tempProductList.clear();
                break;
            case "van":
            case "cart":
            case "drone":
            case "scooter":
                vehicleList.add(vehicle);
                break;
        }

    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }


}
