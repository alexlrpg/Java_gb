/**
* Java 1. Homework 2
*
* @author Ekaterina Bataeva
* @version 26.03.2022
*/

class Lesson2HomeWork {
    
    public static void main (String[] args) {
       System.out.println(checkSumTruth(10, 15)); 
       negativeOrPositive(0);
       System.out.println(negativeNumTrue(1));
       stringAndNumber("Some text", 5);
       System.out.println(leapYear(2100));
    }
    
    static boolean checkSumTruth(int a, int b) {
        return a + b >= 10 && a+b <= 20;
    }
    
    static void negativeOrPositive(int a) {
        System.out.println(a >= 0? "Positive" : "Negative");
    }
    
    static boolean negativeNumTrue(int a) {
        return !(a >= 0);
    }
    
    static void stringAndNumber(String text, int a) {
        for (int b = 0; b < a; b++) {
            System.out.println(text);
        }
    }

    static boolean leapYear(int y) {
        return ((y % 4) == 0) && !((y % 100) == 0) || ((y % 400) == 0);
    }        

    
}
