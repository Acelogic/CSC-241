package csc241hw01;

public class Product {

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

    public double getUnitPrice(){

        return unitPrice;
    }

    public int getQuantity(){

        return productQty;
    }


}
