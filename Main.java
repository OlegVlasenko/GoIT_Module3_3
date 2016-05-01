package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Guitar guitar1 = new Guitar(), guitar2 = new Guitar();
        Piano piano1 = new Piano(), piano2 = new Piano();
        Trumpet trumpet1 = new Trumpet(), trumpet2 = new Trumpet();

        System.out.println("----------------------");


        Shop shop1 = new Shop();
        shop1.addInstrument(guitar1);
        shop1.addInstrument(piano1);
        shop1.addInstrument(trumpet1);

        shop1.print();

        System.out.println("----------------------");

        List<MusiInstrument> someList = new ArrayList<>();
        someList.add(guitar2);
        someList.add(piano2);
        someList.add(trumpet2);

        Shop shop2 = new Shop(someList);

        shop2.print();


    }
}
