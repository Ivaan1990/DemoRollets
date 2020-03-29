package ru.ivanevgen.demo.model;

/**
 * Данный класс будет описывать роллету.
 */

public class Rollet {

    private int width;                // ширина
    private int height;               // высота
    private int installation;     //Накладной монтаж
    private boolean radioModule;      // Радиомодуль
    private boolean emergencyUnlock;  // Аварийная разблокировка
    private int controller;           // пульт управления

    public int getArea() {
        return (int)rolletBuilder.getArea();
    }

    private int PRICE_DELEVERY = 2000; // цена доставки, TODO уточнить, всегда ли 2000
    private RolletBuilder rolletBuilder;

    public void constractRollet(int width, int height, int installation, boolean radioModule, boolean emergencyUnlock, int controller) {
        rolletBuilder = new RolletBuilder(width, height, installation, radioModule, emergencyUnlock, controller);
    }

    public int getTotalPrice() {
        return rolletBuilder.totalPrice();
    }


}