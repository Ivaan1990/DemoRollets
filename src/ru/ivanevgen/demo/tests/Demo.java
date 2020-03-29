package ru.ivanevgen.demo.tests;

import ru.ivanevgen.demo.model.Rollet;
import ru.ivanevgen.demo.model.RolletBuilder;

public class Demo {
    public static void main(String[] args) {
        Rollet rollet = new Rollet();
        rollet.constractRollet(
                4200,
                3800,
                0,
                true,
                true,
                1
        );
        //System.out.println(rollet.getTotalPrice());
        System.out.println(rollet.getArea());
    }
}
