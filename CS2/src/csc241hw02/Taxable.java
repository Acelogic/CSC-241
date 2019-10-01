package csc241hw02;


public class Taxable extends Product implements TaxableNY{


    public Taxable(String productName, String ISBN, double unitPrice, int productQuantity) {
        super(productName, ISBN, unitPrice, productQuantity);
    }


    @Override
    public double getPrice() {
        double price = getQuantity() * getUnitPrice();
        return getSalesTax(price) + price;
    }
    @Override
    public double getSalesTax(double price) {
        return price * taxRateNY;
    }


}
