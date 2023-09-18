package TrenLop;

import java.util.Scanner;

public class XayDungLopHinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập bán kính:");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.println("Hãy nhập vào màu ");
        String color = sc.nextLine();
        Circle circle = new Circle(radius,color);
        Circle circle1 = new Circle();
        circle.displayData();

    }
    public static class Circle{
        double radius ;
        String color  ;
        public Circle() {
        }
        public Circle (double radius,String color){
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public double dienTich(){
            return Math.PI * radius * radius;
        }
        public double chuVi(){
            return Math.PI *2 * radius;
        }
        public void displayData(){
            System.out.println("diện tich hình tròn: "+dienTich()+"\nChu vi hình tròn: "+chuVi()+"\n Màu sắc của hình: "+color);
        }
    }
}
