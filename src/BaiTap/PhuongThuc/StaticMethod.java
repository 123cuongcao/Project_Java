package BaiTap.PhuongThuc;

public class StaticMethod {
    public static final double PI = 3.14;

    public static double calCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static double calRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calTriangleArea(double a, double b, double c) {
        // Sử dụng công thức Heron để tính diện tích tam giác khi biết độ dài các cạnh
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
