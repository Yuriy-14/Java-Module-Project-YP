public class Car {

    String name;//Названия автомобиля
    int speed;//Скорость автомобиля

    public Car(String name, int speed){ // Создаём конструктор автомобиля/Чертёж
this.name = name; //Запоминаем название
this.speed = speed;//Запоминаем скорость
    }
    public String getName(){
        return name;
    }
    public int getSpeed(){
        return speed;
    }

}
