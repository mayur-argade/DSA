package Arrays;

import java.util.Scanner;

public class ReverseAnArray {
// use all the loops to solve this question

//   for loop
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5};

//      for loop
        for(int i = array.length - 1 ; i >= 0 ; i--){
            System.out.print(array[i] + " ");
        }

        System.out.println("");

//      while loop
        int i = 0;
        int j = array.length - 1;

        while (i <= j){
            System.out.print(array[j] + " ");
            j--;
        }

        System.out.println("");

//      do while loop
        int A = 0;
        int B = array.length - 1;
        do {
            System.out.print(array[B] + " ");
           B--;
        }while(A <= B);
    }
}
