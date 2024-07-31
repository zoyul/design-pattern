package org.example.facade.theater;

public class Main {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.watchMovie("인사이드아웃2");
    }
}
