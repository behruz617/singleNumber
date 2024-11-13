public class main {
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        System.out.println(singleNumbers(nums1)); // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(singleNumbers(nums2)); // Output: 4

        int[] nums3 = {1};
        System.out.println(singleNumbers(nums3)); // Output: 1
    }

    public static int singleNumbers(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
