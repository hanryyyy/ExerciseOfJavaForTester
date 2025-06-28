package SaoBa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        // Tạo map lưu ký tự cần có từ chuỗi t
        Map<Character, Integer> mapT = new HashMap<>();
        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        int required = mapT.size(); // Số ký tự khác nhau cần có
        int formed = 0;

        Map<Character, Integer> windowCounts = new HashMap<>();
        int left = 0, right = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            if (mapT.containsKey(c) && windowCounts.get(c).intValue() == mapT.get(c).intValue()) {
                formed++;
            }

            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);

                if (mapT.containsKey(leftChar) && windowCounts.get(leftChar).intValue() < mapT.get(leftChar).intValue()) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi s: ");
        String s = scanner.nextLine();

        System.out.print("Nhập chuỗi t: ");
        String t = scanner.nextLine();

        String result = minWindow(s, t);
        System.out.println("Chuỗi con nhỏ nhất chứa tất cả ký tự trong t: " + result);
    }
}
