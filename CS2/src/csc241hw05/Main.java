package csc241hw05;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

;

/**
 * @author mcruz
 */

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


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
                System.out.println(ANSI_RED + "Not a valid input! Run and try again" + ANSI_RESET);
                System.exit(0);
            }
            while (true) {
                System.out.println("Enter the ISBN:");
                System.out.print(">>> ");
                String ISBN = sc.next();
                if (ISBN.equalsIgnoreCase("exit")) {
                    System.out.println(ANSI_CYAN+"Program ended"+ANSI_RESET);
                    System.exit(0);
                } else {
                    HashMap database = handler.getDatabase();
                    if (database.get(ISBN) == null) {
                        System.out.println(ANSI_RED + "No product infomation found for " +ISBN + " :^( " + ANSI_RESET);
                    } else {
                        System.out.println(ANSI_CYAN+"Product found!"+ANSI_RESET);
                        System.out.println(ANSI_YELLOW + database.get(ISBN) + ANSI_RESET);
                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}