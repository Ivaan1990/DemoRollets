package ru.ivanevgen.demo.model;

/**
 *  *  Создание роллеты происходит через строителяю.
 *  *  1. Ширина ролеты, мм (величина в милиметрах)
 *  *  2. Высота ролеты, мм (величина в милиметрах)
 *  *  3 .Накладной монтаж (1 - понадобиттся, 0 - не понадобится)
 *  *  4. Площадь, кв.м.
 *  *  5. Радиомодуль (1 - понадобиттся, 0 - не понадобится)
 *  *  6. Аварийная разблокировка (1 - понадобиттся, 0 - не понадобится)
 *  *  7. Пульт (Количество пультов)
 */

public class RolletBuilder implements IRolletBuilder{

    private double area;                 // площадь

    private double  width;                // ширина
    private double  height;               // высота
    private int     installation;     //Накладной монтаж
    private boolean radioModule;      // Радиомодуль
    private boolean emergencyUnlock;  // Аварийная разблокировка
    private int     controller;           // пульт управления

    public RolletBuilder(double width, double height, int installation, boolean radioModule, boolean emergencyUnlock, int controller) {
        this.width = width;
        this.height = height;
        this.installation = installation;
        this.radioModule = radioModule;
        this.emergencyUnlock = emergencyUnlock;
        this.controller = controller;
    }

    @Override
    public double getArea() {
        return width / 1000 * height / 1000 + width / 1000 * height / 1000 * installation * 0.3;
    }

    @Override
    public double priceForOneSquareMeter() {
        // Если площать больше 7 то
        if(area > 7) {
            return getArea();
        } else {

        }
        return 0;
    }

    @Override
    public int productPrice() {
        return 0;
    }

    @Override
    public int installationPrice() {
        return (int) (productPrice() * 0.2);
    }

    @Override
    public double totalPrice() {
        return priceForOneSquareMeter() + productPrice() + installationPrice();
    }
}