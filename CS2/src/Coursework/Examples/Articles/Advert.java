package Coursework.Examples.Articles;

public class Advert {
   private int yearReleased;
    public Advert(){
        yearReleased = (int) Math.random() * 9999;
    }

    public int getYearReleased(){
        return yearReleased;
    }
}
