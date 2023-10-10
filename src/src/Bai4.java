package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println("Hãy nhập chưỡi muốn kiểm tra");
        String test = sc.nextLine();
        String[] want = test.split("");

            for (String c:want) {
                try{
                    arr1.add(Integer.parseInt(c));
                }catch(NumberFormatException e){
                    arr1.add(0);
                }
            }
        arr1.forEach(System.out::println);

    }
}
