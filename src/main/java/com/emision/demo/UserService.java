package com.emision.demo;

public class UserService {

    private NotificationService notificationService;

    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void registerUser(String username) {
        System.out.println("Usuario " + username + " registrado satisfactoriamente.");
        notificationService.sendNotification("Bienvenido, " + username + "!");
    }
}
