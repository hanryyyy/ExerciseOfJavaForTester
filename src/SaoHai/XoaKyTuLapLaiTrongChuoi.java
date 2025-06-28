package SaoHai;

import java.util.Scanner;

public class XoaKyTuLapLaiTrongChuoi {

    public static String xoaKyTuLapLai(String chuoi) {
        StringBuilder ketQua = new StringBuilder();
        boolean[] daXuatHien = new boolean[256]; // Mảng đánh dấu ký tự đã xuất hiện (ASCII)

        for (int i = 0; i < chuoi.length(); i++) {
            char c = chuoi.charAt(i);
            if (!daXuatHien[c]) {
                ketQua.append(c);       // Thêm ký tự vào kết quả
                daXuatHien[c] = true;   // Đánh dấu ký tự đã gặp
            }
        }

        return ketQua.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        String input1 = scanner.nextLine();
        System.out.println("Output: " + xoaKyTuLapLai(input1));
    }
}
