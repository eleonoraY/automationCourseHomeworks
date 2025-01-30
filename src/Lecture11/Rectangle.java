package Lecture11;

public class Rectangle extends Shape{
    public double width;
    public double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double calculateRectangleArea(){
        area = height * width;
        System.out.println("Area of the rectangle is: " + area);
        return super.calculateArea();

    }

}
