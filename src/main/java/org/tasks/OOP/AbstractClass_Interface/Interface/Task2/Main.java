package org.tasks.OOP.AbstractClass_Interface.Interface.Task2;

public class Main {
    public static void main(String[] args){
        Messenger messenger = new Messenger();
        Encryptable reverse = new ReverseEncryptor();
        Encryptable shift = new ShiftEncryptor();
        messenger.processMessage("Java", reverse);
        messenger.processMessage("abc", shift);
    }
}
