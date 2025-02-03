package Lecture12;

public class Rectangle implements Shape{
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        double area = length * width;
        System.out.println("Rectangle area: " + area);
    }
    public void getPerimeter(){
        double perimeter = 2 * (length + width);
        System.out.println("Rectangle area: " + perimeter);
    }
}
