package csc241hw01;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Package {

    private String trackingNum;
    private String type;
    private double weight;
    private ArrayList<Product> products;
    private Customer customer;
    private LocalDateTime deliveryTime;
    private LocalDateTime timeAttempted;
    private boolean isDelivered;


    public Package(String tracking, String type, Customer customer) {
        this.trackingNum = tracking;
        this.type = type;
        this.customer = customer;
        products = new ArrayList<>();
        weight = 0;
        deliveryTime = null;

    }

    public String getTrackingNumber() {
        return trackingNum;
    }

    public String getType() {
        return type;
    }

    public Product[] getProducts() {
        Product[] productArr = products.toArray(new Product[products.size()]);
        return productArr;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double w) {
        weight = w;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getDeliveryTime() {
        //System.out.println("Delivered");
        return deliveryTime;
    }

    public LocalDateTime getDeliveryAttempt() {
        //System.out.println("Attempted Delivery");
        return timeAttempted;

    }

    public void markDelivered() {
        isDelivered = true;
        deliveryTime = LocalDateTime.now();
    }

    public void markUndelivered() {
        isDelivered = false;
        timeAttempted = LocalDateTime.now();

    }


}
