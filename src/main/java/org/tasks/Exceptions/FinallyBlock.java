package org.tasks.Exceptions;

class FinallyBlock {
    public int divide(int a, int b) {
        try {
            int result = a / b;
            return result;

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;

        } finally {
            System.out.println("Operation finished");
        }
    }
}

