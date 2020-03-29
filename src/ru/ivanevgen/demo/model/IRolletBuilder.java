package ru.ivanevgen.demo.model;

public interface IRolletBuilder {
    public double getArea(); // Площадь роллеты
    int priceForOneSquareMeter(); //Цена 1 кв.м.
    int productPrice(); //Цена изделия
    int installationPrice(); //Цена монтажа
    public int totalPrice(); //Итого:
}
