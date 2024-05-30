package org.example.decorator.beverage5;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage espressoTall = new Espresso(Size.TALL);
        // 가격을 어떻게 추가할 것인지 지정할 수 있음
        espressoTall = new Soy(espressoTall, new HalfSizeCost());
        System.out.println(espressoTall.getDescription() + "/ size : " + espressoTall.getSize() +
                " $" + espressoTall.cost());

        Beverage espressoTall2 = new Espresso(Size.TALL);
        espressoTall2 = new Soy(espressoTall2, new TallSizeCost());
        System.out.println(espressoTall2.getDescription() + "/ size : " + espressoTall2.getSize() +
                " $" + espressoTall2.cost());

        Beverage espressoGrande = new Espresso(Size.GRANDE);
        espressoGrande = new Soy(espressoGrande, new GrandeSizeCost());
        System.out.println(espressoGrande.getDescription() + "/ size : " + espressoGrande.getSize() +
                " $" + espressoGrande.cost());
    }
}
