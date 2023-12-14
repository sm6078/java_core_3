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
            String gender = worker.isMale() ? "мужской" : "женский";
            System.out.printf(String.format("Имя работника: %s; Возраст: %s лет; пол: %s;\n",
                    worker.getName(), worker.getAge(),
                    gender));
            System.out.println("Список вещей:");
            if (worker.getSetOfThings().length > 0) {
                for (Item item : worker.getSetOfThings()) {
                    System.out.printf("- %s, %s грамм;\n",
                            item.getName(), item.getWeight());
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
