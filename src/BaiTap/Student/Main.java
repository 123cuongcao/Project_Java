package BaiTap.Student;


    public class Main {
        public static void main(String[] args) {
            Student student = new Student();

            student.setName("Alice");
            student.setClasses("A01");

            String studentName = student.getName();
            String studentClasses = student.getClasses();

            System.out.println("Tên học sinh: " + studentName);
            System.out.println("Lớp học: " + studentClasses);
        }
    }

