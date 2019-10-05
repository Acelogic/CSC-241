package csc241hw03;


import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;


/**
 * @author mcruz
 */
public class Main {
    public static void main(String[] args) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            Handler handler = new Handler();
            HandlerTest handler2 = new HandlerTest();
            File input = new File("deliveries.xml");

           // saxParser.parse(input, handler);
            saxParser.parse(input, handler2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
