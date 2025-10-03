import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        
        List<Integer> uniqueItems = new ArrayList<>();

        for (Integer numero : numbers) {
            if (!uniqueItems.contains(numero)) {
                uniqueItems.add(numero);
            } 
        }
        return uniqueItems; 
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,2,3,1,4);
        System.out.println(removeDuplicates(a)); // esperado: [1,2,3,4]
    }
}

// Solución eficiente y escalable con HashShet

// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// public class RemoveDuplicates {

//     /**
//      * Elimina los elementos duplicados de una lista, manteniendo el orden original.
//      * Utiliza un HashSet para una verificación de elementos eficiente.
//      *
//      * @param numbers La lista de enteros que puede contener duplicados.
//      * @return Una nueva lista con solo los elementos únicos en su orden original.
//      */
//     public static List<Integer> removeDuplicates(List<Integer> numbers) {
//         // 1. Un HashSet para almacenar los elementos que ya hemos visto.
//         // Las operaciones de "añadir" y "contiene" en un HashSet son muy rápidas.
//         Set<Integer> seenItems = new HashSet<>();

//         // 2. Una ArrayList para guardar el resultado final sin duplicados.
//         List<Integer> uniqueItems = new ArrayList<>();

//         // 3. Recorremos la lista original de principio a fin.
//         for (Integer number : numbers) {
//             // 4. Intentamos añadir el número al HashSet. El método .add() 
//             // devuelve 'true' si el elemento se agregó (era nuevo) y 'false' si ya existía.
//             if (seenItems.add(number)) {
//                 // 5. Si es un elemento nuevo, lo añadimos también a nuestra lista de resultados.
//                 uniqueItems.add(number);
//             }
//         }
//         return uniqueItems;
//     }
// }
