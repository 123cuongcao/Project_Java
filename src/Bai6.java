import java.util.HashMap;
import java.util.Map;

public class Bai6 {
    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        Map<String, Integer> newMap = new HashMap<>(map);
        System.out.println(newMap);
     }
}
