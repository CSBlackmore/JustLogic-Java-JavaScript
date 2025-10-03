import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String a, String b) {

        char [] palabra1 = a.toLowerCase().toCharArray();
        char [] palabra2 = b.toLowerCase().toCharArray();

        Arrays.sort(palabra1);
        Arrays.sort(palabra2);

        return Arrays.equals(palabra1, palabra2);
        
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listEn", "Silent")); // true
        System.out.println(isAnagram("hello", "world"));   // false
    }
}

