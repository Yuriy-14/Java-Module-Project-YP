import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Создаём обьект Scanner для считывания данных с клавиатуры


        Race race = new Race();// Создаём  обьект гонки

        System.out.println("Добро пожаловать в гоночный симулятор!");
        System.out.println("Введите данные 3 автомобилей:");

        for (int i = 1; i <= 3; i++) {//Цикл для 3 автомобилей
            System.out.println("\n===Автомобиль #" + i + "===");

            System.out.println("Введите название автомобиля: ");//Запрашиваем название
            String name = scanner.nextLine();

            int speed;//Переменная для скорости

            while (true) {//Бесконечный цикл для проверки скорости
                System.out.println("Введите скорость от 0 до 250 км/ч");
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    scanner.nextLine();//Очищаем буфер


                    if (speed >= 0 && speed <= 250) {
                        break;//Выходим из скорости если скорость верная
                    } else {
                        System.out.println("Ошибка! Скорость должна быть от 0 до 250 км/ч");
                    }
                } else {
                    System.out.println("Введите целое число");
                    scanner.nextLine();//Очищаем некорректный ввод
                }
            }

            Car car = new Car(name, speed);//Создаём автомобиль
            race.addCar(car);//добавляем в гонку

            System.out.println("Автомобиль '" + name + " 'добавляем в гонку!");
        }
        scanner.close();
        //Получаем и выводим победителя.

        Car winner = race.getLeader();
        System.out.println("\n===Результаты гонки===");
        System.out.println("Победитель " + winner.getName() + "со скоростью" + winner.getSpeed() + "км/ч");
    }
}

