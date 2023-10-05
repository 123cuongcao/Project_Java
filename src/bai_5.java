import java.util.*;
import java.util.function.Consumer;

public class bai_5 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 5);
        hashMap.put("banana", 2);
        hashMap.put("orange", 8);
        hashMap.put("grape", 3);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        Collections.sort(entryList, Map.Entry.comparingByValue());

        System.out.println("Các phần tử trong HashMap được sắp xếp theo giá trị tăng dần:");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
