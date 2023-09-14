//package BaiTap;
//
//import java.util.Scanner;
//
//public class JavaConsole {
//
//
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Nhập vào một số nguyên: ");
//            int number = scanner.nextInt();
//
//            int choice;
//            do {
//                System.out.println("*****************MENU******************");
//                System.out.println("1. Kiểm tra số chẵn/lẻ");
//                System.out.println("2. Kiểm tra số nguyên tố");
//                System.out.println("3. Kiểm tra số hoàn hảo");
//                System.out.println("4. In ra các số chia hết cho 3 và 5 trong khoảng 1-" + number);
//                System.out.println("5. Tính tổng các ước số của " + number);
//                System.out.println("6. Tính tổng các số nguyên tố trong khoảng 1-" + number);
//                System.out.println("7. Nhập 2 số nguyên (number1, number2) và kiểm tra " +
//                        "number có trong khoảng (number1, number2)");
//                System.out.println("8. Thoát");
//
//                System.out.print("Chọn một chức năng (1-8): ");
//                choice = scanner.nextInt();
//
//                switch (choice) {
//                    case 1:
//                        kiemTraSoChanLe(number);
//                        break;
//                    case 2:
//                        kiemTraSoNguyenTo(number);
//                        break;
//                    case 3:
//                        kiemTraSoHoanHao(number);
//                        break;
//                    case 4:
//                        inSoChiaHetCho3Va5(number);
//                        break;
//                    case 5:
//                        tinhTongUocSo(number);
//                        break;
//                    case 6:
//                        tinhTongSoNguyenTo(number);
//                        break;
//                    case 7:
//                        kiemTraKhoang(number);
//                        break;
//                    case 8:
//                        System.out.println("Ứng dụng đã thoát.");
//                        break;
//                    default:
//                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
//                        break;
//                }
//            } while (choice != 8);
//
//            scanner.close();
//        }
//
//        private static void kiemTraSoChanLe(int number) {
//            if (number % 2 == 0) {
//                System.out.println(number + " là số chẵn.");
//            } else {
//                System.out.println(number + " là số lẻ.");
//            }
//        }
//
//        private static void kiemTraSoNguyenTo(int number) {
//            if (number < 2) {
//                System.out.println(number + " không phải là số nguyên tố.");
//                return;
//            }
//
//            boolean isPrime = true;
//            for (int i = 2; i <= Math.sqrt(number); i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                System.out.println(number + " là số nguyên tố.");
//            } else {
//                System.out.println(number + " không phải là số nguyên tố.");
//            }
//        }
//
//        // Hàm kiểm tra số hoàn hảo
//        private static void kiemTraSoHoanHao(int number) {
//            int sum = 0;
//            for (int i = 1; i < number; i++) {
//                if (number % i == 0) {
//                    sum += i;
//                }
//            }
//
//            if (sum == number) {
//                System.out.println(number + " là số hoàn hảo.");
//            } else {
//                System.out.println(number + " không phải là số hoàn hảo.");
//            }
//        }
//
//        // Hàm in ra các số chia hết cho 3 và 5 trong khoảng 1-number
//        private static void inSoChiaHetCho3Va5(int number) {
//            System.out.print("Các số chia hết cho 3 và 5 trong khoảng 1-" + number + ": ");
//            for (int i = 1; i <= number; i++) {
//                if (i % 3 == 0 && i % 5 == 0) {
//                    System.out.print(i + " ");
//                }
//            }
//            System.out.println();
//        }
//
//        // Hàm tính tổng các ước số của number
//        private static void tinhTongUocSo(int number) {
//            int sum = 0;
//            for (int i = 1; i <= number; i++) {
//                if (number % i == 0) {
//                    sum += i;
//                }
//            }
//            System.out.println("Tổng các ước số của " + number + " là " + sum);
//        }
//
//        // Hàm tính tổng các số nguyên tố trong khoảng 1-number
//        private static void tinhTongSoNguyenTo(int number) {
//            int sum = 0;
//            for (int i = 2; i <= number; i++) {
//                if (kiemTraSoNguyenTo(i)) {
//                    sum += i;
//                }
//            }
//            System.out.println("Tổng các số nguyên tố trong khoảng 1-" + number + " là " + sum);
//        }
//
//        // Hàm kiểm tra số có trong khoảng (number1, number2)
//        private static void kiemTraKhoang(int number) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Nhập số nguyên number1: ");
//            int number1 = scanner.nextInt();
//            System.out.print("Nhập số nguyên number2: ");
//            int number2 = scanner.nextInt();
//
//            if (number > number1 && number < number2) {
//                System.out.println(number + " nằm trong khoảng (" + number1 + ", " + number2 + ").");
//            } else {
//                System.out.println(number + " không nằm trong khoảng (" + number1 + ", " + number2 + ").");
//            }
//        }
//    }
//
//
