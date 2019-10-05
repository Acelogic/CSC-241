package csc241hw03;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class HandlerTest extends DefaultHandler {

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {

        if (qName.equals("deliveries")) {
            System.out.println(qName);
        }

        if (qName.equals("van")) {
            String id = attributes.getValue(0);
            String type = qName;
            Van van = new Van(id,type);
            System.out.println("From Object: " + van);
            System.out.println(van.getType());
            System.out.println(van.getID());

        }

        if (qName.equals("cart")) {
            String id = attributes.getValue(0);
            String type = qName;
            Cart cart = new Cart(id, type);
            System.out.println("From Object: " + cart);
            System.out.println(cart.getType());
            System.out.println(cart.getID());
        }

        if (qName.equals("drone")) {
            String id = attributes.getValue(0);
            String type = qName;
            Drone drone = new Drone(id, type);
            System.out.println("From Object: " + drone);
            System.out.println(drone.getType());
            System.out.println(drone.getID());
        }

        if (qName.equals("scooter")) {
            String id = attributes.getValue(0);
            String type = qName;
            Scooter scooter = new Scooter(id, type);
            System.out.println("From Object: " + scooter);
            System.out.println(scooter.getType());
            System.out.println(scooter.getID());
        }
        
        if (qName.equals("package")) {
            System.out.println(qName);
        }

        if (qName.equals("product")) {
            boolean taxable = Boolean.parseBoolean(attributes.getValue(0));
            String productName = attributes.getValue(1);
            String isbn = attributes.getValue(2);
            double unitPrice = Double.parseDouble(attributes.getValue(3));
            int quantity = Integer.parseInt(attributes.getValue(4));
                if (taxable) {
                    Taxable product = new Taxable(productName, isbn, unitPrice, quantity);
                    System.out.println("From Object: " + product);
                    System.out.println(product.getProductName());
                    System.out.println(product.getISBN());
                    System.out.println(product.getUnitPrice());
                    System.out.println(product.getQuantity());
                } else {
                    NonTaxable product = new NonTaxable(productName, isbn, unitPrice, quantity);
                    System.out.println("From Object: " + product);
                    System.out.println(product.getProductName());
                    System.out.println(product.getISBN());
                    System.out.println(product.getUnitPrice());
                    System.out.println(product.getQuantity());
                }
            }
        if (qName.equals("customer")) {
            String lastName = attributes.getValue(0);
            String firstName = attributes.getValue(1);
            String streetAddress = attributes.getValue(2);
            String zipCode = attributes.getValue(3);
            String accountNumber = attributes.getValue(4);

            Customer customer = new Customer(lastName, firstName, streetAddress, zipCode, accountNumber);
            System.out.println("From Object: " + customer);
            System.out.println(customer.getLastName());
            System.out.println(customer.getFirstName());
            System.out.println(customer.getStreetAddress());
            System.out.println(customer.getZipCode());
            System.out.println(customer.getAccountNumber());
                
        }

    }


}
