package TrenLop;

import java.util.Arrays;
import java.util.Scanner;

public class MenuThemPhanTu {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        int option ;

        do {
            System.out.println("***************MENU****************");
            System.out.println("1.Thêm phần tử đầu mảng");
            System.out.println("2.Thêm phần tử cuối mảng");
            System.out.println("3.Thêm phần vị trí bất kỳ mảng");
            option = Integer.parseInt(sc.nextLine());

            switch (option){
                case 1:
                    System.out.println("nhập giá trị bạn muốn thêm");
                    int number = Integer.parseInt(sc.nextLine());
                    int[] newArr1 = new int[arr.length+1];
                    for(int i=0; i<newArr1.length; i++){
                        if(i==0) newArr1[i] = number;
                        else newArr1[i] = arr[i-1];
                    }
                    System.out.println(Arrays.toString(newArr1));
                    break;
                case 2 :
                    System.out.println("nhập giá trị bạn muốn thêm");
                    int number2 = Integer.parseInt(sc.nextLine());
                    int[] newArr2 = new int[arr.length+1];
                    for(int i=0; i<newArr2.length; i++){
                        if(i == newArr2.length-1) newArr2[i] = number2;
                        else newArr2[i] = arr[i];
                    }
                    System.out.println(Arrays.toString(newArr2));

                    break;
                case 3:
                    System.out.println("Nhập giá trị bạn muốn thêm:");
                    int number3 = Integer.parseInt(sc.nextLine());

                    System.out.println("Nhập vị trí bạn muốn thêm phần tử:");
                    int index = Integer.parseInt(sc.nextLine());

                    int[] newArr3 = new int[arr.length + 1];

                    for (int i = 0; i < index; i++) {
                        newArr3[i] = arr[i];
                    }

                    newArr3[index] = number3;

                    for (int i = index + 1; i < newArr3.length; i++) {
                        newArr3[i] = arr[i - 1];
                    }

                    System.out.println("Mảng sau khi thêm phần tử là: " + Arrays.toString(newArr3));

                    break;
            }

        }while(option!=4);
    }
}
