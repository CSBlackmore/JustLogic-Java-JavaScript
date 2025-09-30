package Java;

public class StringLengthCheck {
    public static String checkLength(String text) {
        
        return (text.length() > 5) ? "Long" : "Short";

    }

    public static void main(String[] args) {
        System.out.println(checkLength("hola")); // short
        System.out.println(checkLength("programacion")); // long
    }
}
