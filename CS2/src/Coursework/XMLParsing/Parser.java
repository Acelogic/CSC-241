package Coursework.XMLParsing;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class Parser {
    public static void main(String[] args) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            MyHandler handler = new MyHandler();
            File input = new File("holidays.xml");
            saxParser.parse(input, handler);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

