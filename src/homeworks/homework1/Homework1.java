package homeworks.homework1;

public class Homework1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        //Дана строка
        //Необходимо
        //1. убрать лишние пробелы,
        //2. перевести текст в верхний регистр
        //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
        // Если содержит "ов " то печатаем на экран: Уважаемый {name}
        // В иных случаях печатаем на экран: Неизвестное лицо {name}
        String name = "     ПЕтРов Олег Иванович     ";
        String result = name.trim().toUpperCase();
        if (result.contains("ОВА")) {
            result = "Уважаемая " + result;
        } else if (result.contains("ОВ")) {
            result = "Уважаемый " + result;
        } else {
            result = "Неизвестное лицо " + result;
        }
        System.out.println(result);
    }

    public static void ex2() {
        //У нас есть машина. В данной машине есть есть перечень проверок, перед запуском
        //Количество топлива
        double fuel = 10;
        //Проверка двигателя
        boolean isEngineWork = true;
        //Проверка отсутствия ошибок (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса все работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (
                fuel >= 10 && isEngineWork && !hasErrors && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
        ) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }
    }

    public static void ex3() {
        //Работа на самостоятельное изучение методов.
        //Заменить в строке все 'this is' на 'those are', получить индекс (число) второй буквы 'o' в строке
        //Распечатать полученный индекс
        String simply = "this is simply. This is my favorite song.";
        String result = simply.toLowerCase().replaceAll("this is", "Those are");
        System.out.println(result);
        System.out.println("Индекс второй буквы 'о': " + result.indexOf('o', result.indexOf('o') + 1));
    }

    public static void ex4() {
        //Компания Рога и Копыта производит мясные продукты.
        //Перечень производимых товаров :
        //Колбаса - стоимость 800 руб,
        //себестоимость при производстве меньше 1000 кг - 412руб,
        //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
        //себестоимость при производстве от 2000кг - 404 руб

        //Ветчина - стоимость 350 руб
        //себестоимость при производстве - 275 руб

        //Шейка - стоимость 500 руб
        //себестоимость при производстве меньше 500кг - 311 руб
        //себестоимость при производстве больше или равно 500кг - 299 руб

        //Финансовые показатели
        //Доход компании считается как умножение стоимости на количество проданных кг
        //Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
        //Прибыль до налогов считается как: доход - расход
        //Налоги считаются так:
        // прибыль до налогов больше 2_000_000 (не включительно), облагается ставкой 13%
        // прибыль до налогов от 1_000_001 (включительно) до 2_000_000 (включительно), облагается ставкой 10%
        // прибыль до налогов меньше или равно 1_000_000, облагается ставкой 8%
        //пример расчета налогов для прибыли до налогов 2_500_000:
        //1_000_000 - налог 80_000 - по ставке 8%
        //999_999 - налог 99_999.9 - по ставке 10%
        //500_000 - 65_000 - по ставке 13%
        //Итоговый налог: 80_000 + 100_000 + 65_000 = 249_999.9
        //Прибыль после налогов: прибыль до налогов - налог.

        //Необходимо создать универсальную систему расчетов прибыли после налогов,
        //Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании
        //Узнать прибыль после налогов, при продаже:
        //Колбасы 2000кг
        //Ветчины 8511кг
        //Шейки 6988кг

        int globalResult = 0;
        int totalExpenditure = calculateExpenditureSausage(2000) + calculateExpenditureHam(8511)
                + calculateExpenditureNeck(6988) + 1_000_000;
        int totalProfit = 2000 * 800 + 8511 * 350 + 6988 * 500;
        int profitBeforeTax = totalProfit - totalExpenditure;
        if (profitBeforeTax > 2_000_000) {
            globalResult = profitBeforeTax - profitBeforeTax * 13 / 100;
        } else if (profitBeforeTax > 1_000_000) {
            globalResult = profitBeforeTax - profitBeforeTax * 10 / 100;
        } else {
            globalResult = profitBeforeTax - profitBeforeTax * 8 / 100;
        }

        System.out.println("Прибыль после налогов: " + globalResult);
    }

    private static int calculateExpenditureSausage(int weight) {
        int result = 0;
        if (weight < 1000) {
            result = weight * 412;

        } else if (weight < 2000) {
            result = weight * 408;
        } else {
            result = weight * 404;
        }
        return result;
    }

    private static int calculateExpenditureHam(int weight) {
        return weight * 275;
    }

    private static int calculateExpenditureNeck(int weight) {
        int result = 0;
        if (weight < 500) {
            result = weight * 311;
        } else {
            result = weight * 299;
        }
        return result;
    }


}
