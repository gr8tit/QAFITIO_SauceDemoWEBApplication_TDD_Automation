package base;

public class ControlStructures {

//    static int a = 9;
//    static int b = 10;
//    static int x = -1;

    public static void main(String[] args) {
        int n = 2;
        int myresult = fibonacci(n - 1) + fibonacci(n - 2);
        System.out.println("The fibonacci number is: " + myresult);
//        return fibonacci(n - 1) + fibonacci(n - 2);
    }

//        if(a > b){
//            System.out.println("hurray:" + b);
//
//        } else{
//            System.out.println("Hu-uh " + a);
//        }

        //If Condition
//        if (x > 0) {
//            System.out.println("x is positive");
//        }

        //If else
//        if (x % 2 == 0) {
//            System.out.println("x is even");
//        } else {
//            System.out.println("x is odd");
//        }

        //if else-if

//        if (x > 0) {
//            System.out.println("x is positive");
//        }
//        else if (x < 0) {
//            System.out.println("x is negative");
//        } else {
//            System.out.println("x is zero");
//        }

        //nested if-else
//        if (x == 0) {
//            System.out.println("x is zero");
//        } else {
//            if (x > 0) {
//            System.out.println("x is positive"); }
//            else {
//                System.out.println("x is negative");
//            }
//        }

        public static int fibonacci ( int n){
            if (n == 1 || n == 2) {
                return 1;
            }else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
                return n;
            }
        }

}
