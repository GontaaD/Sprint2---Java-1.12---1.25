package org.tasks.OOP.AbstractClass_Interface.Interface.Task2;

public class Messenger {

    void processMessage(String text, Encryptable strategy) {
        String encrypted = strategy.encrypt(text);
        String decrypted = strategy.decrypt(encrypted);

        System.out.println("Original text: " + text);
        System.out.println("Encrypted text: " + encrypted);
        System.out.println("Decrypted text: " + decrypted);
    }
}
