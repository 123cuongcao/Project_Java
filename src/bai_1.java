import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra");
        String want = sc.nextLine();
        Map<Character,Integer> map = count(want);
        System.out.println("Chuỗi đã kiểm tra");
        for(Map.Entry<Character,Integer> entry :map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }
    public static Map<Character,Integer> count(String str){
        Map<Character,Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (char c:charArray) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }
}
