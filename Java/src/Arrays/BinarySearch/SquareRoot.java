package Arrays.BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
//        find square root
        int target = 9;
//      0, 1, 2, 3, 4, 5, 6, 7, 8

//        mid = 16

        int start = 0;
        int end = target;

        while (start <= end){

            int mid = start + ( end - start ) / 2 ;

            if(target == 0 || target == 1){
                System.out.println("square root = " + target);
                return;
            }
            else if (target == (mid*mid)){
                System.out.println(mid);
                return;
            }
            else if (target > (mid*mid)) {
                start = mid + 1;
            }
            else if (target < (mid*mid)) {
                end = mid - 1 ;
            }
        }
        System.out.println("no root found");
    }

}
