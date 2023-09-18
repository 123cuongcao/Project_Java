package BaiTap;

import java.util.Scanner;

public class LopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào đồ dài");
        double width = sc.nextDouble();
        System.out.println("Nhập chiều rộng");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }

    public static class Rectangle{
        double width ,height;

        public Rectangle(double newWidth, double newHeight){
            width = newWidth;
            height = newHeight;
        }

        public double getArea(){
            return width*height;
        }

        public double getPerimeter(){
            return(width+height)*2;
        }

        public String display() {
            return "Rectangle{" + "width=" + width + ", height=" + height + "}";
        }
    }
}
