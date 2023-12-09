package Arrays.InsertionSort;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for(int i=1; i < array.length - 1; i++){
            for(int j = i+1; j >= 0; j--){
                if(array[j-1] > array[j]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }else{
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
