// 13. Roman to Integer

package HW_Java_5;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    private static Map<Character, Integer> map = new HashMap<>();
    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));

        s = "LVIII";
        System.out.println(romanToInt(s));

        s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int result = 0;
        int prev = map.get(s.charAt(0));
        for (Character item : s.toCharArray()) {
            if (map.get(item) > prev) {
                result += (map.get(item) - prev * 2);
            } else {
                result += map.get(item);
            }
            prev = map.get(item);
        }
        return result;
    }
}
