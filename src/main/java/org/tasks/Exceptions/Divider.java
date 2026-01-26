package org.tasks.Exceptions;

import java.io.IOException;

public class Divider {

    public int divide(int a, int b) {
        return a / b;
    }

    public static int readNumberFromFile() throws IOException {
        throw new IOException("File not found");
    }

    public static void printTextLength(){
        String text = null;
        System.out.println(text.length());
    }
}
