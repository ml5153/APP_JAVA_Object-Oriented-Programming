package com.sparta.running.day01.encapsulation.level3;

public class Movie {
    public String title;
    private int totalSeats;
    private int bookedSeats =0;

    public Movie(final String title, final int totalSeats) {
        this.title = title;
        this.totalSeats = totalSeats;
    }


    public void reserveSeats() {
        if(isBookable()){
            bookedSeats++;
            System.out.println("예매 성공!!");
        } else {
            System.out.println("예매 할수 없다.");
        }

    }

    public int getAvailableSeats() {
        return totalSeats - bookedSeats;
    }

    private boolean isBookable() {
        return totalSeats > bookedSeats;
    }

}
