package base;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);

//        boolean okay;
//
//        do {
//            System.out.println("Enter a number: ");
//            if (scanner.hasNextDouble()) {
//                okay = true;
//
//            } else {
//                okay = false;
//                String word = scanner.next();
//                System.err.println(word + "  is not number");
//
//                break;
//
//            }
//        }
//
//        while (!okay);
//        if (!okay) {
//            double x = scanner.nextDouble();
//            System.out.println("Your number is valid " +  x);
//
//        } else {
//            System.out.println("Your number is invalid ");
//        }

        int i = 1;

        do {
            System.out.println(i);
            i++;


            //i++ =  i+1, i-- = i-1,  i -=   = i- x,  i +=  i + x;
        }while (i <=10);

        // 1, 1 + 1, 2 + 1, 3 + 1, 4+1

    }
}



