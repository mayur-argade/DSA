package Arrays;

public class KthMaxMin {
    public static void main(String[] args) {
//        finding kth largest and kth smallest

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7};

        int k = 2;
        int min = array[0];
        int max = array[0];
        int minCounter = 0;
        int maxCounter = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] < min && minCounter !=2 ){
                min = array[i];
                minCounter++;
            }else if (array[i] > max && maxCounter !=2){
                max = array[i];
                maxCounter++;
            }
        }

        System.out.println("minimum " + min);
        System.out.println("Maximum " + max);
//        smallest = 1,
//        larget = 6
    }
}
