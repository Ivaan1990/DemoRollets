package ru.ivanevgen.demo.model;

public interface IRolletBuilder {
    int priceForOneSquareMeter(); //Цена 1 кв.м.
    int productPrice(); //Цена изделия
    int installationPrice(); //Цена монтажа
    public int totalPrice(); //Итого:
}
