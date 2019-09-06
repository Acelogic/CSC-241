package ObjectOrientation.BoxDemo;

public class Box {
    // Instance Variables
    public String color;
    public int sides;

    // Constructors
    public Box(String color, int sides) {
        this.color = color;
        this.sides = sides;
    }

    public Box(){
        color= "blank";

    }

    public void yellColor(){
        System.out.println(this.allCapsColor() + "!");
    }
    private String allCapsColor(){
        return color.toUpperCase();
    }
}
