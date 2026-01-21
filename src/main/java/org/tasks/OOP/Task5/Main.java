package org.tasks.OOP.Task5;

public class Main {
    public static void main(String[] args) {
        NotificationService notification;

        notification = new SmsNotification();
        notification.send("Shipment updates, driver arrival alerts, failed delivery notifications");

        notification = new EmailNotification();
        notification.send("Confirm your email address");
    }
}
