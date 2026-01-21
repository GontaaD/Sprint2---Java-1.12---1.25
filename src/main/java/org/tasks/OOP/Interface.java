package org.tasks.OOP;

public class Interface {
    interface NotificationService {
        void send(String message);
    }

    class EmailNotification implements NotificationService {
        public void send(String message) {
            System.out.println("Email sent: " + message);
        }
    }

    class SmsNotification implements NotificationService {
        public void send(String message) {
            System.out.println("SMS sent: " + message);
        }
    }

}
