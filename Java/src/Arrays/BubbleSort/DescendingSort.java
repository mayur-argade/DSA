package Arrays.BubbleSort;

import java.util.Arrays;

public class DescendingSort {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < array.length; i++){

            boolean swapped = false;
            for(int j = 1 ; j < array.length; j++){
                if(array[j-1] < array[j]){
                    int temp = 0;
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
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
