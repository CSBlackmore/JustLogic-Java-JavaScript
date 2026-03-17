package exercises;

public class MultipleOfThree {

    public static String checkMultiple(int num) {
        
        return (num % 3 == 0) ? "multiple of 3" : "not multiple of 3";
    }

    public static void main(String[] args) {
        // Pruebas con código duro
        System.out.println(checkMultiple(9));   // Esperado: "multiple of 3"
        System.out.println(checkMultiple(10));  // Esperado: "not multiple of 3"
        System.out.println(checkMultiple(0));   // Esperado: "multiple of 3"
    }
}
