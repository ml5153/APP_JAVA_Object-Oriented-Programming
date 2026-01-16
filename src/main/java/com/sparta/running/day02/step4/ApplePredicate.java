package com.sparta.running.day02.step4;


// 주어진 사과가 특정조건(추상화)에 맞는지 아닌지만 확인
@FunctionalInterface
public interface ApplePredicate {
    boolean test(Apple apple);

}
