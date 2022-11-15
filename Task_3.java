// 350. Intersection of Two Arrays II

package HW_Java_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_3 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

        int[] nums3 = { 4, 9, 5 };
        int[] nums4 = { 9, 4, 9, 8, 4 };
        System.out.println(Arrays.toString(intersect(nums3, nums4)));

        int[] nums5 = { 1, 2, 5, 5 };
        int[] nums6 = { 2, 3, 5, 1, 4 };
        System.out.println(Arrays.toString(intersect(nums5, nums6)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer item : nums1) {
            map.putIfAbsent(item, 0);
            map.put(item, map.get(item) + 1);
        }
        List<Integer> intersection = new ArrayList<>();
        for (Integer item : nums2) {
            if (map.containsKey(item)) {
                if (map.get(item) > 0) {
                    intersection.add(item);
                }
                map.put(item, map.get(item) - 1);
            }
        }

        int[] resultArray = new int[intersection.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = intersection.get(i);
        }
        return resultArray;
    }
}
