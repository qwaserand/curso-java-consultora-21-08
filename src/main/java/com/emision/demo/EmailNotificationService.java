package com.emision.demo;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification(String mensaje) {
        System.out.println("Enviando email con el mensaje: " + mensaje);
    }
}
