package com.sparta.running.day01.polymorphism;

public class Admin extends Messenger{
    private String name = "";

    public Admin(final String name) {
        this.name = name;
    }
    @Override
    public void sendMessage(String message) {
        // 🚨[관리자] 슈퍼맨: 긴급 서버 점검 공지입니다!🚨
        System.out.println("\uD83D\uDEA8[관리자] " + name + " " + message + "\uD83D\uDEA8");
    }
}
