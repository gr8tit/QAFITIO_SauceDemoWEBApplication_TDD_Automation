package base;
import java.util.Scanner;

public class objectPerson {

    //declarations

    public static String name;
    public static int age;

    public static String location;



    //constructor
    public objectPerson(String name, String location, int age){
        this.name = name;
        this.location = location;
        this.age = age;
    }

    //Action points
//    public String getPerson(String myname){
//        return myname;
//    }
//
//    public int getAge(int myage){
//        return myage;
//    }
//
//    public  String getLocation(String mylocation){
//        return mylocation;
//    }

    public static void main(String[] args){
        objectPerson personname  = new objectPerson("Temitope", "Nigeria", 19);

//        System.out.println("My name is: " + name + " and I am located in "
//                + location + " My age is: " + age);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome Temitope. Please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("You're eligible.Please enter your location: ");
        String location = scanner.nextLine();


        scanner.close();
        System.out.println("Congratulations!!!");


    }

}
