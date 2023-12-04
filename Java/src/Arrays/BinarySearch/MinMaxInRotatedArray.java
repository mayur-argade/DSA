package Arrays.BinarySearch;

public class MinMaxInRotatedArray {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        int start = 0;
        int end = array.length - 1;

//handle edge case of n times rotated array

        while(start <= end){
            int mid = start + (end - start) / 2 ;
            int prev = (mid - 1 + array.length) % array.length;
            int next = (mid + 1) % array.length;
            if(array[prev] < array[mid] && array[mid] > array[next ]){
                System.out.println("Maximum element " + array[mid]);
                System.out.println("Minimum element " + array[next ]);
                return;
            }
            else if (array[prev] < array[mid] && array[mid] < array[next ]){
                start = next ;
            }
            else {
                end = mid - 1 ;
            }
        }
    }
}
