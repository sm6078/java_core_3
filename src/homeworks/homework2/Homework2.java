package homeworks.homework2;

import homeworks.homework2.shop.Runner;
import java.util.Arrays;
import java.util.Random;

public class Homework2 {

    public static void main(String[] args) {
        System.out.println("ex1:");
        ex1();
        System.out.println("=====");
        System.out.println("ex2:");
        ex2();
        System.out.println("=====");
        System.out.println("ex3:");
        ex3();
        System.out.println("=====");
        System.out.println("ex4:");
        ex4();
        System.out.println("=====");
        System.out.println("ex5:");
        ex5();
        System.out.println("=====");
    }

    public static void ex1() {
        //Дан массив с массивом чисел внутри
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 2, 3, 4, 5, 6, 7, 8, 9, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 93, 10};
        arrayOfNumbers[2] = new int[]{1, 2, 31, 4, 5, 6, 7, 81, 9, 10};
        arrayOfNumbers[3] = new int[]{1, 2, 3, 45, 5, 6, 77, 8, 9, 10};
        arrayOfNumbers[4] = new int[]{1, 2, 3, 4, 57, 67, 7, 8, 9, 10};
        arrayOfNumbers[5] = new int[]{1, 2, 3, 4, 533, 68, 7, 8, 9, 10};
        arrayOfNumbers[6] = new int[]{1, 2, 3, 40, 5, 6, 72, 8, 9, 10};
        arrayOfNumbers[7] = new int[]{1, 2, 30, 4, 5, 6, 7, 83, 9, 10};
        arrayOfNumbers[8] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 901, 10};
        arrayOfNumbers[9] = new int[]{10, 2, 3, 4, 5, 6, 7, 8, 9, 101};

        //Посчитать сумму каждой диагонали используя цикл(ы)
        //Вывесим на экран

        //С левого верхнего угла к нижнему правому
        int leftUpToRightDownSum = getSumLeftUptoRightDown(arrayOfNumbers);

        //С левого нижнего угла к верхнему правому
        int leftDownToRightUpSum = getSumLeftDownToRightUp(arrayOfNumbers);
        System.out.println("Сумма диагонали с левого верхнего угла к нижнему правому: "
                + leftUpToRightDownSum);
        System.out.println("Сумма диагонали с левого нижнего угла к верхнему правому: "
                + leftDownToRightUpSum);


    }

    private static int getSumLeftUptoRightDown(int[][] inputArr) {
        int sum = 0;
        for (int i = 0; i < inputArr.length; i++) {
            sum += inputArr[i][i];
        }
        return sum;
    }

    private static int getSumLeftDownToRightUp(int[][] inputArr) {
        int sum = 0;
        for (int i = inputArr.length - 1; i >= 0; i--) {
            int j = inputArr.length - 1 - i;
            sum += inputArr[i][j];
        }
        return sum;
    }

    public static void ex2() {
        //Перевернуть массив(без сторонних классов), не создавая новый массив. Вывести на экран.
        //"перевернуть" - значит последние элементы становятся первыми и наоборот.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Начальный массив");
        System.out.println(Arrays.toString(numbers));
        System.out.println("=====================");
        System.out.println("Перевернутый массив");
        System.out.println(Arrays.toString(revertArr(numbers)));
    }

    private static int[] revertArr(int[] inputArr) {
        boolean finalChange = false;
        int i = 0;
        int j = inputArr.length - 1;
        while (!finalChange) {
            int temp = inputArr[i];
            inputArr[i] = inputArr[j];
            inputArr[j] = temp;
            i++;
            j--;
            if (i >= j) {
                finalChange = true;
            }
        }
        return inputArr;
    }

    public static void ex3() {
        //Дан распределитель случайных чисел
        Random random = new Random(1);
        //Получение случайного числа
        //int number = random.nextInt(1000);

        //Написать код, генерирующий случайные числа до тех пор, пока не сгенерируется 999.
        //Вывести номер попытки, с которой получилось получить случайным образом число 999.
        int numberOfAttempts = 0;
        while (true) {
            int number = random.nextInt(1000);
            numberOfAttempts++;
            if (number == 999) {
                break;
            }
        }
        System.out.println("Номер попытки, с которой получилось получить случайным образом"
                + "число 999 = " + numberOfAttempts);
    }

    public static void ex4() {
        //Создать пакет shop. Внутри пакета:
        //Создать класс Item (вещь). У вещи есть вес и наименование.
        //Создать класс Worker (работник). У работника есть: имя, возраст, пол(М/Ж), набор вещей.
        //Работник умеет хвастаться своими вещами: брать по очереди вещь, и кричать:
        //{Имя работника}: смотрите какая у меня вещь - {имя вещи}.
        //Создать класс Shop (магазин). У которого есть работники.
        //Магазин умеет печатать своих работников:
        //{Имя работника}: {возраст} лет, {мужчина или женщина}, список вещей:
        // {набор вещей работника}
        //Создать класс Runner. В классе Runner:
        //Создать 4 вещи: молот (1000гр), отвертка(50гр), тетрадь(30гр), ручка(10гр)
        //Создать 2 работников:
        //-Василий,30 лет, мужчина, обладатель молота и отвертки.
        //-Марьяна,25 лет, женщина, обладательница тетради и ручки.
        //Создать магазин с работниками выше.
        //Вызвать у магазина печать.
        //Вызвать у каждого работника магазина хвастовство
        // его вещами (достать работника из магазина).
        Runner runner = new Runner();
        runner.start();
    }

    public static void ex5() {
        //Создать пакет office.
        //Создать класс офис, в котором есть босс, менеджер, секретарь, охранник.
        //Босс обладает именем. Умеет подгонять менеджера - "{Имя менеджера}" быстрее!
        //Менеджер обладает именем. Умеет кричать - "я ничего не успеваю, помогите!".
        //Секретарь умеет просить менеджера и босса успокоится, а охранника подождать:
        //"{Имя босса} не волнуйтесь, {имя менеджера} все успеет. {имя охранника} - подождите!"
        //Охранник обладает именем. Просит выдать ему аванс.
        //В офисе есть метод рабочий день:
        //--Босс начинает подгонять менеджера
        //--Менеджер кричит
        //--Охранник просит аванс
        //--Секретарша всех успокаивает, и просит подождать
        //Создать класс Runner, в котором:
        //Создать босса (Петр Николаевич), Менеджера (Володя), охранника (Петрович)
        //Секретаря.
        //Создать офис
        //Запустить рабочий день в офисе
        homeworks.homework2.office.Runner runner2 = new homeworks.homework2.office.Runner();
        runner2.init();
    }
}
