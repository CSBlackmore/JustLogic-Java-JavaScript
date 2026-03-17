package exercises;
import java.util.*;

public class CountEvenOdd {
    // retorna int[0] = pares, int[1] = impares
    public static int[] countEvenOdd(List<Integer> numbers) {
        int evens = 0;
        int odds = 0;
        for (int numero : numbers) {
            if (numero % 2 == 0) {
                evens++;
            }
            else {
                odds++;
            }
        }
        return new int[]{evens, odds}; // placeholder
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        int[] result = countEvenOdd(nums);
        System.out.println("Pares: " + result[0] + ", Impares: " + result[1]); // esperado: Pares:3, Impares:3
    }
}

