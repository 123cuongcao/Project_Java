package BaiTap;

import java.util.Scanner;
import java.util.Arrays;


    public class JavaConsole2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời nhập số phân tử : ");
            int n = scanner.nextInt();
            int[] arrInt = new int[n];
            int choice = 0;

            do {
                System.out.println("************MENU**********");
                System.out.println("1. Nhập giá trị phần tử của mảng và hiển thị các gia trị:");
                System.out.println("2. In các phần tử giá trị chẵn trong mảng và tính tổng");
                System.out.println("3. In các phần tử có giá trị là số nguyên tố và tính tổng");
                System.out.println("4. In ra phần tử có giá trị lớn nhất và nhỏ nhất trong mảng");
                System.out.println("5. Sắp xếp mảng giảm dần");
                System.out.println("6. Nhập vào giá trị số nguyên (m) và thống kê trong mảng có bao\n" +
                        "nhiêu phần tử có giá trị là m");
                System.out.println("7. Thoát");
                System.out.println("Mời nhập các chức năng từ 1-8 : ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        for (int i = 0; i < arrInt.length; i++) {
                            System.out.println("Mời nhập giá trị của phần tử của mảng thứ : " + (i + 1));
                            arrInt[i] = scanner.nextInt();
                        }
                        System.out.println("Giá trị của mảng là " + Arrays.toString(arrInt));
                        break;
                    case 2:
                        int sum = 0;
                        for (int i = 0; i < arrInt.length; i++) {
                            if (arrInt[i] % 2 == 0) {
                                System.out.println("Các phần tử giá trị chẵn trong mảng là : " + arrInt[i]);
                                sum += arrInt[i];
                            }

                        }
                        System.out.println("Tổng các số trong chẵn mamg là " + sum);
                        break;
                    case 3:
                        boolean isPrime;
                        int sum2 = 0;
                        for (int i = 0; i < arrInt.length; i++) {
                            isPrime = true;
                            if (arrInt[i] <= 1) {
                                isPrime = false;
                            } else {
                                for (int j = 2; j <= Math.sqrt(arrInt[i]); j++) {
                                    if (arrInt[i] % j == 0) {
                                        isPrime = false;
                                        break;
                                    }
                                }
                            }
                            if (isPrime) {
                                System.out.println("Phần tử các số nguyên tố là :" + arrInt[i]);
                                sum2 += arrInt[i];
                            }
                        }
                        System.out.println("Tổng các số nguyên tố là: " + sum2);
                        break;
                    case 4 :
                        int max = arrInt[0];
                        int min = arrInt [0];
                        for (int i = 1; i < arrInt.length ; i++) {
                            if (arrInt[i] > max) {
                                max =arrInt[i];
                            }
                            if (arrInt[i] < min) {
                                min = arrInt[i];
                            }
                        }
                        System.out.println(" Phần tử lớn nhất " + max);
                        System.out.println(" Phần tử nhỏ nhất " + min);
                        break;
                    case 5:
                        Arrays.sort(arrInt);
                        int[] reverseArr = new int[arrInt.length];
                        for (int i = 0; i < arrInt.length; i++) {
                            reverseArr[i] = arrInt[arrInt.length - 1 - i];
                        }
                        System.out.println("Sắp xếp mảng giảm dần" + Arrays.toString(arrInt));
                        break;
                    case 6:
                        System.out.println("Nhập vào giá trị số nguyên m: ");
                        int m = scanner.nextInt();
                        int count = 0;
                        for (int i = 0; i < arrInt.length; i++) {
                            if (arrInt[i] == m) {
                                count++;
                            }
                        }
                        System.out.println("Trong mảng có " + count + " phần tử có giá trị là " + m);
                        break;


                    default:
                }

            } while (choice != 7);
        }
    }

