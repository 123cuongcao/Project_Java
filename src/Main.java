import BaiTap.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("cuong",30);
        student.setAge(30);
        student.setName("cường");
        student.getAge();
//        Student student1 = new Student("cường", 30);
        System.out.println("tuồi +" + student.getAge());
//        System.out.println("2" + student1);

    }

}