package csc241hw05;

public class Scooter extends Vehicle {
    public Scooter(String type, String ID) {
        super(type, ID);
    }

    @Override
    public String getType() {
        return "Scooter";
    }
}
