package BaiTap.Circle;


    public class Main {
        public static void main(String[] args) {
            Circle myCircle = new Circle(2.5);

            // Truy cập các phương thức getRadius và getArea
            double circleRadius = myCircle.getRadius();
            double circleArea = myCircle.getArea();

            System.out.println("Bán kính của hình tròn là: " + circleRadius);
            System.out.println("Diện tích của hình tròn là: " + circleArea);
        }
    }