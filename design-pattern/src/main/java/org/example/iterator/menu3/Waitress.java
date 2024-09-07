package org.example.iterator.menu3;

import java.util.Iterator;

public class Waitress {

    // Menu 인터페이스를 사용하도록 수정
    Menu pancakeHouseMenu;
    Menu dinerHouseMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerHouseMenu = dinerHouseMenu;
    }

    // createIterator 메서드로 반복자를 받은 후 새로운 메서드로 넘기면 된다
    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerHouseMenu.createIterator();

        System.out.println("아침메뉴");
        printMenu(pancakeIterator);
        System.out.println("점심 메뉴");
        printMenu(dinerIterator);
    }

    public void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + ", ");
            System.out.println(menuItem.getDescription() + ", ");
        }
    }
}
