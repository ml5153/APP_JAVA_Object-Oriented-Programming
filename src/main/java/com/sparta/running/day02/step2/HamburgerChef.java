package com.sparta.running.day02.step2;

import com.sparta.running.day02.step1.BurgerRecipe;

public class HamburgerChef {

    // 전략패턴은 변경이필요해서 final은 안함
    // HamburgerChef 는 레시피를 가지고있어!!!
    private BurgerRecipe recipe;

    // 전략변경 메서드 (setter)
    public void setRecipe(BurgerRecipe recipe) {
        this.recipe = recipe;

        // makeBurger()
    }

    // 기능: 햄버거를 요리하는 기능
    public void makeBurger() {
        System.out.println("--- 🍔 조리 시작 ---");
        System.out.println("# 번(빵)을 따뜻하게 굽습니다.");
        System.out.println("# 육즙 가득한 패티를 올립니다.");

        if (recipe != null) {
            // "중간에 뭘 넣을진 모르겠지만, 아무튼 너의 레시피대로 해!" (다형성)
            recipe.cook();  // 손님의 레시피대로 해
        }

        System.out.println("# 빵을 덮고 포장합니다.");
        System.out.println("--- ✅ 조리 완료 ---\n");
    }
}
