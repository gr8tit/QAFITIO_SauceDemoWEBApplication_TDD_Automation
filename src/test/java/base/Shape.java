package base;

abstract class Shape {
    //abstract method
    abstract double area();

}

class Circle extends Shape{
    static double radius;


    Circle(double radius){
        this.radius = radius;

    }

    //
    @Override
    double area(){
        return Math.PI *radius *radius;
    }

    public static void main(String[] args){
        Circle circle = new Circle(6.0);
        double circleArea = circle.area();

        System.out.println("The area is: " + circleArea);


//        System.out.println(area);

    }
}
