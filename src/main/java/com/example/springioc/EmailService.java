package com.example.springioc;

public class EmailService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);

    }
}
