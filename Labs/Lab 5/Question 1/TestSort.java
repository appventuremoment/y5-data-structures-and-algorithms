import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {
        Integer[] numArr = {91, 7, 2, 38, 31, 76, 12, 15, 12, 3};
        System.gc();

        long startTime = System.nanoTime();

        Integer[] resultArr = genericSort(numArr);

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Sorted integer array: " + Arrays.toString(resultArr));
        System.out.println("Time elapsed: " + elapsedTime + " nano seconds\n");
    }

    // State what sorting algorithm the below method implements as a comment
    // DO NOT CHANGE THE FOLLOWING METHOD NAME 
    public static <T extends Comparable<? super T>> T[] genericSort (T[] data) {
        return selectionSort(data);
    }

    private static <T extends Comparable<? super T>> T[] bubbleSort(T[] data) {
        for (int k = 1; k < data.length; k++) {
            for (int i = 0; i < data.length - k; i++) {
                if (data[i].compareTo(data[i + 1]) >= 1) {
                    T temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            }
        }
        return data;
    }
    private static <T extends Comparable<? super T>> T[] selectionSort(T[] data) {
        for (int k = 0; k < data.length - 1; k++) {
            int minIndex = k;
            for (int i = k + 1; i < data.length; i++) {
                if (data[i].compareTo(data[minIndex]) < 0) {
                    minIndex = i;
                }
            }
            if (minIndex != k) {
                T temp = data[k];
                data[k] = data[minIndex];
                data[minIndex] = temp;
            }
        }
        return data;
    }
    private static <T extends Comparable<? super T>> T[] insertionSort(T[] data){
        for (int k = 1; k < data.length; k++){
            T curr = data[k];
            int i = k - 1;
            for (i = k - 1; i >= 0 && curr.compareTo(data[i]) < 0; i --){
                data[i + 1] = data[i];
            }
            data[i + 1] = curr;
        }
        return data;
    }
}