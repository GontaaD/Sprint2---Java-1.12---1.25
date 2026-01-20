package org.tasks.Exceptions;

import java.io.IOException;

public class Divider {

    public int divide(int a, int b) {
        try {
            return a / b;
        } finally {
            System.out.println("Operation finished");
        }
    }

    public static void readNumberFromFile() throws IOException {
        throw new IOException("File not found");
    }

    public static void demonstrateUncheckedException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to use a null object.");
        }
    }
}
