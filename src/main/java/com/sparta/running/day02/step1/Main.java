package com.sparta.running.day02.step1;

public class Main {
    public static void main(String[] args) {
        HamburgerChef hamburgerChef = new HamburgerChef();
        // 햄버거레시피를 알려주자!
        hamburgerChef.setRecipe(new CheeseBurgerRecipe());
        hamburgerChef.makeBurger();

        // 또다른 손님으로 인해 베이컨 버거로 전략 교체!
        hamburgerChef.setRecipe(new BaconBurgerRecipe());
        hamburgerChef.makeBurger();


    }
}
