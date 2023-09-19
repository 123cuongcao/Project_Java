package BaiTap.MyClass;

public class MyClass {
    private String myString;

    // Constructor without parameters
    public MyClass() {
        myString = "Default Value";
    }

    // Constructor with a parameter to set the value
    public MyClass(String value) {
        myString = value;
    }

    // Getter method to get the value of myString
    public String getMyString() {
        return myString;
    }

    // Setter method to set the value of myString
    public void setMyString(String value) {
        myString = value;
    }
}
