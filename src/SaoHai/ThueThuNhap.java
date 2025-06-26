package SaoHai;

import java.util.Scanner;

public class ThueThuNhap {

    public static double tinhThue(double thuNhap) {
        double thue = 0;

        if (thuNhap <= 5000000) {
            thue = thuNhap * 0.05;
        } else if (thuNhap <= 10000000) {
            thue = 5000000 * 0.05 + (thuNhap - 5000000) * 0.10;
        } else if (thuNhap <= 18000000) {
            thue = 5000000 * 0.05 + 5000000 * 0.10 + (thuNhap - 10000000) * 0.15;
        } else if (thuNhap <= 32000000) {
            thue = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + (thuNhap - 18000000) * 0.20;
        } else if (thuNhap <= 52000000) {
            thue = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + 14000000 * 0.20 + (thuNhap - 32000000) * 0.25;
        } else if (thuNhap <= 80000000) {
            thue = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + 14000000 * 0.20 + 20000000 * 0.25 + (thuNhap - 52000000) * 0.30;
        } else {
            thue = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + 14000000 * 0.20 + 20000000 * 0.25 + 28000000 * 0.30 + (thuNhap - 80000000) * 0.35;
        }

        return thue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thu nhập hàng năm (VNĐ): ");
        double thuNhap = scanner.nextDouble();

        double thuePhaiTra = tinhThue(thuNhap);

        System.out.printf("Số thuế phải trả: %.0f VNĐ\n", thuePhaiTra);
    }
}
