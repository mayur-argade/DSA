package Arrays.BubbleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        boolean swapped = false;

        for (int j = 0 ; j < array.length; j++){
            for(int i = 1; i < array.length; i++){
                if (array[i-1] > array[i]){
                    int temp = 0;
                    temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
