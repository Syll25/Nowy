package org.example;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        for (int i = 1; i <= 100; i++) {
            System.out.println(main.fooBar(i));
        }
    }

    public String fooBar(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FooBar";
        } else if (i % 3 == 0) {
            return "Foo";
        } else if (i % 5 == 0) {
            return "Bar";
        } else {
            return "i = " + i;
        }
    }
}
