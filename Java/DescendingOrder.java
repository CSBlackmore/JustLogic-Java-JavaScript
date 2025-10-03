import java.util.*;

public class DescendingOrder {
    public static int sortDesc(final int num) {

        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        // Invertir el arreglo para obtener orden descendente
        StringBuilder sb = new StringBuilder(new String(digits));
        sb.reverse();
        return Integer.parseInt(sb.toString());

    }

    public static void main(String[] args) {
        // Pruebas con código duro
        System.out.println(sortDesc(42145));      // Esperado: 54421
        System.out.println(sortDesc(145263));     // Esperado: 654321
        System.out.println(sortDesc(123456789));  // Esperado: 987654321
    }
}

/* 
public class Square {    
    public static boolean isSquare(int n) {
    
        double raizCuadrada = Math.sqrt(n);
      
      if (n < 0) {
        return false;
      }
      else if (Math.pow(raizCuadrada, 2) == n && raizCuadrada % 1 == 0) {
        return true;
      }
      else {
        return false;
      } 
    }
}
        
public class Square {    
    public static boolean isSquare(int n) {
      
      double raizCuadrada = Math.sqrt(n);
      
      if (n < 0 || raizCuadrada % 1 != 0) {
        return false;
      } else {
        return true;
      }
      
    }
}
public class Square {
    public static boolean isSquare(int n) {
        if (n < 0) return false;

        int raiz = (int) Math.sqrt(n); 
        return raiz * raiz == n;
    }
}    
*/