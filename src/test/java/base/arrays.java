package base;

import java.util.Arrays;

public class arrays {

    //declare an array
//    int[] a = new int[4];
//    double[] b = new double[8];

//    int  c[] = new int[5];
//    double d[] = new double[6];

    //Assign values to array

    static int[] a = {4,2,6,6, 8, 9 ,0, 8, 7, 12};

    //arrayname.length = numbers of element in the array = size of array
    //Array name = a of integer type
    //Array index= size of array - 1
    // index of 1 = 0
    //index of 2 = 1
    //index of 3 = 2
    //index of 4 = 3
    //Array index = 4 - 1 = 3   3-1 = 2
    //index of last value = Array length - 3 -1 = 2


    static int[] f = {1,2,3,5};

//    double[] g = {1.00, 3.4, 5.0, 6.7};

    //Multi-dimentional array

//    int[][] e = new int[2][2];
//    double[][] h = new double[2][3];



    public static void main(String[] args){
//        System.out.println("you are welcome");

        arrays arry = new arrays();
        arry.printArray();


//        System.out.println(f[2]);
//        for(int i = 1; i < f.length; i++){
//            System.out.println(f[i] + ",");
            //index value 3, 2, 1
            //last index = length/size - 1
            //4 - 1 = 3//
            //size of array = 4
            //index size = 3

        }

        public static void printArray(){
//            System.out.print("{" + a[0]);
            for(int i = 1; i < a.length; i++){
                //1, 2, , 12
//                System.out.print(", " + a[i]);
                System.out.println(Arrays.toString(new int[]{a[i]}));
            }
//            System.out.print("}");
        }

    //Assignment
    //declare a multidimensional array, use a method different from the main method to return your output






    }






