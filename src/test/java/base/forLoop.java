package base;

public class forLoop {

    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) {
//            System.out.println("The result is " + i);
//
//            //1, 1+1, 2+1, 3+1 .... 9+1
//
//        }
        for(int i = 1; i <=10; i++){ //print even numbers from 1 to 10
            if(i % 2 == 0){
                System.out.println(i + " is even");

            }else{
                System.out.println(i + " is odd");
            }

            //1%2 = 1 ; 1 + 1 = 2  odd
            //2%2 = 0 ; 2 + 1 = 3 even
            //3%2 = 1; 3 + 1 = 4 odd
            //4%2 = 0; 4 + 1 = 5 even
            //5%2 = 1;  5 + 1 = 6 odd

        }

    }
}
