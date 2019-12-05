package csc241hw06;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

;

/**
 * @author mcruz
 */

public class Main {
    public static void main(String[] args) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            Handler handler = new Handler();
            Scanner sc = new Scanner(System.in);
            File fileInput = null;

            System.out.println("Enter the input file Name (Case Sensitive & Include Extension)");
            System.out.println("( If you want to browse the filesystem for your own .xml file type in f )");
            try {
                String kbInput = sc.next();
                if (kbInput.equals("f")) {
                    JFileChooser chooser = new JFileChooser();
                    chooser.setFileFilter(new FileNameExtensionFilter("XML", "xml"));
                    int returnVal = chooser.showOpenDialog(chooser);
                    String path = null;
                    if (returnVal == JFileChooser.APPROVE_OPTION) {
                        path = chooser.getSelectedFile().getPath();
                    }
                    assert path != null;
                    fileInput = new File(path);
                } else {
                    fileInput = new File(kbInput);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                assert fileInput != null;
                saxParser.parse(fileInput, handler);
            } catch (FileNotFoundException e) {
                System.out.println("Not a valid input! Run and try again");
                System.exit(0);
            }

            System.out.println("Count of products: " + handler.getProducts().stream()
                    .count());

            System.out.println("Sorted product names: ");
            handler.getProducts().stream()
                    .sorted()
                    .forEach(product -> System.out.println(product.getProductName()));

            System.out.println("Total Price: " + handler.getProducts().stream()
                    .mapToDouble(Product::getPrice)
                    .sum());



        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}