package SaoBa;

import java.util.Scanner;

public class LongestPalindromicSubstring {

    // Hàm trả về chuỗi con đối xứng dài nhất
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);       // Trường hợp độ dài lẻ
            int len2 = expandFromCenter(s, i, i + 1);    // Trường hợp độ dài chẵn
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // Hàm hỗ trợ mở rộng từ tâm
    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    // Chạy chương trình chính
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String result = longestPalindrome(input);
        System.out.println("Chuỗi con đối xứng dài nhất: " + result);
    }
}
