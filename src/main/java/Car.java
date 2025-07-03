public class Car { //ДАнные характеристики


    String name;//Названия автомобиля
    int speed;//Скорость автомобиля.

    public Car(String name, int speed) { // Создаём конструктор автомобиля/Чертёж/Инсрукция по созданию авто
        this.name = name; //Запоминаем название
        this.speed = speed;//Запоминаем скорость
    }

    public String getName() { //Методы действия
        return name;
    }

    public int getSpeed() {  //Методы действия
        return speed;
    }

}