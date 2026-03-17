package exercises;

import java.util.*;

public class LongestString {

    public static String findLongest(List<String> words) {
        String longest = words.get(0);

        for (String element : words) {
            if (element.length() > longest.length()) {
                longest = element;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        // Pruebas con código duro
        List<String> list1 = Arrays.asList("dog", "cat", "elephant", "ant");
        List<String> list2 = Arrays.asList("red", "blue", "green");

        System.out.println(findLongest(list1)); // Esperado: "elephant"
        System.out.println(findLongest(list2)); // Esperado: "green"
    }
}
