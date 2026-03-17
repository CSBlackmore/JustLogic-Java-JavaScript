package exercises;

public class Factorial {
    public static long factorial(int n) {

        long resultado = 1;

        if (n < 0) {
            throw new IllegalArgumentException("Los negativos no tienen factorial");
        }

        if (n == 0)
            return 1;

        for (int i = 2; i <= n; i++){
            resultado = resultado*i;
        }
        return resultado;
    
    }
    public static void main(String[] args) {
        System.out.println(factorial(5)); // esperado: 120
        System.out.println(factorial(0)); // esperado: 1
        System.out.println(factorial(7)); // esperado: 5040
    }
}

/*
 MULTIPLICAR n * n - 1
 GUARDAR en resultado. 
 MULPIPLICAR resultado * n - 1
 MIENTRAS que n > 0
 RETORNAR resultado
 */

