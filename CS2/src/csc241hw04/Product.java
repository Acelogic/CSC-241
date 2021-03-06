package csc241hw04;

public abstract class Product implements Comparable  {

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
        return "[" + productName + ":" + getISBN() + "]";
    }


    @Override
    public int compareTo(Object o) {
        Product other = (Product) o;
        return (this.productName.compareTo(other.productName) != 0)
                ? this.productName.compareTo(other.productName)
                : this.ISBN.compareTo(other.ISBN);
    }
}
