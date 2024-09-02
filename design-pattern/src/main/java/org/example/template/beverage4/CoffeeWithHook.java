package org.example.template.beverage4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("커피 우리기");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유 추가하기");
    }

    // 후크 메서드를 오버라이드 해서 원하는 기능을 넣는다
    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {

        String answer = null;
        System.out.println("커미에 우유와 설탕을 넣을까요?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("error");
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
