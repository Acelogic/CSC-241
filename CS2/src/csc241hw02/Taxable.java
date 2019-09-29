package csc241hw02;

import csc241hw01.Customer;

public class Taxable extends Product implements TaxableNY{


    public Taxable(String productName, String ISBN, double unitPrice, int productQuantity) {
        super(productName, ISBN, unitPrice, productQuantity);
    }


    @Override
    public double getPrice() {
        return getQuantity() * getUnitPrice() * taxRateNY;
    }
    @Override
    public double getSalesTax(double price) {
        return price * taxRateNY;
    }


}
