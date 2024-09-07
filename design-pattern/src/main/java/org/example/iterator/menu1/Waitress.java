package org.example.iterator.menu1;

import java.util.ArrayList;

public class Waitress {

    public void printMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerHouseMenu dinerHouseMenu = new DinerHouseMenu();
        MenuItem[] lunchItems = dinerHouseMenu.getMenuItems();

        // ArrayList 대한 순환문
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getPrice());
        }

        // 배열에 순환문
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getPrice());
        }
    }
}
