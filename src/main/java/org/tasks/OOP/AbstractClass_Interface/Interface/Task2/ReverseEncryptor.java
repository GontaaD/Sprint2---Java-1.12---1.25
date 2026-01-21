package org.tasks.OOP.AbstractClass_Interface.Interface.Task2;

public class ReverseEncryptor implements Encryptable{
    @Override
    public String encrypt(String data) {
        return new StringBuilder(data).reverse().toString();
    }

    @Override
    public String decrypt(String encryptedData) {
        return new StringBuilder(encryptedData).reverse().toString();
    }
}
