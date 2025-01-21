package Lecture8;

public class exercise9 {
    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);

        int first = 0;
        int last = str.length() - 1;

        while (first < last) {
            if (str.charAt(first) != str.charAt(last)) {
                return false;
            } else {
                first++;
                last--;
            }

        }
        return true;
    }


        public static void main (String[]args){
            System.out.println(isPalindrome(343));
            System.out.println(isPalindrome(3437));
            System.out.println(isPalindrome(13531));
        }
    }

