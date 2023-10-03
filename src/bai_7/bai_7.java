package bai_7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class bai_7 {
    public static void main(String[] args) {
        Queue<Person> femaleQueue = new LinkedList<>();
        Queue<Person> maleQueue = new LinkedList<>();

        // Đọc dữ liệu từ file hoặc nguồn dữ liệu khác
        // và đưa vào queue tương ứng (femaleQueue hoặc maleQueue)

        // Ví dụ:
        femaleQueue.add(new Person("Ngoc", "Female", "1990-01-15"));
        maleQueue.add(new Person("Nam", "Male", "1985-03-22"));
        femaleQueue.add(new Person("Linh", "Female", "1988-07-10"));
        maleQueue.add(new Person("Tuan", "Male", "1992-05-18"));

        // Ghi dữ liệu vào file output hoặc nơi lưu trữ dữ liệu cuối cùng
        writeToFile(femaleQueue, "output.txt");
        writeToFile(maleQueue, "output.txt");

    }

    public static void writeToFile(Queue<Person> queue, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
            while (!queue.isEmpty()) {
                Person person = queue.poll();
                writer.println(person.name + ", " + person.gender + ", " + person.dob);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
