import java.util.*;
public class WordsStartingWithVowel {
    public static List<String> filterWords(List<String> words) {
        List<String> empiezaConVocal = new ArrayList<>();
        for (String palabra : words) {
            if (palabra.matches("^(?i)[aeiou].*")) {
                empiezaConVocal.add(palabra);
            }
        }
        return empiezaConVocal;
    }

    public static void main(String[] args) {
        List<String> words = List.of("apple", "dog", "orange", "cat");
        System.out.println(filterWords(words)); // [apple, orange]
    }
}

/*
Para palabras que empiezan con vocal : ^(?i)[aeiou].*
Para palabras que terminan con vocal: .*[aeiou]$
Para palabras que contienen una vocal en cualquier parte: .*[aeiou].*
Para palabras que empiezan con consonante: ^(?i)[^aeiou].*
 */