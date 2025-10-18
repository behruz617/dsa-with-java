package arrays;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 1, 3, 4, 5};
        System.out.println(hasDuplicate(nums1));
        System.out.println(hasDuplicate(nums2));
    }

    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }


}
