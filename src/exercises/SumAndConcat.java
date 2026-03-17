package exercises;
import java.util.*;

public class SumAndConcat {
    public static void process(List<Object> items) {
        
        int suma = 0;
        StringBuilder concatenado = new StringBuilder();

        for (Object elemento : items) {
            if (elemento instanceof Integer) {
                suma += (Integer)elemento;
            }
            else if (elemento instanceof String) {
                concatenado.append((String)elemento).append(" ");
            }
        }
        System.out.println("suma = " + suma + " concatenado = \"" + concatenado + "\"");
    }

    public static void main(String[] args) {
        List<Object> mixed = List.of(1, "hola", 2, "mundo", 3);
        process(mixed);
        // esperado: suma=6, concatenado="holamundo"
    }
}

