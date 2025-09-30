package Java;

public class CheckVowel {
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;             
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isVowel('a')); // true
        System.out.println(isVowel('z')); // false
    }
}
