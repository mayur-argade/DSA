package Arrays;

public class MaxMinElement {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4} ;

        int min = array[0];
        int max = array[0];

        for(int i =0; i < array.length ; i++){
            if(array[i] < min) {
                min = array[i];
            }else if(array[i] > max){
                max = array[i];
            }
        }

        System.out.println("minimum " + min);
        System.out.println("Maximum " + max);

    }
}
