package exercises;
import java.util.*;

public class SmallestNumber {

    public static int findSmallest(List<Integer> numbers) {
        int smallest = numbers.get(0);
        for (int numero : numbers) {
            if (numero < smallest) {
                smallest = numero;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        // Pruebas con código duro
        List<Integer> nums1 = Arrays.asList(4, 2, 7, 1, 9);
        List<Integer> nums2 = Arrays.asList(-3, -7, 0, 5, 2);

        System.out.println(findSmallest(nums1)); // Esperado: 1
        System.out.println(findSmallest(nums2)); // Esperado: -7
    }
}

