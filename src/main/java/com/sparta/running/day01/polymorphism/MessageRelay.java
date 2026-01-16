package com.sparta.running.day01.polymorphism;

public class MessageRelay {

    public void relay(Messenger sender, String message) {
        sender.sendMessage(message);
    }
}
