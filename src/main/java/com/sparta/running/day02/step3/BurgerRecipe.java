package com.sparta.running.day02.step3;


// 햄버거 레시피 명세서
// 레시피 모르겠는데 아무튼!! 요리해야해

// FunctionalInterface: 람다인지 확인가능!!
@FunctionalInterface
public interface BurgerRecipe {
    void cook();


    // static 메서드
    static void foo(){

    }
    // 기본메서드
    default void foo2(){

    }
}
