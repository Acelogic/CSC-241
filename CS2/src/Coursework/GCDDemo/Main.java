package Coursework.GCDDemo;

import java.util.spi.CalendarDataProvider;

public class Main {

    private static int gcd(int p, int q) {
        System.out.println("DEBUG: P: " + p + " Q:" + q);
        if (q == 0) {
            return p;
        } else {

            return gcd(q, p % q);
        }
    }


    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;

        } else {
            System.out.println(str);
            return str.charAt(0) == str.charAt(str.length() - 1) && isPalindrome(str.substring(1, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        //System.out.println("GCD:" + gcd(248764, 3645));
        System.out.println(isPalindrome("racecar"));
    }

}
