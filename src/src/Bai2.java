package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check ;
        while(true){
            System.out.println("Hãy nhập số cho mảng số nguyên ");
            check = Integer.parseInt(sc.nextLine());
            if(check == -1){
                break;
            }
            arr.add(check);
        }
        System.out.println("Giá trị lớn  nhất của mảng  "+Sln(arr));
    }

    public static int Sln(ArrayList<Integer> arr) {
        int MaxValue = arr.get(0);
        if (arr.isEmpty()) {
            throw new RuntimeException();
        } else {
            for (int a : arr) {
                if (MaxValue < a) {
                    MaxValue = a;
                }
            }
        }
        return MaxValue;
    }
}
