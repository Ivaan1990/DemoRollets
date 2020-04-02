package ru.ivanevgen.demo.tests;

import ru.ivanevgen.demo.model.Rollet;
import ru.ivanevgen.demo.model.RolletBuilder;

public class Demo {
    public static void main(String[] args) {
        Rollet rollet = new Rollet();
        rollet.constractRollet(
                2000,
                3900,
                0,
                true,
                true,
                1
        );
        System.out.println(rollet.getPriceForOneSquareMeter());
    }
}
