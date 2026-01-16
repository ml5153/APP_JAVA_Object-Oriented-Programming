package com.sparta.running.day01.encapsulation.level3;

public class Main {
    public static void main(String[] args) {
        int totalSeat = 10;

        Movie movie = new Movie("홍길동", totalSeat);

        for (int i = 0; i < totalSeat+1; i++) {
            System.out.print(i+1 + "번째 시도: ");
            movie.reserveSeats();
            System.out.println("남은좌석: " + movie.getAvailableSeats());
        }

    }
}
