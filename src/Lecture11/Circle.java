package Lecture11;

public class Circle extends Shape{
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle is: " + area);
        return super.calculateArea();
    }

}
