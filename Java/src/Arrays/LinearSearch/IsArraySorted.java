package Arrays.LinearSearch;

public class IsArraySorted {
    public static void main(String[] args) {
    int[] array = {9, 8, 7, 6, 6, 4, 3, 2, 1, 0};

//    ascending = 1 2 3 array[i-1] < array[i] < array[i+1]
//    descending = 3 2 1 array[i-1] > array[i] > array[i+1]

        boolean flag = false;
    for(int i = 1; i < array.length - 1; i++){
        if(array[i-1] <= array[i] && array[i] <= array[i+1] || array[i-1] >= array[i] && array[i] >= array[i+1] ){
            flag = true;
            continue;
        }else{
            flag = false;
            System.out.println("array is unsorted");
            break;
        }
    }

    if(flag == true){
        System.out.println("array is Sorted");
    }
    }
}
