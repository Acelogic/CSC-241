package csc241hw02;

public class Cart extends Vehicle {
    public Cart(String type, String ID) {
        super(type, ID);
    }

    @Override
    public String getType() {
        return "Cart";
    }
}
