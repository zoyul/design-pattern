package org.example.composite.menu2;

public class Waitress {

    // 클라이언트에서는 다른 모든 메뉴를 포함하고 있는 최상위 메뉴 구성 요소만 알면 된다
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    // 그냥 최상위 메뉴의 print 메소드를 호출하면 모두 해결된다
    public void printMenu() {
        allMenus.print();
    }
}
