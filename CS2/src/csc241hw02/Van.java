package csc241hw02;

public class Van extends Vehicle {
    public Van(String type, String ID) {
        super(type, ID);
    }

    @Override
    public String getType() {
        return "Van";
    }
}
