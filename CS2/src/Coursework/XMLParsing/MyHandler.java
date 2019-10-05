/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coursework.XMLParsing;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author jearly
 */
public class MyHandler extends DefaultHandler {
    
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("URI:" + uri);
        System.out.println("LOCALNAME:" + localName);
        System.out.println("QNAME:" + qName);
        System.out.println("ATTRIBUTES:");
        
        // Print out each attribute by name and value
        for (int i = 0; i < attributes.getLength(); i++) {
            // Get attribute
            System.out.println("\tATTRIBUTE QNAME: " + attributes.getQName(i));
            System.out.println("\tATTRIBUTE VALUE: " + attributes.getValue(i));            
        }

    }
}
