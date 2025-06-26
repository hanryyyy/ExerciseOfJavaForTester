package SaoMot;

import java.util.Scanner;

public class XoaNguyenAm {
    // Kiểm tra xem ký tự có phải là nguyên âm không
    public static boolean isNguyenAm(char kyTu){
        kyTu = Character.toLowerCase(kyTu);
        return kyTu == 'a' || kyTu == 'e' || kyTu == 'i' || kyTu == 'o' || kyTu == 'u';
    }

    // Loại bỏ các nguyên âm khỏi chuỗi đầu vào
    public static String chuoiKhongCoNguyenAm(String input){
        String output = "";
        for(int i = 0; i < input.length(); i++){
            char kyTu = input.charAt(i); // lấy từng ký tự
            System.out.println("Ký tự: " + kyTu);
            if (!isNguyenAm(kyTu)) { // ✅ chỉ thêm nếu KHÔNG phải nguyên âm
                output += kyTu;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần xử lý: ");
        String input = scanner.nextLine();

        String output = chuoiKhongCoNguyenAm(input);
        System.out.println("Chuỗi sau khi xử lý: " + output);
    }
}
