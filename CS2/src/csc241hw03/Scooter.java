package csc241hw03;

public class Scooter extends Vehicle {
    public Scooter(String type, String ID) {
        super(type, ID);
    }

    @Override
    public String getType() {
        return "Scooter";
    }
}
