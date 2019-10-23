package Examples.Articles;


import java.util.ArrayList;

public class Log {

    ArrayList<Article> articleList;
    ArrayList<Advert> advertList;

    public Log(ArrayList<Article> articleList, ArrayList<Advert> advertList) {
        this.advertList = advertList;
        this.articleList = articleList;

    }

    public void log(int date){
        System.out.println("Date: " + date);
        for(Advert advert : getAdverts(date)) {
            for(Article article: getArticle(date)) {
                System.out.println(advert + " | " + article);
            }
        }
    }

    private ArrayList<Advert> getAdverts(int date) {
        ArrayList<Advert> sortedAdverts = new ArrayList<>();
        for (Advert a : advertList) {
            if (a.getYearReleased() == date) {
                sortedAdverts.add(a);
            }
        }
        return sortedAdverts;
    }

    private ArrayList<Article> getArticle(int date) {
        ArrayList<Article> sortedArticles = new ArrayList<>();
        for (Article a : articleList) {
            if (a.getYearReleased() == date) {
                sortedArticles.add(a);
            }
        }
        return sortedArticles;
    }


    public static void main(String[] args) {
        ArrayList<Article> articleList = new ArrayList<>();
        articleList.add(new Article("F", "Me", "Math"));
        articleList.add(new Article("F2", "Me2", "Math2"));
        articleList.add(new Article("F3", "Me3", "Math3"));
        articleList.add(new Article("F4", "Me4", "Math4"));
        articleList.add(new Article("F5", "Me5", "Math5"));

        ArrayList<Advert> advertsList = new ArrayList<>();
        advertsList.add(new Advert());
        advertsList.add(new Advert());
        advertsList.add(new Advert());
        advertsList.add(new Advert());
        advertsList.add(new Advert());



    }
}
