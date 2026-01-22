package org.tasks.OOP.AbstractClass_Interface.Interface.Task2;

public class ShiftEncryptor implements Encryptable {

    public String encrypt(String data) {
        char[] chars = data.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] += 1;
        }
        return new String(chars);
    }

    public String decrypt(String encryptedData) {
        char[] chars = encryptedData.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] -= 1;
        }
        return new String(chars);
    }
}
