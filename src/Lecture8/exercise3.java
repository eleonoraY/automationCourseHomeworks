package Lecture8;

public class exercise3 {
    public static void main(String[] args) {
        findMiddleCharacter("Stanimira");
        findMiddleCharacter("Eleonora");
    }

    public static void findMiddleCharacter(String stringParam){
        int length = stringParam.length();
        System.out.println("The length of the string is: " + length);
        int index = 0;
        String result = "";

        if(length % 2 == 0){
            index = length / 2;
            System.out.println("The middle character of the name is: " + result + stringParam.charAt(index-1) + stringParam.charAt(index));
        }else if(length % 2 != 0){
            index = (length / 2) - 1;
            System.out.println("The middle character of the name is: " + stringParam.charAt(index + 1));
        }

    }
}
