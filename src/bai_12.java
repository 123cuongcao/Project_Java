import java.util.LinkedList;
import java.util.Queue;
public class bai_12 {
    public class QueueExample {
        public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();

            queue.add(5);
            queue.add(3);
            queue.add(8);
            queue.add(1);
            queue.add(6);

            int minValue = findMinInQueue(queue);

            System.out.println("Phần tử nhỏ nhất trong hàng đợi là: " + minValue);
        }

        public static int findMinInQueue(Queue<Integer> queue) {

            if (queue.isEmpty()) {
                System.out.println("Hàng đợi đang rỗng.");
                return Integer.MIN_VALUE;
            }
            int minValue = queue.peek();

            for (int num : queue) {
                if (num < minValue) {
                    minValue = num;
                }
            }
            return minValue;
        }
    }

}
