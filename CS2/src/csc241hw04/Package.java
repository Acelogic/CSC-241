package csc241hw04;

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

    public void addProduct(Product p) {
        products.add(p);
    }

    public void setWeight(double w) {
        weight = w;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getDeliveryTime() {

        return deliveryTime;
    }

    public LocalDateTime getDeliveryAttempt() {
        return timeAttempted;

    }

    public double getWeight() {
        return weight;
    }

    public String getTrackingNumber() {
        return trackingNum;
    }

    public String getType() {
        return type;
    }

    public double getTotal() {
        double netPrice = 0;
        for (Product p : getProducts()) {
            netPrice += p.getPrice();
        }
        return netPrice;
    }

    public Product[] getProducts() {
        return products.toArray(new Product[products.size()]);
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
