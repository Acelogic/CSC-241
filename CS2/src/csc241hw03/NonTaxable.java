package csc241hw03;

public class NonTaxable extends Product {
    public NonTaxable(String productName, String ISBN, double unitPrice, int productQuantity) {
        super(productName, ISBN, unitPrice, productQuantity);
    }

    @Override
    public double getPrice() {
        return getUnitPrice() * getQuantity();
    }
}
