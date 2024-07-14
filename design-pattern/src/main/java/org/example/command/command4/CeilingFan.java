package org.example.command.command4;

public class CeilingFan {

    // 선풍기 속도를 나타내는 변수들
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;

    public CeilingFan() {
        this.speed = OFF;
    }

    public void high() {
        System.out.println("CeilingFan high");
        speed = HIGH;
    }

    public void medium() {
        System.out.println("CeilingFan medium");
        speed = MEDIUM;
    }

    public void low() {
        System.out.println("CeilingFan low");
        speed = LOW;
    }

    public void on() {
        System.out.println("CeilingFan on");
    }

    public void off() {
        System.out.println("CeilingFan off");
    }

    public int getSpeed() {
        return speed;
    }
}
