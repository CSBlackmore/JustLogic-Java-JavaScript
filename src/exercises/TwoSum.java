package exercises;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        for (int indice = 0; indice < nums.length; indice++) {
            for (int jindice = indice + 1; jindice < nums.length; jindice++) {
                if (nums[indice] + nums[jindice] == target) {
                    return new int[] {indice, jindice};
                }
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        // Inicializa la clase
        TwoSum solver = new TwoSum();

        // --- Caso de Prueba 1 ---
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solver.twoSum(nums1, target1);

        System.out.println("Caso 1: nums = {2, 7, 11, 15}, target = 9");
        System.out.println("Índices: [" + result1[0] + ", " + result1[1] + "] (Esperado: [0, 1])");
        System.out.println("Comprobación: " + nums1[result1[0]] + " + " + nums1[result1[1]] + " = " + target1);

        System.out.println("-------------------------");

        // --- Caso de Prueba 2 ---
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solver.twoSum(nums2, target2);

        System.out.println("Caso 2: nums = {3, 2, 4}, target = 6");
        System.out.println("Índices: [" + result2[0] + ", " + result2[1] + "] (Esperado: [1, 2])");
        System.out.println("Comprobación: " + nums2[result2[0]] + " + " + nums2[result2[1]] + " = " + target2);

        System.out.println("-------------------------");

        // --- Caso de Prueba 3 ---
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solver.twoSum(nums3, target3);

        System.out.println("Caso 3: nums = {3, 3}, target = 6");
        System.out.println("Índices: [" + result3[0] + ", " + result3[1] + "] (Esperado: [0, 1])");
        System.out.println("Comprobación: " + nums3[result3[0]] + " + " + nums3[result3[1]] + " = " + target3);
    }
}