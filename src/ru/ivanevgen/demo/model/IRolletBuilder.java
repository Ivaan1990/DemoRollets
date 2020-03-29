package ru.ivanevgen.demo.model;

public interface IRolletBuilder {
    double priceForOneSquareMeter(); //Цена 1 кв.м.
    int productPrice(); //Цена изделия
    int installationPrice(); //Цена монтажа
    double totalPrice(); //Итого:
}