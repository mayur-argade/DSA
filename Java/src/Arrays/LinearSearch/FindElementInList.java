package Arrays.LinearSearch;

public class FindElementInList {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int target = 6;

        for (int i = 0; i < array.length; i++){
            if(target == array[i]){
                System.out.println("element found at position " + i);
                break;
            }
        }
    }
}
