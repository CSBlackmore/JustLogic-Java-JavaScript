package exercises;

import java.util.*;

public class FinalChallenge {
    public static void process(List<Object> items) {
        List<Object> enterosPares = new ArrayList<>();
        List<Object> masDeTresLetras = new ArrayList<>();

        for (Object elemento : items) {
            if (elemento instanceof Integer && (Integer)elemento % 2 == 0) {
                enterosPares.add(elemento);
            }
            else if (elemento instanceof String && ((String)elemento).length() > 3) {
                masDeTresLetras.add(elemento);
            }
        }
        System.out.println("enteros pares = " + enterosPares + ", " + "palabras largas = " + masDeTresLetras);
    }

    public static void main(String[] args) {
        List<Object> mixed = List.of(1, "hi", 2, "hola", 3, "world", 4);
        process(mixed);
        // esperado: enteros pares=[2,4], palabras largas=[hola, world]
    }
}

