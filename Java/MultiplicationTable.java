package Java;

public class MultiplicationTable {
    public static void printTable(int n) {
        
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println(n + "x" + multiplicador + " = " + n * multiplicador);
        }

    }

    public static void main(String[] args) {
        printTable(5); // prueba: tabla del 5
    }
}

