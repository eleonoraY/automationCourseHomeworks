package Lecture12;

public class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    public void getArea() {
       double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle area: " + area);
    }

    @Override
    public void getPerimeter() {
       double perimeter = 2 * Math.PI * radius;
        System.out.println("Circle perimeter: " + perimeter);
    }
}
