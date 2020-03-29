package ru.ivanevgen.demo.model;

/**
 * Данный класс будет описывать роллету.
 */

public class Rollet {

    public Rollet(){}

    private int PRICE_DELEVERY = 2000; // цена доставки, TODO уточнить, всегда ли 2000
    private RolletBuilder rolletBuilder;

    public void constractRollet(int width,
                                int height,
                                int installation,
                                boolean radioModule,
                                boolean emergencyUnlock,
                                int controller) {
        rolletBuilder = new RolletBuilder(width, height, installation, radioModule, emergencyUnlock, controller);
    }

    public double getTotalPrice() {
        return rolletBuilder.totalPrice();
    }

    public double getArea() {
        return rolletBuilder.getArea();
    }

}