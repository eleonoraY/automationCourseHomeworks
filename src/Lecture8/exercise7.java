package Lecture8;

public class exercise7 {
    public static void findLastCharacter(String example){
        if(example.isEmpty() || example.length()==0){
            System.out.println("No last symbol");
        }else {
            char lastChar = example.charAt(example.length() - 1);
            System.out.println("The last char is: " + lastChar);
        }

    }

    public static void main(String[] args) {
        findLastCharacter("eli");

    }
}
