import java.util.HashMap;
import java.util.Map;

public class RomansToInts {

    public int romanToInt(String s) {

        Map<Character, Integer> romans = new HashMap<>();

        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        int sumRomans = 0;
        int previousValue = 0;

        for (int index = s.length() - 1; index >= 0; index --) {

            char currentChar = s.charAt(index);
            int currentValue = romans.get(currentChar);

            if (currentValue < previousValue) {
                sumRomans -= currentValue;
            }
            else {
                sumRomans += currentValue;
            }
            previousValue = currentValue;
        }
        return sumRomans;
    }
    

public static void main(String[] args) {
        // Crear una instancia de la clase del conversor, usando el nombre que especificaste
        RomansToInts converter = new RomansToInts(); 
        
        System.out.println("--- Pruebas del Conversor de Romanos a Enteros ---");
        
        // ** Prueba 1: Ejemplo "III" **
        String input1 = "III";
        int expected1 = 3;
        int actual1 = converter.romanToInt(input1);
        System.out.println("Entrada: " + input1 + ", Resultado: " + actual1 + " (Esperado: " + expected1 + ")");

        // ** Prueba 2: Ejemplo "LVIII" **
        String input2 = "LVIII";
        int expected2 = 58;
        int actual2 = converter.romanToInt(input2);
        System.out.println("Entrada: " + input2 + ", Resultado: " + actual2 + " (Esperado: " + expected2 + ")");

        // ** Prueba 3: Ejemplo "MCMXCIV" **
        String input3 = "MCMXCIV";
        int expected3 = 1994;
        int actual3 = converter.romanToInt(input3);
        System.out.println("Entrada: " + input3 + ", Resultado: " + actual3 + " (Esperado: " + expected3 + ")");
        
        // ** Prueba 4: Caso de Sustracción "IX" **
        String input4 = "IX";
        int expected4 = 9;
        int actual4 = converter.romanToInt(input4);
        System.out.println("Entrada: " + input4 + ", Resultado: " + actual4 + " (Esperado: " + expected4 + ")");
        
        // ** Prueba 5: Valor Máximo "MMMCMXCIX" **
        String input5 = "MMMCMXCIX";
        int expected5 = 3999;
        int actual5 = converter.romanToInt(input5);
        System.out.println("Entrada: " + input5 + ", Resultado: " + actual5 + " (Esperado: " + expected5 + ")");
    }
}