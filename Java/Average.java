import java.util.*;

public class Average {
    public static double average(List<Integer> numbers) {
        double total = 0;

        if (numbers.size() == 0) {
            return 0.0;
        }

        for (Integer numero : numbers) {
            total += numero;
        }
        return total / numbers.size();
    }

    public static void main(String[] args) {
        System.out.println(average(Arrays.asList(2,4,6))); // esperado: 4.0
    }
}

