package org.tasks.OOP.AbstractClass_Interface.Interface.Task2;

public class Main {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        String message = "Caesar Cipher";

        Encryptable reverseStrategy = new ReverseEncryptor();
        messenger.processMessage(message, reverseStrategy);

        Encryptable shiftstrategy = new ShiftEncryptor();
        messenger.processMessage(message, shiftstrategy);

    }
}
