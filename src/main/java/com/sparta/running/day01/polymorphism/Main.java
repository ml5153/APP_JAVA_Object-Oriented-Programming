package com.sparta.running.day01.polymorphism;

public class Main {
    public static void main(String[] args) {
        User user = new User("홍길동");
        Admin admin = new Admin("스파르타");

        MessageRelay messageRelay = new MessageRelay();
        messageRelay.relay(user, "안녕하세요! 다형성 실습 재밌네요.");
        messageRelay.relay(admin, "긴급 서버 점검이 10분 뒤에 시작됩니다.");
    }
}
