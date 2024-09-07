package org.example.iterator.menu4;

import java.util.Iterator;

public class Waitress {

    // Menu 인터페이스를 사용하도록 수정
    Menu pancakeHouseMenu;
    Menu dinerHouseMenu;
    //  cafeMenu 추가
    Menu cafeHouseMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerHouseMenu, Menu cafeHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerHouseMenu = dinerHouseMenu;
        this.cafeHouseMenu = cafeHouseMenu;
    }

    // createIterator 메서드로 반복자를 받은 후 새로운 메서드로 넘기면 된다
    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerHouseMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeHouseMenu.createIterator();

        System.out.println("아침메뉴");
        printMenu(pancakeIterator);
        System.out.println("점심 메뉴");
        printMenu(dinerIterator);
        System.out.println("카페 메뉴");
        printMenu(cafeIterator);
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
