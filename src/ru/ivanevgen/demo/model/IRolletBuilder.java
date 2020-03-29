package ru.ivanevgen.demo.model;

public interface IRolletBuilder {
    double getArea(); // Площадь роллеты
    double priceForOneSquareMeter(); //Цена 1 кв.м.
    int productPrice(); //Цена изделия
    int installationPrice(); //Цена монтажа
    double totalPrice(); //Итого:
}