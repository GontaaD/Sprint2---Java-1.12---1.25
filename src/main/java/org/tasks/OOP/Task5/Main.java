package org.tasks.OOP.Task5;

public class Main {
    public static void main(String[] args){
        NotificationService notification;
        notification = new EmailNotification();
        notification.send("Your had new message");
        notification = new SmsNotification();
        notification.send("Your key is 22468");
    }
}
