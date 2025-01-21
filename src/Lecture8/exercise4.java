package Lecture8;

public class exercise4 {
    public static void main(String[] args) {
            wordsCount("My name is Eleonora.");
        }

        public static void wordsCount(String example){
            String[] wordsArray = example.split(" ");
            System.out.println("The number of the words in the sentence is: " + wordsArray.length);
        }
}
