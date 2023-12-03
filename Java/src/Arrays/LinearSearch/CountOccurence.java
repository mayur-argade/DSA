package Arrays.LinearSearch;

public class CountOccurence {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 9, 5, 6, 7 , 8, 9 };
        int target = 9;

        int occurenceCount = 0;
        int firstOccurence = -1;

        for (int i = 0; i< array.length; i++){
            if(array[i] == target){
                occurenceCount++;
                if(firstOccurence < 0) {
                    firstOccurence = i;
                }
            }
        }

        System.out.println("first Occurence = "+ firstOccurence);
        System.out.println("occurence count = " + occurenceCount);
    }
}