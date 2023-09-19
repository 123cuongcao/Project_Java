package TrenLop.Employee;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private String gender;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int age, String gender, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        this.employeeId = scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        this.employeeName = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Nhập giới tính: ");
        this.gender = scanner.nextLine();
        System.out.print("Nhập hệ số lương: ");
        this.rate = scanner.nextDouble();
    }

    public void calSalary() {
        this.salary = rate * 1_300_000;
    }

    public void displayData() {
        System.out.println("Thông tin nhân viên:");
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Hệ số lương: " + rate);
        System.out.println("Lương: " + salary);
    }
}