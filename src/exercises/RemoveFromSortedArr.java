package exercises;

public class RemoveFromSortedArr {

    public int removeDuplicates(int[] nums) {

        // logic

        return 0; // temporary
    }

    public static void main(String[] args) {

        RemoveFromSortedArr solver = new RemoveFromSortedArr();

        // Case 1
        int[] nums1 = {1, 1, 2};
        int k1 = solver.removeDuplicates(nums1);
        System.out.println("k: " + k1 + " | expected: 2");

        // Case 2
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int k2 = solver.removeDuplicates(nums2);
        System.out.println("k: " + k2 + " | expected: 5");

        // Case 3 (edge case)
        int[] nums3 = {1,1,1,1};
        int k3 = solver.removeDuplicates(nums3);
        System.out.println("k: " + k3 + " | expected: 1");
    }
}