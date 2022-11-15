// 219. Contains Duplicate II

package HW_Java_5;

import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));

        int[] nums1 = { 1, 0, 1, 1 };
        k = 1;
        System.out.println(containsNearbyDuplicate(nums1, k));

        int[] nums2 = { 1, 2, 3, 1, 2, 3 };
        k = 2;
        System.out.println(containsNearbyDuplicate(nums2, k));

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
