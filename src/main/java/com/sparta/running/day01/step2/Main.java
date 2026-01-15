package com.sparta.running.day01.step2;

public class Main {
    public static void main(String[] args) {

        Barista barista = new Barista();
        Customer sonny = new Customer();

        sonny.order("아이스 아메리카노", barista);
        sonny.order("카페라뗴", barista);
        sonny.order("마끼아또", barista);
        sonny.order("카푸치노", barista);

    }
}
