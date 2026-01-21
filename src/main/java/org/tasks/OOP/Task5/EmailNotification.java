package org.tasks.OOP.Task5;

public class EmailNotification implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Email Notifications: " + message);
    }
}
