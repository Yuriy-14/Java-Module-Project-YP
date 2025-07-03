import java.util.ArrayList;
import java.util.List;

public class Race {
    List<Car>cars = new ArrayList<>(); // Список автомобилей

    Car leader;                //Текущий лидер гонки.

    void addCar(Car car) {        //Добавляем автомоьбиль в гонку
        cars.add(car); // Добавляем в список участиноков
        if (leader == null || car.getSpeed() > leader.getSpeed()) { // Если лидера ещё нет или скорость авто быстрее текущего лидера
            leader = car; // этот авто становится новым лидером
        }
    }
    Car getLeader(){ //Показываем текущего лидера
return leader;
    }

}
