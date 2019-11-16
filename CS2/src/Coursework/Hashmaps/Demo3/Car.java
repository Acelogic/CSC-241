package Coursework.Hashmaps.Demo3;

public class Car {

    private String make;
   private String model;
   private String vin;

    public Car(String make, String model, String vin) {
        this.make = make;
        this.model = model;
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return "(" + make + ";" + model + ";" +vin+")";
    }
}
