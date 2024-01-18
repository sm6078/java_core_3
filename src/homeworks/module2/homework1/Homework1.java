package homeworks.module2.homework1;

import homeworks.module2.homework1.ex1.Animal;
import homeworks.module2.homework1.ex1.Dog;
import homeworks.module2.homework1.ex1.Tiger;
import homeworks.module2.homework1.ex1.Zoo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework1 {
    public static void main(String[] args) {
        //Задание №1 Зоопарк
        //Создать три вида животных: Тигр - умеет рычать, Собака - умеет лаять,
        // Птица - умеет летать.
        //Создать зоопарк, который может хранить в себе трех животных.
        //Сделать так, чтобы при получении животного,
        // мы могли воспользоваться специфичным для него действием.
        //Без дженериков задание принято не будет.
        //
        System.out.println("Task1:");
        ex1();
        System.out.println("-----");

        //Задание №2
        //Создать два List с числами
        //Первый List: 5,2,4
        //Второй List: 7,10
        //Создать финальный лист и заполнить
        // его данными из первого и второго листа, не используя for each.
        //Удалить 3 элемент в финальном листе. Вывести на экран индекс числа 10.
        //
        System.out.println("Task2:");
        ex2();
        System.out.println("-----");

        //Задание №3 Создать волшебный склад.
        //Создать класс Item - с единственным атрибутом - имя вещи.
        //Склад принимает в себя вещи. У склада нет ограничений в хранении.
        //Склад умеет принимать в себя список вещей и хранить их с уже существующими вещами.
        //В складе должен быть метод: получить все вещи.
        // Данный метод вернет список, в котором будет только каждая четная вещь из склада.
        //В складе должен быть метод: получить вещь по индексу. Данная вещь пропадает из склада.
        //Склад умеет удалять все вещи, кроме последней.
        //ex3();
    }

    public static void ex1() {
        Dog dog = new Dog();
        Animal.Bird bird = new Animal.Bird();
        Tiger tiger = new Tiger();

        Zoo<Animal.Bird, Dog, Tiger> zoo = new Zoo<>(bird, dog, tiger);
        zoo.getAnimalTwo().barks();
        zoo.getAnimalOne().fly();
        zoo.getAnimalThree().growls();
    }

    public static void ex2() {
        List<Integer> listOne = Arrays.asList(5, 2, 4);
        List<Integer> listTwo = List.of(7, 10);
        List<Integer> finalList = new ArrayList<>(listOne);
        finalList.addAll(listTwo);
        finalList.remove(2);
        System.out.printf("Индекс числа 10: %d%n", finalList.indexOf(10));
    }
}
