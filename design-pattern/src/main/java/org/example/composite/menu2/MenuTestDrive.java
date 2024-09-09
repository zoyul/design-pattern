package org.example.composite.menu2;

public class MenuTestDrive {

    public static void main(String[] args) {

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);

        pancakeHouseMenu.add(new MenuItem(
                "K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));

        dinerMenu.add(new MenuItem(
                "Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99));
        dinerMenu.add(new MenuItem(
                "BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99));

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));

        dessertMenu.add(new MenuItem(
                "Cheesecake",
                "Creamy New York cheesecake, with a chocolate graham crust",
                true,
                1.99));

        dinerMenu.add(dessertMenu);

        // 모두 MenuComponent를 상속받기 때문에 가능하다
        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
