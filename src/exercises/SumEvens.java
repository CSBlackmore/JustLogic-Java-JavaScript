package exercises;
import java.util.*;

public class SumEvens {
    public static int sumEvens(List<Integer> numbers) {
        
        int suma = 0;

        for (Integer numero : numbers) {
            if (numero % 2 == 0) {
                suma += numero;
            }
        }

        return suma;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 6);
        System.out.println(sumEvens(nums)); // 12
    }
}

