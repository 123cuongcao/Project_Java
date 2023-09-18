package BaiTap;

public class XayDungLopHocSinh {
    public static void main(String[] args) {
        // Tạo một đối tượng Student
        Student student = new Student(1, "Nguyen Van A", "Nam", "12A", 15, "123 Main Street");

        // Hiển thị thông tin của học sinh
        student.display();
    }

    public static class Student{
        private int studentId;
        private String studentName;
        private String sex;
        private String className;
        private int age;
        private String address;

        public Student() {
            // Khởi tạo các thuộc tính mặc định
            this.studentId = 0;
            this.studentName = "";
            this.sex = "";
            this.className = "";
            this.age = 0;
            this.address = "";
        }

        public Student(int studentId, String studentName, String sex, String className, int age, String address) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.sex = sex;
            this.className = className;
            this.age = age;
            this.address = address;
        }

        public void display() {
            System.out.println("Mã học sinh: " + studentId);
            System.out.println("Tên học sinh: " + studentName);
            System.out.println("Giới tính: " + sex);
            System.out.println("Lớp học: " + className);
            System.out.println("Tuổi: " + age);
            System.out.println("Địa chỉ: " + address);
        }
    }

}
