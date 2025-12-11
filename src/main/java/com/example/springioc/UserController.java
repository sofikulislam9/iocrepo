package com.example.springioc;

public class UserController {


    private MessageService messageService;

    // Setter-based dependency injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void process() {
        messageService.sendMessage("Welcome to Spring IoC!");
    }
}
