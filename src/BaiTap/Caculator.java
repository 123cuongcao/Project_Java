package BaiTap;

public class Caculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setA(10);
        calculator.setB(5);

        System.out.println("a + b = " + calculator.add());
        System.out.println("a - b = " + calculator.subtract());
        System.out.println("a * b = " + calculator.multiply());
        System.out.println("a / b = " + calculator.divide());
    }
    public static class Calculator {
        private double a;
        private double b;

        public Calculator() {
            this.a = 0;
            this.b = 0;
        }

        public Calculator(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public void setA(double a) {
            this.a = a;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double add() {
            return a + b;
        }

        public double subtract() {
            return a - b;
        }

        public double multiply() {
            return a * b;
        }

        public double divide() {
            if (b == 0) {
                System.out.println("Lỗi: Không thể chia cho 0.");
                return Double.NaN;
            }
            return a / b;
        }

    }
