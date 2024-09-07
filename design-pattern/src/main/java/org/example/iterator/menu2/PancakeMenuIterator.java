package org.example.iterator.menu2;

import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {

    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.size() > position;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);

    }
}
