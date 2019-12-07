package csc241hw06;

import java.util.Objects;

public abstract class Product implements Comparable<Product> {

    private String productName;
    private String ISBN;
    private double unitPrice;
    private int productQty;

    public Product(String productName, String ISBN, double unitPrice, int productQuantity) {
        this.productName = productName;
        this.ISBN = ISBN;
        this.unitPrice = unitPrice;
        this.productQty = productQuantity;
    }

    public String getProductName() {

        return productName;
    }

    public String getISBN() {

        return ISBN;
    }

    public double getUnitPrice() {

        return unitPrice;
    }

    public int getQuantity() {

        return productQty;
    }

    public abstract double getPrice();


    @Override
    public String toString() {
        return "[ Name: " + productName + ";" + " ISBN:" + ISBN + ";" + " Price:" + unitPrice + "]";
    }

    @Override
    public int compareTo(Product other) {
        return (this.productName.compareTo(other.productName) != 0) ?
                (this.productName.compareTo(other.productName)) :
                (this.productName.compareTo(other.getProductName()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product other = (Product) o;
        return this.productName.equals(other.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }
}
