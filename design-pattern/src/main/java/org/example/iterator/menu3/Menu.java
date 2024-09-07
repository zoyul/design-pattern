package org.example.iterator.menu3;

import java.util.Iterator;

// 클라이언트에서 메뉴에 들어있는 항목의 반복자를 획득할 수 있게 해주는 인터페이스
public interface Menu {
    Iterator<MenuItem> createIterator();
}
