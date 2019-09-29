package Coursework.XMLParsing;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {
    String currentMonth;

    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        System.out.println("---===Start Element ===---");
        System.out.println("URI: " + uri);
        System.out.println("LOCALNAME :" + localName);
        System.out.println("QNAME :" + qName);
        System.out.println("ATTRIBUTES: " + attributes);
        System.out.println("ATTRIBUTES.QNAME: " + attributes.getLength());

        for (int i = 0; i < attributes.getLength(); i++) {
            System.out.println("Attributes.QNAME: " + attributes.getQName(i));
            System.out.println("Attributes.VALUE: " + attributes.getValue(i));

        }
        if(qName.equals("month")) {
            currentMonth = attributes.getValue(" name");
            System.out.println("NEW CURRENT MONTH:" +  currentMonth);
        }

        if(qName.equals("holiday")) {
           // Holiday newHoliday = new Holiday(currentMonth, Integer.parseInt(attributes.getValue("day"), attributes.getValue("name")));
        }
    }

}


