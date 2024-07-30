package org.example.adapter.example;

import java.util.Enumeration;
import java.util.Iterator;

// Enumeration을 Iterator에 적응시키고 있기에 어댑터는 Iterator를 구현
public class EnumerationIterator implements Iterator<Object> {

    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    // remove() 메소드는 지원되지 않으므로 예외
    public void remove() {
        throw new UnsupportedOperationException();
    }
}