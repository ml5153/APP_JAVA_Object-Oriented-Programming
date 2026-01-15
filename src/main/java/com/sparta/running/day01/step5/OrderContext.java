package com.sparta.running.day01.step5;

public class OrderContext {

    // 오전반 설정: 사람 바리스타 + 캐셔
    public static Cashier configMorningShift() {
        return new Cashier(new Barista()); // 의존성 주입 (DI)
    }

    // 오후반 설정: 로봇 바리스타 + 캐셔
    public static Cashier configAfternoonShift() {
        return new Cashier(new RobotBarista()); // 의존성 주입 (DI)
    }

    // 야간반 설정: 강아지 바리스타 + 캐셔
    public static Cashier configNightShift() {
        return new Cashier(new DogBarista()); // 의존성 주입 (DI)
    }
}