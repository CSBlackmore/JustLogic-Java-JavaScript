package exercises;

import java.util.*;

public class FilterLongStrings {
    public static List<String> filterLong(List<String> words) {

        List<String> masDeTRes = new ArrayList<>();

        for (String elemento : words) {
            if (elemento.length() > 3) {
                masDeTRes.add(elemento);
            }
        }
        return masDeTRes;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hi", "hola", "world", "yo");
        System.out.println(filterLong(words)); // [hola, world]
    }
}
