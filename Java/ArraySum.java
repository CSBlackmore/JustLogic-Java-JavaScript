public class ArraySum {
    public static int sumArray(int[] numbers) {
        int sumaTotal = 0;
        for (int numero : numbers) {
            sumaTotal += numero;
        }
        return sumaTotal;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(sumArray(nums)); // esperado: 15
    }
}

