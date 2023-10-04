import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Object[] mixedArray = {1, "Hello", 3.14, true, 'A', new int[]{1, 2, 3}};
        Map<Object, Integer> elementCountMap = new HashMap<>();

        for (Object element : mixedArray) {
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }

        Object[] uniqueElements = new Object[mixedArray.length];
        int index = 0;

        for (Map.Entry<Object, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueElements[index++] = entry.getKey();
            }
        }

        System.out.println("Các phần tử duy nhất trong mảng là:");
        for (int i = 0; i < index; i++) {
            System.out.println(uniqueElements[i] + " (Type: " + uniqueElements[i].getClass().getSimpleName() + ")");
        }
    }
}
