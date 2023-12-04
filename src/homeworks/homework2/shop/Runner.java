package homeworks.homework2.shop;

public class Runner {

    public void start() {
        Shop shop = creator();
        shop.printWorkers();

        Worker[] workers = shop.getWorkers();
        if (workers.length > 0) {
            for (Worker worker : workers) {
                worker.brag();
            }
        } else {
            System.out.println("В магазине отсутствуют работники.");
        }
    }

    private Shop creator() {
        Item itemOne = new Item("молот", 1000);
        Item itemTwo = new Item("отвертка", 50);
        Item itemThree = new Item("тетрадь", 30);
        Item itemFour = new Item("ручка", 10);

        Worker workerOne = new Worker("Василий", 30, true, new Item[]{itemOne, itemTwo});
        Worker workerTwo = new Worker("Maрьяна", 25, false, new Item[]{itemThree, itemFour});

        return new Shop(workerOne, workerTwo);
    }
}
