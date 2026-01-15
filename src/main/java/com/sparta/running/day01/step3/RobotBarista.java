package com.sparta.running.day01.step3;

import com.sparta.running.day01.step4.Coffee;

public class RobotBarista {
    private int beans = 100;


    public Coffee madeCoffee(final String menuName) {
        return new Coffee(menuName);
    }
}
