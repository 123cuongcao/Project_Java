package TrenLop;

public class TimPhanTuLonThuHai {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 8, 1, 4, 6};

        if (arr.length < 2) {
            System.out.println("Mảng không có phần tử đủ để tìm phần tử lớn thứ hai.");
        } else {
            int max1 = arr[0]; // Lưu phần tử lớn nhất
            int max2 = arr[0]; // Lưu phần tử lớn thứ hai

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max1) {
                    max2 = max1; // Gán phần tử lớn thứ hai bằng phần tử lớn nhất hiện tại
                    max1 = arr[i]; // Cập nhật phần tử lớn nhất
                } else if (arr[i] > max2 && arr[i] != max1) {
                    max2 = arr[i]; // Cập nhật phần tử lớn thứ hai
                }
            }

            System.out.println("Phần tử lớn thứ hai trong mảng là: " + max2);
        }
    }
}

