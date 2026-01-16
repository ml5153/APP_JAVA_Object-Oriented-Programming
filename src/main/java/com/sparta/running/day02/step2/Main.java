package com.sparta.running.day02.step2;

import com.sparta.running.day02.step1.BurgerRecipe;

public class Main {
    public static void main(String[] args) {
        HamburgerChef hamburgerChef = new HamburgerChef();

        // 클래스가 폭발하는 단점이있으니 익명클래스로 구현해보자!!
        // {} : 이게 익명클래스였다!!, 어나니머스 클래스
        BurgerRecipe spicyRecipe = new BurgerRecipe() {
            // 익명클래스영역
            @Override
            public void cook() {
                System.out.println("# 겁나 매운 할라피뇨, 청양고추, 불닭소스 집어넣는다.");
            }
        };
        hamburgerChef.setRecipe(spicyRecipe);
        hamburgerChef.makeBurger();

        // 인라인으로 익명클래스 전달
        hamburgerChef.setRecipe(new BurgerRecipe() {
            @Override
            public void cook() {
                System.out.println("양상추 넣고 생양파 넣고~");
            }
        });

    }
}
