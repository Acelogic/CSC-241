/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coursework.XMLParsing.Holiday;

import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

/**
 *
 * @author jearly
 */
public class MyHandler extends DefaultHandler {
    String currentMonth ="";
    
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        // Show
        System.out.println("---=== Start Element ===---");
        //System.out.println("URI:" + uri);
        //System.out.println("LOCALNAME:" + localName);
        System.out.println("QNAME:" + qName);
        // Iterate over attributes
        for (int i = 0; i < attributes.getLength(); i++) {
            System.out.println("ATTRIBUTES.QNAME:" + attributes.getQName(i));
            System.out.println("ATTRIBUTES.VALUE:" + attributes.getValue(i));
            
        }
        
        if (qName.equals("month")) {
            // new month
            currentMonth = attributes.getValue("name");
            System.out.println("NEW CURRENT MONTH:" + currentMonth);
        }
        
        if (qName.equals("holiday")) {
            // create a holiday object
            Holiday newHoliday = new Holiday(currentMonth,
            Integer.parseInt(attributes.getValue("day")),
            attributes.getValue("name"));
            System.out.println("HOLIDAY:" + newHoliday.month + " " + newHoliday.day);
        }
        
    }
    
}
