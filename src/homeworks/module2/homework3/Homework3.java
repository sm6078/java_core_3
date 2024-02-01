package homeworks.module2.homework3;

import homeworks.module2.homework3.ex1.Runner;
import homeworks.module2.homework3.ex2.Apple;
import homeworks.module2.homework3.ex2.Apricot;
import homeworks.module2.homework3.ex2.Garden;
import homeworks.module2.homework3.ex3.Divination;
import homeworks.module2.homework3.ex3.Human;
import homeworks.module2.homework3.ex4.Burning;
import homeworks.module2.homework3.ex4.Tree;
import homeworks.module2.homework3.ex4.Uranus;
import homeworks.module2.homework3.ex5.Animal;
import homeworks.module2.homework3.ex5.Boat;
import homeworks.module2.homework3.ex5.Ruler;
import java.util.List;

public class Homework3 {
    public static void main(String[] args) {
        //Задание №1: сортировка отзывов
        //Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
        // дата + время отзыва (LocalDateTime)
        //Создать коллекцию, которая хранит отсортированные отзывы по лайкам и дата + время отзыва.
        //Уникальность определяется на основе сортировки.
        //Создать comparator через лямбда выражение, для сортировки отзывов:
        //сначала у кого больше лайков, если лайки совпадают, то сначала идут более новые отзывы

        //Пример, отсортированный :
        //          (id, текст, кол-во лайков, дата+время)
        //отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
        //отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
        //отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37
        System.out.println("Task 1");
        ex1();
        System.out.println("-----");
        System.out.println();


        //Задание №2: Сад
        //Создать два фрукта: яблоко, абрикос. (Без полей)
        //Создать функциональный интерфейс сад, который умеет выращивать фрукты.
        //Метод ничего не принимает.
        //Создать с помощью лямбд выражений 2 фермы: яблочная, абрикосовая.
        //Яблочная ферма должна отдавать яблоки(не фрукты!), абрикосовая абрикосы(не фрукты!).
        System.out.println("Task 2");
        ex2();
        System.out.println("-----");
        System.out.println();

        //Задание №3: Поиск пары с помощью гадания
        //Создать функциональный гадание, который на вход принимает аргумент любого типа,
        //на выход возвращает да/нет.
        //Создать с помощью лямбд выражений:
        //ромашку: принимает имя, возвращает да если в имени четное кол-во букв, нет если нечетное
        //бабку гадалку: принимает Человека(возраст,рост),
        //возвращает да - если возраст + рост больше 210, нет - если меньше или равно
        System.out.println("Task 3");
        ex3();
        System.out.println("-----");
        System.out.println();

        //Задание №4: Гори ясно!
        //Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент
        //любого типа.
        //Создать с помощью лямбд выражений:
        //атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
        //костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!
        System.out.println("Task4:");
        ex4();
        System.out.println("-----");
        System.out.println();

        //Задание №5: универсальная линейка
        //Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
        //Создать с помощью лямбд выражений:
        //Измеритель лодок: на вход лодка(длина), возвращает длину лодки
        //Измеритель животных: на вход животное(длина тела, длина хвоста),
        //возвращает сумму длин тела и хвоста
        System.out.println("Task5:");
        ex5();
        System.out.println("-----");
        System.out.println();
    }

    private static void ex1() {
        Runner.run();
    }

    private static void ex2() {
        Garden<Apple> appleFarm = ()
                -> List.of(new Apple(), new Apple(), new Apple(), new Apple());
        System.out.println("Количество яблок на яблочной ферме: "
                + appleFarm.growingFruit().size());

        Garden<Apricot> apricotFarm = ()
                -> List.of(new Apricot(), new Apricot(), new Apricot(),
                    new Apricot(), new Apricot(), new Apricot());
        System.out.println("Количество абрикос на абрикосовой ферме: "
                + apricotFarm.growingFruit().size());
    }

    private static void ex3() {
        Divination<String> divination1 = name -> name.length() % 2 == 0;
        System.out.println(respFormat(divination1.check("test1")));
        System.out.println(respFormat(divination1.check("testik02")));

        Divination<Human> grandmaFortuneTeller = human -> human.getAge() + human.getHeight() > 210;
        System.out.println(respFormat(grandmaFortuneTeller.check(new Human(25, 185))));
        System.out.println(respFormat(grandmaFortuneTeller.check(new Human(20, 199))));
    }

    private static String respFormat(boolean resp) {
        return resp ? "Да" : "Нет";
    }

    private static void ex4() {
        Burning<Uranus> reactor = uranus -> {
            System.out.println("зеленый свет вокруг!");
        };
        System.out.println("Принимает уран:");
        reactor.action(new Uranus());

        Burning<Tree> bonfire = tree -> {
            System.out.println("желто-красный свет вокруг!");
        };
        System.out.println("Принимает дерево:");
        bonfire.action(new Tree());
    }

    private static void ex5() {
        Ruler<Boat> boatRuler = boat -> boat.getLength();
        System.out.println("Длина лодки: " + boatRuler.calculate(new Boat(735)) + " см");

        Ruler<Animal> animalRuler = animal -> animal.getLengthBody() + animal.getLengthTail();
        System.out.println("Длина животного с хвостом: "
                + animalRuler.calculate(new Animal(135, 34)) + " см");
    }
}
