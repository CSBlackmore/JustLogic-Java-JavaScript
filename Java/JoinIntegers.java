package Java;

import java.util.*;

public class JoinIntegers {
    public static String joinIntegers(List<Object> items) {
        
        StringBuilder soloNumeros = new StringBuilder();

        for (Object elemento : items) {
            if (elemento instanceof Integer) {
                if (soloNumeros.length() > 0) {
                    soloNumeros.append(",");
                }
                soloNumeros.append(elemento);
            }
        }
        return "\"" + soloNumeros.toString() + "\"";
    }

    public static void main(String[] args) {
        List<Object> mixed = List.of(1, "a", 2, "b", 3);
        System.out.println(joinIntegers(mixed)); // "1,2,3"
    }
}
