package TrenLop.Fan;

public class Fan {
    public enum Speed{
        SLOW,MEDIUM,FAST
    }
    private Speed speed;
    private boolean on ;
    private double radius;
    private String color ;

    public Fan() {
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    @Override
    public String toString() {
        if(on){
            return "Fan is on\nSpeed: " + speed + "\nColor: " + color + "\nRadius: " + radius;
        }else {
            return "Fan is off\nColor: " + color + "\nRadius: " + radius;
        }
    }
}
