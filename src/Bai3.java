import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static void main(String[] args) {
        int[][] myArray = getArr();

        List<Integer> rowIndex = new ArrayList<>();
        List<Integer> colIndex = new ArrayList<>();

        boolean check = false;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] == 7) {
                    rowIndex.add(i);
                    colIndex.add(j);
                    check = true;
                }
            }
        }

        if (check) {
            System.out.println("Số được tìm thấy tại các vị trí:");
            for (int k = 0; k < rowIndex.size(); k++) {
                System.out.println("Dòng " + rowIndex.get(k) + ", Cột " + colIndex.get(k));
            }
        } else {
            System.out.println("Số không xuất hiện trong mảng.");
        }
    }


    private static int[][] getArr() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        return arr;
    }
}

