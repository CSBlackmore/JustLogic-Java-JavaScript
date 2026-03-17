package exercises;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        } else if (s.isEmpty()) {
            return false;
        }
        StringBuilder palindrome = new StringBuilder(s);
        palindrome.reverse();
        return palindrome.toString().equalsIgnoreCase(s);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("a")); // true
        System.out.println(isPalindrome("level")); // true
        System.out.println(isPalindrome("hello")); // false
        System.out.println(isPalindrome("")); // false
        System.out.println(isPalindrome(" ")); // true
    }
}

