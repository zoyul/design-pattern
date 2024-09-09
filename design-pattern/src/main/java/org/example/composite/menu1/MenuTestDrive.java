package org.example.composite.menu1;

import java.util.List;

public class MenuTestDrive {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerHouseMenu dinerMenu = new DinerHouseMenu();
        CafeHouseMenu cafeMenu = new CafeHouseMenu();

        Waitress waitress = new Waitress(List.of(pancakeHouseMenu, dinerMenu, cafeMenu));

        waitress.printMenu();
    }
}