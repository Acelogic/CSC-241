package csc241hw06;

public class Drone extends Vehicle {
    public Drone(String type, String ID) {
        super(type, ID);
    }

    @Override
    public String getType() {
        return "Drone";
    }
}
