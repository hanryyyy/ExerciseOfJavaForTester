package SaoMot;

import java.util.Scanner;

public class DemSoTu {
    public static int demSoTu(String chuoi) {
        if (chuoi == null || chuoi.trim().isEmpty()) {
            return 0;
        }

        String[] tu = chuoi.trim().split("\\s+");
        return tu.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập chuỗi: ");
        String input = scanner.nextLine();
        System.out.println("Đếm từ: " + demSoTu(input));

    }
}
