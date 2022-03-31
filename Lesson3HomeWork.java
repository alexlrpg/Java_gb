/**
* Java 1. Homework 3
*
* @author Ekaterina Bataeva
* @version 31.03.2022
*/
import java.util.Arrays;

class Lesson3HomeWork {
    
    public static void main (String[] args) {
        
        int[] forNullIsOne = {0, 1, 0, 1, 0};
        nullIsOne(forNullIsOne);
        
        print100Numbers(new int[100]);
        
        int[] forMultiplyBySix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyBySix(forMultiplyBySix);
        
        print2Diagonal(4);
        
        System.out.println(Arrays.toString(print1DArray(4, 8)));
        
        int[] forPrintMinMax = {0, 8, -4, 10, 1};
        printMinMax(forPrintMinMax);
        
        int[] forCheckBalance = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(forCheckBalance));
    }
    
    
    
    static void nullIsOne(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((arr[i] == 0)? 1:0);
        }
        System.out.println(Arrays.toString(arr));   
    }
    
    static void print100Numbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static void multiplyBySix(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
            arr[i] *= 2;  
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void print2Diagonal(int arr) {
        int[][] twoD = new int[arr][arr];
        int x, y = 0;
        for(x = 0; x < twoD.length; x++) {
            for(y = 0; y < twoD[x].length; y++) {
                twoD[x][y] = (x == y || x == (arr-y-1))? 1: 0;
                System.out.print(twoD[x][y] + "\t");
            }
        System.out.println();
        }
    }
    
    static int[] print1DArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
    
    static void printMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
            min = arr[i];
            }
            if (arr[i] > max) {
            max = arr[i];  
            }
        }
        System.out.println("Minimum = " + min + "\t" + "Maximum = " + max);
    }
    
    static boolean checkBalance(int[] nums) {
        int lsum = 0;
        int rsum = 0;
        for(int x : nums) {
            lsum += x;
        }
        for(int x : nums) {
            rsum += x;
            if (rsum == lsum - rsum) {
                return true;
            }
        }
        return false;
        
    }
}
    