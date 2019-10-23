package Examples.Articles;

import java.util.ArrayList;

public class Article {

    private String title;
    private ArrayList<String> authors;
    private ArrayList<String> subjectAreas;
    private ArrayList<Advert> advertisements;
    private int yearReleased;

    public Article(String title, String author, String subjectArea) {
        yearReleased = (int) Math.random() * 9999;
        this.title = title;

        authors = new ArrayList<>();
        authors.add(author);

        subjectAreas = new ArrayList<>(7);
        subjectAreas.add(subjectArea);

        advertisements = new ArrayList<>();


    }

    public void addAuthor(String author) {
        authors.add(author);
    }

    public void addSubjectArea(String subjectArea) {
        subjectAreas.add(subjectArea);
    }

    public void addAdvert(Advert advert) {
        advertisements.add(advert);
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public int getYearReleased() {
        return yearReleased;
    }
}
