package com.sparta.running.day04.step5;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        IdolRepository repository = new IdolRepository();
        System.out.println("=====위험한 방식 =====");

        Idol idol2 = repository.findByNameLegacy("김종국");

        System.out.println("=====안전한 방식 =====");
        Optional<Idol> optional = repository.findByNameOptional("김종국");
        optional.ifPresent(idol -> System.out.println(idol));
        Idol idol = repository.findByNameOptional("wonyoung").orElse(new Idol("연습생", "무소속"));
        System.out.println("optional2 = " + idol.getName());
    }
}
