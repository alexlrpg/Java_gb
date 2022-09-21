package lesson_3;

public class Stats<T> {

    T o;

    T[] returnArr(T[] arr, int a, int b) {
        o = arr[a];
        arr[a] = arr[b];
        arr[b] = o;
        return arr;
    }

}
