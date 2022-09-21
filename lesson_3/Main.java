package lesson_3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] inums = {1, 2, 3, 4};
        Stats<Integer> iob = new Stats<>();
        System.out.println(Arrays.toString(iob.returnArr(inums,1,3)));

        Double[] dnums = {1.1, 2.2, 3.3, 4.4};
        Stats<Double> dob = new Stats<>();
        System.out.println(Arrays.toString(dob.returnArr(dnums,0,3)));

        String[] snums = {"Q", "W", "E", "R"};
        Stats<String> sob = new Stats<>();
        System.out.println(Arrays.toString(sob.returnArr(snums,0,2)));

    }

}
