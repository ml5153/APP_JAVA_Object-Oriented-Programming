package com.sparta.running.day04.step1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Arrays.asList()
        List<String> list = List.of("장원영", "안유진", "레이", "가을", "리즈", "이서");
        try {
            String member = list.get(10);
            System.out.println("member = " + member);
        } catch (Exception e) {
            System.out.println("그런 멤버는 없어.");
        }

    }
}
