package Arrays.BinarySearch;

public class FindElementInList {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 0;

//        check array is sorted or not

//        check array is ascending or descending

        int start = 0;
        int end = array.length -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == array[mid]){
                System.out.println("Element found at index " + mid);
                return;
            }
            else if(target > array[mid]){
                start = mid + 1 ;
            }
            else if (target < array[mid]){
                end = mid - 1 ;
            }

        }
    }
}
