package com.sparta.running.day01.polymorphism;

public class User extends Messenger{
    private String name = "";

    public User(final String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        // [사용자] {이름}: {메시지}
        System.out.println("[사용자] " + name + " " + message );
    }
}
