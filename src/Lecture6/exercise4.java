package Lecture6.homework;

public class exercise4 {
    public static void main(String[] args) {
        int[] array = {23,4478,17,96444,344};

        int max = array[0];

        for(int i = 0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("The biggest number is: " + max);
    }
}
