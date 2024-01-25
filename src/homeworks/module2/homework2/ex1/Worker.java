package homeworks.module2.homework2.ex1;

import java.util.List;
import java.util.Queue;

public class Worker {

    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    public void quitScreaming(Queue<Suitcase> suitcaseQueue) {
        System.out.printf("%s: %s <%s>\n", name, "Мужики, кидаю чемодан", suitcaseQueue.poll());
    }
}
