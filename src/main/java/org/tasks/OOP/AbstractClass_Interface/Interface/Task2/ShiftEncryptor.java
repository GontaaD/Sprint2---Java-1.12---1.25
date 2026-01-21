package org.tasks.OOP.AbstractClass_Interface.Interface.Task2;

public class ShiftEncryptor implements Encryptable {

    @Override
    public String encrypt(String data) {
        StringBuilder result = new StringBuilder();

        for (char c : data.toCharArray()) {
            result.append((char) (c + 1));
        }
        return result.toString();
    }

    @Override
    public String decrypt(String encryptedData) {
        StringBuilder result = new StringBuilder();

        for (char c : encryptedData.toCharArray()) {
            result.append((char) (c - 1));
        }
        return result.toString();
    }
}
