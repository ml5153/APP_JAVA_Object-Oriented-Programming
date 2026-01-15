package com.sparta.running.day01.step1;

public class Main {
    public static void main(String[] args) {

        Barista barista = new Barista();
        Customer sonsom = new Customer();

        sonsom.order("아이스 아메리카노", barista);

        barista.beans = 0;
        System.out.println("누군가 다 훔쳐감 " + barista);

    }
}
