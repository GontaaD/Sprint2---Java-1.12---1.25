package org.tasks.Exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Divider divider = new Divider();
        Scanner scanner = new Scanner(System.in);

        try {
            divider.checkedException();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            divider.uncheckedException();
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        while (true) {
            try {
                System.out.println("Enter a number 'a'");
                int a = scanner.nextInt();
                System.out.println("Enter a number 'b'");
                int b = scanner.nextInt();
                divider.divide(a, b);
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException");
                scanner.next();
            } finally {
                System.out.println("Exception");
            }
        }
    }
}
