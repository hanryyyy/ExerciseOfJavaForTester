package SaoMot;

public class SoLonThuHai {
    public static int giaTriLonThuTrongMang(int[] arr){
        if(arr == null || arr.length < 2){
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max){
                secondMax = max;
                max = num;
            }else if (num > secondMax && num != max){
                secondMax = num;
            }
        }

        return (secondMax == Integer.MIN_VALUE) ? Integer.MIN_VALUE : secondMax;

    }
    public static void main(String[] args) {
        int[] mang = {1, 3, 4, 5, 0, 2};
        int ketQua = giaTriLonThuTrongMang(mang);

        if (ketQua == Integer.MIN_VALUE) {
            System.out.println("Không tìm được giá trị lớn thứ hai.");
        } else {
            System.out.println("Giá trị lớn thứ hai là: " + ketQua);
        }
    }
}
