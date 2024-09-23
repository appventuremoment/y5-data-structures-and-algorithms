import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {

        Integer[] num = new Integer[10];
        num[0] = 10;
        num[1] = 7;
        num[2] = 2;
        num[3] = 39;
        num[4] = 32;
        num[5] = 76;
        num[6] = 12;
        num[7] = 16;
        num[8] = 12;
        num[9] = 1;

        System.out.println("Original List: " + Arrays.toString(num));
        System.out.println("Sorting list using HeapSort...");
        System.gc();
        long startTime = System.nanoTime();

        Integer[] resultArr = genericHeapSort(num);

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Sorted integer array: " + Arrays.toString(resultArr));
        System.out.println("Time elapsed: " + elapsedTime + " nano seconds\n");
    }

    public static <T extends Comparable<? super T>> T[] genericHeapSort(T[] data) {
        for (int i = data.length / 2 - 1; i >= 0; i--) {
            heapify(data, data.length, i);
            printer(data);
        }

        for (int i = data.length - 1; i > 0; i--) {
            T temp = data[0];
            data[0] = data[i];
            data[i] = temp;
            printer(data);

            heapify(data, i, 0);
            printer(data);
        }
        return data;
    }
    
    public static <T extends Comparable<? super T>> void heapify(T[] array, int hsize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < hsize && array[left].compareTo(array[largest]) > 0) {
            largest = left;
        }

        if (right < hsize && array[right].compareTo(array[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            T temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;

            heapify(array, hsize, largest);
        }
    }

    public static <T extends Comparable<? super T>> void printer(T[] data){
        System.out.println("After iteration ...: ");
        System.out.println(Arrays.toString(data));
    }
}