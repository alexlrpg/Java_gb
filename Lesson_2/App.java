/**
 * Java 2. Homework 2
 *
 * @author Ekaterina Bataeva
 * @version 18.09.2022
 */

package Lesson_2;

public class App {

    public static void main(String[] args) {

        String[][] one = {
                {"1", "2", "4"},
                {"1", "2", "2"},
                {"5", "5", "8"},
                {"1", "8", "1"}
        };

        String[][] two = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        String[][] three = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "p"}
        };

        try {
            arraySum(one);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            arraySum(two);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            arraySum(three);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    static void checkSize(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }
    }

    static void arraySum(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        checkSize(arr);
        int i = 0;
        int j = 0;
        try {
            int sum = 0;
            for (i = 0; i < arr.length; i++) {
                for (j = 0; j < arr.length; j++) {
                    sum += Integer.parseInt(arr[i][j]);
                }
            }
            System.out.println("Сумма: " + sum);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Ошибка в ячейке: " +i+","+j);
        }
    }
}
