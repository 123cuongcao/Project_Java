package BaiTap.MyClass;

public class Main {
    public static void main(String[] args) {
        // Create an object of MyClass using the default constructor
        MyClass myObject = new MyClass();

        // Display the initial value of myString
        System.out.println("Initial Value: " + myObject.getMyString());

        // Set a new value for myString using the setter method
        myObject.setMyString("New Value");

        // Display the updated value of myString
        System.out.println("Updated Value: " + myObject.getMyString());
    }
}
