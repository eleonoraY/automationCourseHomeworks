package Lecture8;

public class exercise2 {
    public static void main(String[] args) {
        int a = 30;
        int b = 10;
        int c = 40;
        System.out.println("The average sum is: " + averageSum(a,b,c));
    }

    public static double averageSum(int a, int b, int c){
        double averageSum = (a + b + c) / 3.0;
        return averageSum;
    }
}
