package BaiTap;

import java.util.Scanner;

public class MenuChucNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập váo 1 số ");
        int number = Integer.parseInt(sc.nextLine());
        int select = 0;

        do {
            System.out.println("****************MENU******************");
            System.out.println("1. Kiểm tra số chẵn/lẻ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra số hoàn hảo");
            System.out.println("4. In ra các số chia hết cho 3 và 5 trong khoảng 1-number");
            System.out.println("5. Tính tổng các ước số của number");
            System.out.println("6. Tính tổng các số nguyên tố trong khoảng 1 đến number");
            System.out.println("7. Nhập 2 số nguyên (number1, number2), kiểm tra number có trong " +
                    "khoảng (number1,number2)");
            System.out.println("8. Thoát");
            System.out.println("Hãy chọn 1 lựa chọn ");
            select = Integer.parseInt(sc.nextLine());
            switch (select){
                case 1:
                    if(number % 2 == 0) System.out.println(number+" là số chẵn");
                    else System.out.println(number+" là số lẻ");
                    break;
                case 2:
                    boolean isPrime = true;
                    if(number < 2){
                        System.out.println(number+" không phải là số nguyên tố");
                        break;
                    }

                    for(int i=2; i<=Math.sqrt(number); i++){
                        if(number%i==0){
                            isPrime= false;
                            break;
                        }
                    }

                    if(isPrime) System.out.println(number+" là số nguyên tố");
                    break;


                case 3:
                    int sum = 0;
                    for(int i=1; i<number; i++){
                        if(number%i==0) sum+=i;
                    }
                    if(sum%number==0) System.out.println(number+"là số hoàn hảo");
                    else System.out.println(number+" không phải là số hoàn hảo");
                    break;


                case 4:
                    for(int i=1; i<=number; i++){
                        if(i%3==0 && i%5==0) System.out.println("là những số chia hết cho 3 và 5");
                    }
                    break;

                case 5:
                    int sum1 = 0;
                    for(int i=1; i<number/2; i++){
                        if(number%i==0) sum1+=i;
                    }
                    System.out.println("tổng các ước là "+sum1);
                    break;

                case 6:
                    int sumSoNguyenTo = 0;
                    for(int i=2; i<=number; i++){
                        boolean isPrime1 =true;
                      for(int j=2; j<=Math.sqrt(i); j++){
                          if(i%j==0) {
                              isPrime1 = false;
                              break;
                          }
                          }
                        if(isPrime1){
                            sumSoNguyenTo += i;
                      }
                    }
                    System.out.printf("tống các số nguyên tố trong khoảng từ 1 đến %d bằng %d \n",number,sumSoNguyenTo);
                    break;

                case 7:
                    System.out.println("nhập vào số bắt đầu ");
                    int start = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập vào số kết thúc");
                    int end = Integer.parseInt(sc.nextLine());
                    if((number-start)>0 && (end-number)>0) System.out.printf("number nằm trong khoảng từ %d đến %d",start,end);
                    else System.out.printf("nằm ngoài koảng từ %d đến %d",start,end);
                    break;

                case 8:

            }
        }while(select!=8);
    }
}
