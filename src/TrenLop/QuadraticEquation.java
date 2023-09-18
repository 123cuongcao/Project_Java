package TrenLop;

public class QuadraticEquation {
    public static void main(String[] args) {

    }

    public static class Quadraticecquation {
        private double a ,b, c;

        public Quadraticecquation (double a,double b,double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getDiscriminant(){
            double delta = b*b - 4*a*c;
            return delta;
        }

        public double getRoot1(){
            double r1 = (-b+Math.sqrt(b*b-(4*a*c)))/2*a;
            if(getDiscriminant()>=0){
                return r1;
            }else {
                return r1 = 0;
            }
        }

        public double getRoot2(){
            double r2 = (-b-Math.sqrt(b*b-(4*a*c)))/2*a;
            if(getDiscriminant()>=0){
                return r2;
            }else {
                return r2 = 0;
            }
        }

        public void print(){
            System.out.println("The equatiton has one ");
        }

    }
}
