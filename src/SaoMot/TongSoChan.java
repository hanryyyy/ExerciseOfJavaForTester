package SaoMot;

import java.util.Scanner;

public class TongSoChan {
    public static int tinhTongChan(int n){
        int sum = 0;
        for (int i = 0; i <= n; i += 2){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = scanner.nextInt();
        System.out.println("Output: " + tinhTongChan(n));
    }
}