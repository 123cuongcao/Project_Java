package BaiTap.PhuongThuc;

public class Main {
    public static void main(String[] args) {
        double circleRadius1 = 3.5;
        double circleRadius2 = 6.0;

        double triangleSide1 = 3.0;
        double triangleSide2 = 4.0;
        double triangleSide3 = 5.0;

        double triangleSide4 = 4.5;
        double triangleSide5 = 7.0;
        double triangleSide6 = 6.0;

        double rectangleWidth1 = 2.5;
        double rectangleHeight1 = 6.0;

        double rectangleWidth2 = 4.0;
        double rectangleHeight2 = 7.0;

        // Tính diện tích hình tròn
        double circleArea1 = StaticMethod.calCircleArea(circleRadius1);
        double circleArea2 = StaticMethod.calCircleArea(circleRadius2);

        // Tính diện tích tam giác
        double triangleArea1 = StaticMethod.calTriangleArea(triangleSide1, triangleSide2, triangleSide3);
        double triangleArea2 = StaticMethod.calTriangleArea(triangleSide4, triangleSide5, triangleSide6);

        // Tính diện tích hình chữ nhật
        double rectangleArea1 = StaticMethod.calRectangleArea(rectangleWidth1, rectangleHeight1);
        double rectangleArea2 = StaticMethod.calRectangleArea(rectangleWidth2, rectangleHeight2);

        // Hiển thị kết quả
        System.out.println("Diện tích hình tròn 1: " + circleArea1);
        System.out.println("Diện tích hình tròn 2: " + circleArea2);
        System.out.println("Diện tích tam giác 1: " + triangleArea1);
        System.out.println("Diện tích tam giác 2: " + triangleArea2);
        System.out.println("Diện tích hình chữ nhật 1: " + rectangleArea1);
        System.out.println("Diện tích hình chữ nhật 2: " + rectangleArea2);
    }
}
