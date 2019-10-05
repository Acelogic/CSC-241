package csc241hw03;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler {


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
            System.out.println("/=/=/=/=/ Start Element /=/=/=/=/");
            System.out.println("URI:" + uri);
            System.out.println("LOCALNAME:" + localName);
            System.out.println("KEY:" + qName); //QNAME
            System.out.println("ATTRIBUTES:");

        // Print out each attribute by name and value
        for (int i = 0; i < attributes.getLength(); i++) {
            // Get attribute
            System.out.println("\tATTRIBUTE KEY: " + attributes.getQName(i) + "   " + i);
            System.out.println("\tATTRIBUTE VALUE: " + attributes.getValue(i) + "    " + i);


        }
        System.out.println("//////// End Element ////////");

    }





}
