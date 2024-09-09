package org.example.composite.menu1;

import java.util.Iterator;
import java.util.List;

public class Waitress {

    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    // createIterator 메서드로 반복자를 받은 후 새로운 메서드로 넘기면 된다
    public void printMenu() {
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
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
