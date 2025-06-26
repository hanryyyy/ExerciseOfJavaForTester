package SaoMot;

import java.util.Scanner;

public class InChuCaiDau {
    public static String inChuCaiDau(String chuoi){
            if (chuoi == null || chuoi.trim().isEmpty()) {
                return "";
            }

            String[] tu = chuoi.trim().split("\\s+");
            StringBuilder ketQua = new StringBuilder();

            for(String word: tu){
                if(!word.isEmpty()){
                    ketQua.append(word.charAt(0)).append(" ");
                }
            }
            return ketQua.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập chuỗi: ");
        String chuoi = scanner.nextLine();
        System.out.println("Output: " + inChuCaiDau(chuoi));
    }
}
