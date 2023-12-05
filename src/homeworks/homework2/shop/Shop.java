package homeworks.homework2.shop;

public class Shop {
    private final Worker[] workers;

    public Shop(Worker... workers) {
        this.workers = workers;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void printWorkers() {
        System.out.println("Список работников магазина:");
        for (Worker worker : workers) {
            System.out.printf(String.format("Имя работника: %s; Возраст: %s лет; пол: %s;%s", worker.getName(), worker.getAge(),
                                                            (worker.isMale() ? "мужской" : "женский"), System.lineSeparator()));
            System.out.println("Список вещей:");
            if (worker.getSetOfThings().length > 0) {
                for (Item item : worker.getSetOfThings()) {
                    System.out.printf("- %s, %s грамм;%s", item.getName(), item.getWeight(), System.lineSeparator());
                }
            } else {
                System.out.println("Вещи отсутсвуют");
            }
            System.out.println("------------------------------------");
        }
        System.out.println("========================================");
        System.out.println();
    }
}
