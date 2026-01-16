package com.sparta.running.day02.step3;

import com.sparta.running.day02.step1.BurgerRecipe;

public class BaconBurgerRecipe implements BurgerRecipe {
    @Override
    public void cook() {
        System.out.println("# 베이컨 3장을 크런치하게 넣어줘");
        System.out.println("# 베이컨을 바싹 구워줘");
        System.out.println("# 베이컨을 반으로 나눠줘");
    }
}
