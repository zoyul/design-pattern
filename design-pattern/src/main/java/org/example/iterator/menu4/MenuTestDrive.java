package org.example.iterator.menu4;

public class MenuTestDrive {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerHouseMenu dinerMenu = new DinerHouseMenu();
        CafeHouseMenu cafeMenu = new CafeHouseMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();
    }
}