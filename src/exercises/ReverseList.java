package exercises;
import java.util.*;

public class ReverseList {
    public static List<Integer> reverseList(List<Integer> list) {

        StringBuilder listaInversa = new StringBuilder();
        
        for (Integer numero : list) {
            listaInversa.append(numero);
        }
        listaInversa.reverse();
        String lista = listaInversa.toString();
        String elementos [] = lista.split(",");

        List<Integer> enterosInvertidos = new ArrayList<>();
        for (String elemento : elementos) {
            enterosInvertidos.add(Integer.parseInt(elemento));
        }

        return enterosInvertidos; // placeholderSS
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,5);
        System.out.println(reverseList(a)); // esperado: [5,4,3,2,1]
    }
}

