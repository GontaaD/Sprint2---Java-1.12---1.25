package org.tasks.Exceptions;

import java.io.IOException;

public class Divider {

    public void divide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }

    public void checkedException() throws IOException {
        throw new IOException("File not found");
    }

    public void uncheckedException() throws NullPointerException {
        throw new NullPointerException("Null");
    }
}
