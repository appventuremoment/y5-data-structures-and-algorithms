import java.util.Arrays;

public class QuickSortMedian {
    public static void main(String[] args) {
        int[] intArray = { 1, 9, 2, 8, 3, 7, 4, 6, 5 };
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(quickSortMedian(intArray)));
    }

    public static int[] quickSortMedian(int[] intArray){
        int[] result = intArray;
        quickSortMedian(result, 0, intArray.length-1);
        return result;
    }

    // Do NOT modify the method name and parameter signature.
    public static void quickSortMedian(int[] intArray, int left, int right) {
        if (left < right){
            int pivot = partition(intArray, left, right);
            quickSortMedian(intArray, left, pivot-1);
            quickSortMedian(intArray, pivot+1, right);
        }
    }

    public static int partition(int[] intArray, int first, int last) {
        int[] temp = new int[]{intArray[first], intArray[last], intArray[(first + last) / 2]};
        Arrays.sort(temp);
        int pivot = temp[1];
        int pivotInd = getInd(intArray, pivot);
        intArray[pivotInd] = intArray[first];
        intArray[first] = pivot;
        int low = first + 1;
        int high = last;


        while (high > low) {
            while (low <= high && intArray[low] <= pivot) {
                low++;
            }
            while (low <= high && intArray[high] > pivot) {
                high--;
            }
            if (high > low) {
                int copy = intArray[low];
                intArray[low] = intArray[high];
                intArray[high] = copy;
            }
        }
        while (high > first && intArray[high] >= pivot){
            high--;
        }
        if (pivot > intArray[high]) {
            intArray[first] = intArray[high];
            intArray[high] = pivot;
            return high;
        }
        else return first;
    }

    public static int getInd(int[] input, int t){
        for (int i = 0; i < input.length; i++){
            if (input[i] == t){
                return i;
            }
        }
        return -1;
    }
}