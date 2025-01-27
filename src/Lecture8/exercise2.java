package Lecture8;

public class exercise2 {
    public static void main(String[] args) {
        double a = 30;
        double b = 10;
        double c = 40;
        System.out.println("The average sum is: " + averageSum(a,b,c));
    }

    public static double averageSum(double a, double b, double c){
        double averageSum = (a + b + c) / 3;
        return averageSum;
    }
}
