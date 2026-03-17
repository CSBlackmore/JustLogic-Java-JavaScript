package exercises;

import java.util.*;

public class FilterEvens {
    public static List<Integer> filterEvens(List<Integer> numbers) {
        List<Integer> evensOnly = new ArrayList<>();
        for (Integer element : numbers) {
            if (element % 2 == 0) {
                evensOnly.add(element);
            }
        }
        return evensOnly;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(filterEvens(nums)); // [2, 4, 6]
    }
}
