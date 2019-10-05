package csc241hw03;

public class Drone extends Vehicle {
    public Drone(String type, String ID) {
        super(type, ID);
    }

    @Override
    public String getType() {
        return "Drone";
    }
}
