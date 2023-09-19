package TrenLop.stopwatch;
import java.util.Random;


public class SelectionSortExample {
    public static void main(String[] args) {

            int[] arr = new int[100000];
            Random random = new Random();

            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(1000000); // Tạo mảng ngẫu nhiên với giá trị từ 0 đến 999,999
            }

            StopWatch stopwatch = new StopWatch();
            selectionSort(arr);
            stopwatch.stop();

            System.out.println("Thời gian thực thi thuật toán sắp xếp chọn: " + stopwatch.getElapsedTime() + " miliseconds");
        }

        public static void selectionSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }



