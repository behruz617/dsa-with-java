package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int target = 7;
        int[] result1 = twoSumBruteForce(nums, target);
        int[] result2 = twoSumHashMap(nums, target);
        System.out.println("Cavab : " + result1[0] + result1[1]);
        System.out.println("Cavab : " + result2[0] + result2[1]);
    }

    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

}
