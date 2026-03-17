package exercises;
import java.util.*;

public class CountIntegers {
    public static int countIntegers(List<Object> items) {
        
        List<Object> totalEnteros = new ArrayList<>();

        for (Object elemento : items ) {
            if (elemento instanceof Integer) {
                totalEnteros.add(elemento);
            }
        }
        return totalEnteros.size();
    }

    public static void main(String[] args) {
        List<Object> mixed = List.of(1, "a", 2, "b", 3);
        System.out.println(countIntegers(mixed)); // 3
    }
}