import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    public Student() {
    }

    public Student(String studentId, String studentName, int age, String gender, String address, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã học sinh: ");
        this.studentId = scanner.nextLine();
        System.out.print("Nhập tên học sinh: ");
        this.studentName = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Nhập giới tính: ");
        this.gender = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        this.phoneNumber = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Thông tin học sinh:");
        System.out.println("Mã học sinh: " + studentId);
        System.out.println("Tên học sinh: " + studentName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phoneNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int studentCount = 0;

        int choice;
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("\nDanh sách tất cả học sinh:");
                    for (int i = 0; i < studentCount; i++) {
                        students[i].displayData();
                    }
                    break;

                case 2:
                    if (studentCount < students.length) {
                        students[studentCount] = new Student();
                        students[studentCount].inputData();
                        studentCount++;
                        System.out.println("Thêm học sinh thành công!");
                    } else {
                        System.out.println("Danh sách học sinh đã đầy, không thể thêm mới.");
                    }
                    break;

                case 3:
                    System.out.print("Nhập mã học sinh cần sửa thông tin: ");
                    String editStudentId = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].studentId.equals(editStudentId)) {
                            students[i].inputData();
                            System.out.println("Sửa thông tin học sinh thành công!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy học sinh với mã " + editStudentId);
                    }
                    break;

                case 4:
                    System.out.print("Nhập mã học sinh cần xoá: ");
                    String deleteStudentId = scanner.nextLine();
                    boolean deleted = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].studentId.equals(deleteStudentId)) {
                            for (int j = i; j < studentCount - 1; j++) {
                                students[j] = students[j + 1];
                            }
                            studentCount--;
                            System.out.println("Xoá học sinh thành công!");
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Không tìm thấy học sinh với mã " + deleteStudentId);
                    }
                    break;

                case 5:
                    System.out.println("Chương trình kết thúc.");
                    break;

                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 5);
    }
}
