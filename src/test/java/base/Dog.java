package base;

public class Dog extends Animal {

    String mamals;
    String birds;

    public Dog(String name) {
        super(name);
    }

    public void speak(){
        System.out.println(name + " says gbo gboh");
    }


    public static void main(String[] args){
        Dog dg = new Dog("Jack");
        dg.speaks();
    }


}
