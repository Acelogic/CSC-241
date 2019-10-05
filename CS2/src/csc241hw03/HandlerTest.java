package csc241hw03;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class HandlerTest extends DefaultHandler {


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {


        if (qName.equals("deliveries")) {
            System.out.println(qName);
        }

        if (qName.equals("van")) {
            System.out.println("    " + qName + " " + "(" + attributes.getValue(0) + ")");

        }

        if (qName.equals("package")) {
            System.out.println("        " + qName);
        }

        if (qName.equals("product")) {
            System.out.println("            " + qName + ": "+ attributes.getValue(0) + " "
                                                            + attributes.getValue(1) + " "
                                                            + attributes.getValue(2) + " "
                                                            + attributes.getValue(3) + " "
                                                            + attributes.getValue(4));
        }
        if (qName.equals("customer")) {
            System.out.println("            " + qName + ": "+ attributes.getValue(0) + " "
                                                            + attributes.getValue(1) + " "
                                                            + attributes.getValue(2) + " "
                                                            + attributes.getValue(3) + " "
                                                            + attributes.getValue(4));
        }
        if (qName.equals("cart")) {
            System.out.println("    " + qName + " " + "(" + attributes.getValue(0) + ")");
        }


        // System.out.println("//////// End Element ////////");

    }


}
