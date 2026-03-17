package exercises;

public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        else if (number <= 9) {
            return true;
        }
        String numeroEnCadena = String.valueOf(number);
        StringBuilder palindrome = new StringBuilder(numeroEnCadena);
        palindrome.reverse();
        String reversedNumber = palindrome.toString();
        return numeroEnCadena.equalsIgnoreCase(reversedNumber);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // esperado: true
        System.out.println(isPalindrome(123));  // esperado: false
    }
}


