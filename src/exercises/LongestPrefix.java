package exercises;

public class LongestPrefix {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder prefijo = new StringBuilder(strs[0]);
        for (String palabra : strs) {
            while (!palabra.startsWith(String.valueOf(prefijo))) {
                prefijo = new StringBuilder(prefijo.substring(0, prefijo.length() - 1));
            }
        }
        return String.valueOf(prefijo);
    }

    public static void main(String[] args) {

        LongestPrefix solution = new LongestPrefix();

        String[] test1 = {"flower", "flow", "flight"};
        System.out.println("Test 1 result: " + solution.longestCommonPrefix(test1));
        System.out.println("Expected: fl");

        String[] test2 = {"dog", "racecar", "car"};
        System.out.println("Test 2 result: " + solution.longestCommonPrefix(test2));
        System.out.println("Expected: ");

        String[] test3 = {"interview", "internet", "internal", "interval"};
        System.out.println("Test 3 result: " + solution.longestCommonPrefix(test3));
        System.out.println("Expected: inter");
    }
}