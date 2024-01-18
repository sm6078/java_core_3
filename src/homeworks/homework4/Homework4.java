package homeworks.homework4;

import homeworks.homework4.ex1.Bus;
import homeworks.homework4.ex1.Car;
import homeworks.homework4.ex1.CarWash;
import homeworks.homework4.ex1.PassengerCar;
import homeworks.homework4.ex2.Airplane;
import homeworks.homework4.ex2.Duck;
import homeworks.homework4.ex2.FlyException;
import homeworks.homework4.ex3.Bird;
import homeworks.homework4.ex3.Builder;
import homeworks.homework4.ex3.Driver;
import homeworks.homework4.ex3.Human;
import homeworks.homework4.ex3.Sound;

public class Homework4 {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        ex3();

    }

    public static void ex1() {
        //Создать легковую машину (атрибуты: чистая/грязная,
        // размеры(ширина,высота,длина),наличие круиз контроля)
        //Создать автобус (атрибуты: чистый/грязный,
        // размеры(ширина,высота,длина), макс количество пассажиров)
        //Создать автомойку
        //Автомойка умеет мыть машину. Делает машину чистой. Возвращает стоимость помывки.
        //Автомойка умеет мыть машины. Делает машины чистыми.
        // Возвращает стоимость помывки за все машины.
        //Категории автомобилей:
        //если длина > 6 или высота > 2.5 метра или ширина > 2, то машина считается крупной
        //иначе считается маломерной.
        //тариф 4000 - для крупных авто.
        //тариф 2000 - для маломерных.
        //В автомойку были отправлены грязные машины мэрии:
        // 4 легковых(длина высота ширина) (5х2х1.8),
        //5 автобусов(12х3х2.3)
        //Посчитать, сколько мэрия заплатит денег за мойку машин.
        Car[] cars = {new PassengerCar(false, 5, 2, 1.8, true),
                      new PassengerCar(false, 1.8, 2, 5, false),
                      new PassengerCar(false, 1.8, 2, 5, true),
                      new PassengerCar(false, 1.8, 2, 5, false),
                      new Bus(false, 2.3, 3, 12, 99),
                      new Bus(false, 2.3, 3, 12, 77),
                      new Bus(false, 2.3, 3, 12, 11),
                      new Bus(false, 2.3, 3, 12, 120),
        };

        CarWash carWash = new CarWash();
        System.out.printf("%s: %s", "Мэрия заплатит денег за мойку машин", carWash.wash(cars));
    }

    public static void ex2() {
        //Задача №2
        //1. Создать два класса, которые умеют летать: самолет и утка.
        // Атрибут утки: isInjured (ранен),
        // атрибут самолета: countPassengers.
        //2. Создать интерфейс, который объединяет эти два класса.
        //3. Имплементировать его в двух классах
        //4. Реализовать метод летать:
        // Для утки:
        // Метод летать будет выкидывать ошибку
        // FlyException (создать такой класс), если утка подстрелена,
        // иначе печатать на экран "утка летит"
        // Для самолета:
        // Метод летать будет выкидывать ошибку FlyException,
        // если количество пассажиров меньше нуля.
        // Иначе печать "самолет летит"
        //5. Создать 1 утку не раненую, 1 утку раненую,
        // 1 самолет с 10 пассажирами, 1 самолет с -1 пассажиром.
        //6. Вызвать у них метод летать
        // Перехватить исключения: вывести на экран текст
        // Ожидание:
        // утка летит
        // Ошибка: утка ранена
        // самолет летит
        // Ошибка: пассажиров в самолете меньше 0

        Duck duckOne = new Duck(false);
        Duck duckTwo = new Duck(true);
        Airplane airplaneOne = new Airplane(10);
        Airplane airplaneTwo = new Airplane(-1);

        try {
            duckOne.fly();
            duckTwo.fly();
        } catch (FlyException e) {
            System.out.println("Ошибка. Утка подстрелена.");
        }

        try {
            airplaneOne.fly();
            airplaneTwo.fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ex3() {
        //Задача №3 - Звук вокруг
        //Человек умеет издавать звук: "Я человек." (возвращается строка и в след пунктах тоже)
        //Строитель умеет издавать звук: "Я строитель." + звук из человека
        //Водитель умеет издавать звук: "Я водитель." (имеет связь с человеком)
        //Птица умеет издавать звук: "Чирик"
        //Сделать так, чтобы они все могли быть представлены к единому типу.
        //Создать в этом методе человека, строителя, водителя и птицу. Заставить их издать звуки.
        //Изданные звуки распечатать.
        Sound[] soundProducing = {new Human(), new Builder(), new Driver(), new Bird()};
        for (Sound item : soundProducing) {
            System.out.println(item.makeSound());
        }
    }

    public static void ex4() {
        //Задача №4 (2 балла) - OneGramChat
        //Для считывания данных вам нужен new Scanner(), вызывать readLine();
        //Создать сообщение (текст, входящее/исходящее, кому/от кого)
        //Создать Пользователя(имя, пароль, список сообщений)
        //Необходимо создать класс OneGramChat, который позволяет:
        //Создать пользователя. Имя и пароль вводится из консоли.
        // Список сообщений пустой (размерность 100).
        //
        //Войти пользователю. Ввести имя и пароль. Если есть такой пользователь,
        //он становится текущим пользователем в системе.
        //Если нет пользователя, то будет ошибка.
        //
        //Выйти пользователю, текущий пользователь становится пустым.
        //
        //Написать письмо: Вводится имя пользователя, вводится текст письма.
        //У текущего пользователя записывается в список сообщений как исходящий
        //У пользователя которому пишем, записывается в список сообщений как входящее
        //если такого пользователя нет, то возникает ошибка: такого пользователя нет
        //если текущего пользователя нет, то возникает ошибка: вы не авторизованы
        //
        //Прочитать письма:
        //Вывести все письма текущего пользователя.
        //Формат входящего: "письмо от {имя пользователя}: {текст сообщения}"
        //Формат исходящего: "письмо к {имя пользователя}: {текст сообщения}"
        //если текущего пользователя нет, то возникает ошибка: вы не авторизованы
        //
        //Функция запуска чата:
        //чат постоянно ожидает команд из консоли:
        //"войти" - запуск функции "войти пользователю"
        //"новый" - запуск функции "создать пользователя"
        //"выйти" - запуск функции "выйти пользователю"
        //"написать" - запуск функции "написать письмо"
        //"прочитать" - запуск функции "прочитать письмо"
        //"exit" - окончание работы программы
        //Ошибки в результате работы команд должны быть обработаны,
        // и не должны заканчивать работу программы.
    }
}