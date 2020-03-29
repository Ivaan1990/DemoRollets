package ru.ivanevgen.demo.model;

/**
 *  * При создания обекта роллеты, нам необходимо проиницализировать поля:
 *  *  1. Ширина ролеты, мм (величина в милиметрах)
 *  *  2. Высота ролеты, мм (величина в милиметрах)
 *  *  3 .Накладной монтаж (1 - понадобиттся, 0 - не понадобится)
 *  *  4. Площадь, кв.м.
 *  *  5. Радиомодуль (1 - понадобиттся, 0 - не понадобится)
 *  *  6. Аварийная разблокировка (1 - понадобиттся, 0 - не понадобится)
 *  *  7. Пульт (Количество пультов)
 */

public class RolletBuilder implements IRolletBuilder{

    private int width;                // ширина
    private int height;               // высота
    private int installation;     //Накладной монтаж
    private int area;                 // площадь
    private boolean radioModule;      // Радиомодуль
    private boolean emergencyUnlock;  // Аварийная разблокировка
    private int controller;           // пульт управления

    public RolletBuilder(int width, int height, int installation, boolean radioModule, boolean emergencyUnlock, int controller) {

        this.width = width;
        this.height = height;
        this.installation = installation;
        this.radioModule = radioModule;
        this.emergencyUnlock = emergencyUnlock;
        this.controller = controller;
    }

    @Override
    public double getArea() {
        return ((int) width / 1000 * height / 1000 + width / 1000 * height / 1000 * installation * 0.3);
    }

    @Override
    public int priceForOneSquareMeter() {
        // Если площать больше 7 то
        if(area > 7) {
            return (int)getArea();
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
    public int totalPrice() {
        return priceForOneSquareMeter() + productPrice() + installationPrice();
    }
}