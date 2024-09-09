package org.example.composite.menu2;

public class MenuComponent {

    // 모든 메소드를 기본적으로 구현한다
    // 이 중 어떤 메소드는 복합 객체만 사용하고 개별 객체는 사용하지 않을 수 있기 때문에 기본적으로 UnsupportedOperationException 에러를 던진다
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
