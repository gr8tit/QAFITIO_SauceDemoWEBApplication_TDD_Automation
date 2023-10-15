package base;

abstract class Vehicle {
    //
    abstract String vehiclename();


}

class Car extends Vehicle{
    String colour;
    String wheels;

    Car(String colour, String wheels){
        this.colour = colour;
        this.wheels = wheels;
    }

    @Override
    String vehiclename(){
        System.out.println("My Car is strong");
        return  colour;

    }

    public static void main(String[] args){
        Car car = new Car("green", "4 wheels");
        car.vehiclename();



    }
}
