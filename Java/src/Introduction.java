import java.util.Arrays;
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        System.out.println("hello world from class introduction");
//    variable(2);
//    stringInfo();
//    arrayInfo();
//        inputOutput();
//        loops();
        exceptionHandeling();
    }

    public static void variable(int no){
        String name = new String("mayur") ;
        String friend = name;

//    Primitive datatypes (capacity is fixed)
//        byte = 1 [ -128 to 127 ]
        byte age2 = 30;

//        short

//        int
        int phone = no ;

//        long
        long phone2 = 9076102474L ;

//        float
        float pi = 3.14F;

//        double

//        char
        char letter = '@';

//        boolean
        boolean isAdult = false;


//        Non-Primitive Datatypes (has to create with new keyword) (have there functions which we can use for them to extract some of the data from them)
        String address = new String("this is address string you can store");
        System.out.println(address.length());
    }

    public static void stringInfo() {
//        Concatenate
        String firstName = new String("Mayur");
        String lastName = new String("Argade");

        System.out.println(firstName + " " + lastName);

//        characted at (position)
        System.out.println(lastName.charAt(0));

//        length
        System.out.println(firstName.length());

//        replace
        String smallerCaseLastname = lastName.replace('A', 'a');
        System.out.println(smallerCaseLastname);

//        substring
        String info = new String("helloIamMayur");
        System.out.println(info.substring(0,5));;

    }

    public static void arrayInfo() {
//        Array is non-primitive datatype (we have to initialize it with new keyword)

        int[] array = new int[3] ;
        array[0] = 3;
        array[1] = 2;
        array[2] = 1;

//        length is property
        System.out.println(array.length);

//        Sort
        Arrays.sort(array);
        System.out.println(array[0]);

//        Print array in java
        System.out.println(Arrays.toString(array));

//        2D array
        int[][] array2 = {{0, 1, 2}, { 3, 4, 5}} ;
        System.out.println(Arrays.deepToString(array2));
    }

    public static void casting() {
//        implicit casting
        double price = 100 ;
        double finalPrice = price + 18 ;

        System.out.println(finalPrice);

//        explicit casting
        int price2 = 100 ;
        int finalPrice2 = price2 + (int)18.0 ;
        System.out.println(finalPrice2);

    }

    public static void constants() {
//      cannot change this value in the after code
        final int age = 2 ;
        System.out.println(age);
    }

    public static void operators() {
//      + - * /
//        % gives you remainder
//        num++

//        comparison operator
//        == != < > <= >=

//        Math class
        System.out.println(Math.min(9, 0));
        System.out.println(Math.max(9, 0));
        System.out.println((int)Math.random()*10);
    }

    public static void inputOutput() {
        Scanner sc = new Scanner(System.in) ;
        int age = sc.nextInt();
        System.out.println(age);

        String name = sc.next(); // will take only one word
        String address = sc.nextLine();

    }

    public static void conditionalStatements() {
//        if using && then need to correct both conditions
//        if using || then only one condition needs to be true
        boolean isSunUp = false;

        if(isSunUp == false){
            System.out.println("night");
        }
        else {
            System.out.println("day");
        }

        int day = 1 ;
        switch ( day ) {
            case 1:
                System.out.println("1");
                break; // will break the loop
            case 2:
                System.out.println("2");
            default:
                System.out.println("default case");
        }
    }

    public static void loops () {
        for (int i = 0; i <= 10; i++ ){
            System.out.print(i);
        }

        int i = 0;
        while(true){
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++ ;
            if (i >= 10){
                break;
            }
        }

        do {
            System.out.println(i);
            i++ ;
        }while(i <= 10);

    }

    public static void exceptionHandeling () {
//    TRY Catch block (this will run the code which is in try block if there is any exception in that code it will catch it into catch block and will do operation whichever we have written in the catch block and after running those try catch block simply code from the next lines out of the ry catch block will get executed)
        try{
            int[] array = {1, 2, 3} ;
            System.out.println(array[4]);
        }catch (Exception exception){
//            array.push(5);
        }
//        System.out.println(Arrays.toString(array));

        System.out.println("mayur");

    }
}
