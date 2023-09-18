package TrenLop;

public class TimPhanTuLonThuHai {
    public static void main(String[] args) {
        int[] arr = {-10, 2, 9, 9, 8, -1, 6};

        if (arr.length < 2) {
            System.out.println("Mảng không có phần tử đủ để tìm phần tử lớn thứ hai.");
        } else {
            int max1 = arr[0];
            int max2 = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max1) {
                    max2 = max1;
                    max1 = arr[i];
                } else if (arr[i] > max2 && arr[i] != max1) {
                    max2 = arr[i];
                }
            }

            System.out.println("Phần tử lớn thứ hai trong mảng là: " + max2);
        }
    }
}

