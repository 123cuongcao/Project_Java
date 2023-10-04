package bài3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Bai3 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("cường"));
        list.add(new Person("cường1"));
        list.add(new Person("cường2"));
        list.add(new Person("cường3"));
        list.add(new Person("cường4"));

         list.stream().map(Person::getName).forEach((Consumer<? super String>) System.out::println);
    }
}
