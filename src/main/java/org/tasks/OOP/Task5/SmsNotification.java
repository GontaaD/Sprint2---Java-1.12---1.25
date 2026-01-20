package org.tasks.OOP.Task5;

public class SmsNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
