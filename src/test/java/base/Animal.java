package base;


//parent class Animal*
public class Animal {
    String name  = "Dog";
    String reptiles;


    //constructor
    public Animal(String name){
        this.name = name;
    }

    //Action points
    public void speaks(){
        System.out.println("My dog barks");
    }

    public void crawls(){
        System.out.println("My snake crawls");
    }

    public static void main(String[] args){
        System.out.println("Here is my dog -Jack");


    }



}

