package Arrays.SelectionSort;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        int min_index = -1;
        for(int i = 0; i< array.length; i++) {

            min_index = i;

            for(int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]){
                    min_index = j;
                }
            }

            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
