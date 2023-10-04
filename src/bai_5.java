import java.util.*;
import java.util.function.Consumer;

public class bai_5 {
    public static void main(String[] args) {
        // Bước 1: Khai báo một HashMap và thêm các phần tử
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 5);
        hashMap.put("banana", 2);
        hashMap.put("orange", 8);
        hashMap.put("grape", 3);

        // Bước 2: Tạo một danh sách các cặp key-value từ HashMap
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        // Bước 3: Sắp xếp danh sách các phần tử theo giá trị tăng dần
        Collections.sort(entryList, Map.Entry.comparingByValue());

        // Bước 4: Duyệt qua danh sách đã sắp xếp và in ra
        System.out.println("Các phần tử trong HashMap được sắp xếp theo giá trị tăng dần:");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
