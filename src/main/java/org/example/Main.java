package org.example;

public class Main {
    public static void main(String[] args) throws MyException {

        // My custom exception is having the cause now.
        // To make it happen I had to override 4 super constructors
        // This exception is also a checked one because I extend from Throwable
        // That means if I extend from only Throwable then I have a checked exception
        // But if my exception is a subclass of not only throwable but also RuntimeException or Error
        // Then I have an unchecked exception/error
        // All the other subclasses are checked by compiler as much as Throwable
        throw new MyException(new RuntimeException());

    }
}