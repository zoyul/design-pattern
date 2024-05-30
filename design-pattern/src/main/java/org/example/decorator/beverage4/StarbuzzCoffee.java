package org.example.decorator.beverage4;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage espressoTall = new Espresso();
        // 사이즈 설정
        espressoTall.setSize(Size.TALL);
        espressoTall = new Soy(espressoTall);
        System.out.println(espressoTall.getDescription() + "/ size : " + espressoTall.getSize() +
                " $" + espressoTall.cost());

        Beverage espressoGrande = new Espresso();
        // 사이즈 설정
        espressoGrande.setSize(Size.GRANDE);
        espressoGrande = new Soy(espressoGrande);
        System.out.println(espressoGrande.getDescription() + "/ size : " + espressoGrande.getSize() +
                " $" + espressoGrande.cost());
    }
}
