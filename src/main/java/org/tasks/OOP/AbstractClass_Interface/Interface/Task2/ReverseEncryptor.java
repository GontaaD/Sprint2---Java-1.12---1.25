package org.tasks.OOP.AbstractClass_Interface.Interface.Task2;

public class ReverseEncryptor implements Encryptable {
    private String reverseString(String data) {
        if (data == null) {
            return null;
        }
        return new StringBuilder(data).reverse().toString();
    }

    @Override
    public String encrypt(String data) {
        return reverseString(data);
    }

    @Override
    public String decrypt(String encryptedData) {
        return reverseString(encryptedData);
    }
}
