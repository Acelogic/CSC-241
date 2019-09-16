package Coursework.Interfaces;

public class Pump implements Gas {

    public Pump(){

    }

    @Override
    public double getTotal(double g) {
        return g * pricePerGallon;
    }
}
