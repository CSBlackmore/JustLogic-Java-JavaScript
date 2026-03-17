package exercises;
import java.util.*;

public class OddNumbers {

    public static List<Integer> getOdds(List<Integer> numbers) {
        
        List<Integer> soloImpares = new ArrayList<>();
        
        for (int elemento : numbers) {
            if (elemento % 2 != 0) {
                soloImpares.add(elemento);
            }
        }
        return soloImpares;
    }

    public static void main(String[] args) {
        // Pruebas con código duro
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> nums2 = Arrays.asList(10, 11, 12, 13, 14);

        System.out.println(getOdds(nums1)); // Esperado: [1, 3, 5]
        System.out.println(getOdds(nums2)); // Esperado: [11, 13]
    }
}
