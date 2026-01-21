package org.tasks.Exceptions;

public class Unchecked {
        public static void main(String[] args) {

            try {
                String text = null;
                System.out.println(text.length());

            } catch (NullPointerException e) {
                System.out.println("Error: Object is null.");
            }

            System.out.println("Program continues after unchecked exception...");
        }
    }

