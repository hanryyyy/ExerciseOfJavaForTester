package SaoBa;

import java.util.Scanner;

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // Trả về chỉ số bắt đầu từ 1
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{}; // Không tìm thấy
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài mảng
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Nhập từng phần tử của mảng
        System.out.println("Nhập các phần tử của mảng đã sắp xếp tăng dần:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Nhập giá trị target
        System.out.print("Nhập giá trị target: ");
        int target = scanner.nextInt();

        // Gọi hàm và hiển thị kết quả
        int[] result = twoSum(numbers, target);

        if (result.length == 2) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Không tìm thấy cặp số nào có tổng bằng " + target);
        }
    }
}
