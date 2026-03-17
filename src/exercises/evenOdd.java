package exercises;

public class evenOdd {
    public static String checkEvenOdd(int number) {
        
        if (number == 0) {
            return "El valor ingresado es cero.";
        }
        else if (number % 2 == 0) {
            return "El valor " + number + " es par";
        }
        else if (number % 2 != 0) {
            return "El valor " + number + " es impar";
        }
        else {
            return "El valor ingresado no es un número entero.";
        }
    }

    public static void main(String[] args) {
        System.out.println(checkEvenOdd(4)); // "even"
        System.out.println(checkEvenOdd(7)); // "odd"
    }
}
