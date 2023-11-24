package org.example;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

//        The output will be 0 and nothing else which means that our exception was swallowed
        int a = getScore();
        System.out.println(a);

//        The output will be RuntimeException which means that our NumberFormatException was swallowed
        getSomething();

    }

    public static int getScore() {
        int score = 0;
        try {
            throw new RuntimeException("My exception"); // <== eaten by the finally
        } finally {
            return score;
        }
    }

    public static int getSomething() {
        try {
            throw new NumberFormatException("NumberFormatException"); // <== eaten by the finally
        } finally {
            throw new RuntimeException("RuntimeException");
        }
    }
}
