package SaoHai;

import java.util.Scanner;

public class ChuoiDoiXung {

    // Hàm kiểm tra chuỗi đối xứng
    public static boolean laChuoiDoiXung(String chuoi) {
        if (chuoi == null) {
            return false;
        }

        int left = 0;
        int right = chuoi.length() - 1;

        while (left < right) {
            if (chuoi.charAt(left) != chuoi.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        String input1 = scanner.nextLine();
        System.out.println("Output: " + laChuoiDoiXung(input1));
    }
}
