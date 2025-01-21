package Lecture8;

public class exercise1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = -25;

        System.out.println("The minimum number is: " + minNumber(a,b,c));

    }

        public static int minNumber(int a, int b, int c){
            int minNum = a;
            if(b < minNum) {
                minNum = b;
            }
            if(c < minNum){
                minNum = c;
            }

            return minNum;
        }
}
