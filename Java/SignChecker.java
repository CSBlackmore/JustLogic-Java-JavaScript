package Java;

public class SignChecker {

    public static String checkSign(int num) {
        if (num == 0) {
            return "zero";
        } else if (num > 0 ) {
            return "positive";
        } 
        else {
            return "negative";
        }
    }

    public static void main(String[] args) {
        // Pruebas con código duro
        System.out.println(checkSign(5));   // Esperado: "positive"
        System.out.println(checkSign(-3));  // Esperado: "negative"
        System.out.println(checkSign(0));   // Esperado: "zero"
    }
}

