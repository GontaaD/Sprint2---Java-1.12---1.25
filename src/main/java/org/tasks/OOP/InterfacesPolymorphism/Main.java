package org.tasks.OOP.InterfacesPolymorphism;

public class Main {
    public static void main(String[] args) {
        NotificationService email = new EmailNotification();
        NotificationService sms = new SmsNotification();
        email.send("email");
        sms.send("sms");
    }
}
