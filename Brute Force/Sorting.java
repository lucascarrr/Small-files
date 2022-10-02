import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] unsorted = new int[]{3, 1, 5, 7, 9, 2, 4};
        System.out.println("Selection Sort: ");
        System.out.println(Arrays.toString(selectionSort(unsorted)));

        System.out.println("Bubble Sort: ");
        System.out.println(Arrays.toString(bubbleSort(unsorted)));
    }

    public static int[] selectionSort(int[] unsorted_array) {
        int[] sorted = unsorted_array.clone();

        for (int i = 0; i < sorted.length; i++) {
            int smallest_index = i;
          
            for (int j = i; j < sorted.length; j++) {
                if (sorted[j] <= sorted[smallest_index]){
                    smallest_index = j;
                }
            }
            int first = sorted[i];
            int second = sorted[smallest_index];
            sorted[i] =  second;
            sorted[smallest_index] = first;
            
        }

        return sorted;
    }

    public static int[] bubbleSort(int[] unsorted_array) {
        int[] sorted = unsorted_array.clone();

        for (int i = 0; i < sorted.length-1; i++) {
            for (int j = 0; j < sorted.length-1; j++){
                int first = sorted[j];
                int second = sorted[j+1];
                if (first > second){
                    sorted[j] = second;
                    sorted[j+1] = first;
                }
            }

        }

        return sorted;
    }
}
