package org.tasks.Exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Divider divider = new Divider();

        try{
            Divider.readNumberFromFile();
        } catch (IOException e) {
            System.out.println("Checked Exception Caught: " + e.getMessage());
        }

        try {
            Divider.printTextLength();
        } catch(NullPointerException e){
            System.out.println("Unchecked Exception Caught: " + e.getMessage());
        }

        while (true) {
            try {
                System.out.println("Enter first number: ");
                int a = scanner.nextInt();

                System.out.println("Enter second number: ");
                int b = scanner.nextInt();

                int result = divider.divide(a, b);
                System.out.println("Result: " + result);
                break;

            } catch (ArithmeticException e){
                System.out.println("Error: cannot be divided by zero");
            } catch (InputMismatchException e) {
                System.out.println("Error: Enter only valid integers");
                scanner.next();
            } finally {
                System.out.println("Operation finished");
            }
        }
        scanner.close();
    }
}
