package src;
import java.util.HashSet;
import java.util.Set;

/**
 * поиск двух чисел в массиве составляющих сумму k
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,4,-3, 0, 1, 3, 4};
        int k = 5;
        final int[] ints = twoSum(nums, k);
        for (int i : ints
        ) {
            System.out.println(i);
        }
    }

    private static int[] twoSum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int numberToFind = k - nums[i];
            if (set.contains(numberToFind))
                return new int[]{numberToFind, nums[i]};

            set.add(nums[i]);
        }
        return new int[0];
    }
}
