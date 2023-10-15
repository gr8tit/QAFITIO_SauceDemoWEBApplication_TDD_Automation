package base;

public class polyAnimal {

    public static void animalCrawl(Animal animal){
        animal.crawls();
    }

    public static void main(String[] args){
        Animal animal = new Animal("Dog");
        Dog mydog = new Dog("Viper");

        mydog.speak();
        animal.crawls();

    }


}


