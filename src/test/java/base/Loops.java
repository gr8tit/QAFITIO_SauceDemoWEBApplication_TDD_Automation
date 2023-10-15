package base;

import java.util.Scanner;

public class Loops {

    static int x = 6;


    public static void main(String[] args) {

        //While Loop
//    while(x > 0)
//    {
//        System.out.println(x);
//        System.out.println("Blastoff");
//        break;
//
//    }

        //While loop with if else condition
//        while (x <= 0) {
////            System.out.println(x);
//            if (x % 2 == 0) {
//                System.out.println(x);
//            } else {
//
//                x = x * 1;
//                System.out.println("blastoff");
//            }
//
//        }
//        System.out.println(x);


//        int i = 1;
//        while(i < 10){ //true
//            double x = i;
//            System.out.println(x + " is " + Math.log(x) / Math.log(2));
//            i = i + 2; //increment
//            //i = 1 +2  =3
//            //i =  3 + 2 = 5
//            //i =  5+ 2 = 7
//        }

        //Do while


        Scanner scanner = new Scanner(System.in);
        boolean myinput = false;
        do {
            System.out.print("Enter a number: ");
            if (scanner.hasNextDouble()) {
                myinput = true;
            }
//            else {
//                myinput = false;

//                String word = scanner.next();

//                System.err.println("Not a number");
//            }
        }
        while (myinput);
        double xinput = scanner.nextDouble();
        System.out.println("Number is false");


        //true

    }


//    break;


}
