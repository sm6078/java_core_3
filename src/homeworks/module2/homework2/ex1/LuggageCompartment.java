package homeworks.module2.homework2.ex1;

import java.util.LinkedList;
import java.util.Queue;

public class LuggageCompartment {
    private final Queue<Suitcase> suitcases = new LinkedList<>();
    private final Worker[] workers;
    private static final int COUNT_SUITCASE_IN_FLIGHT = 20;

    public LuggageCompartment(Worker... workers) {
        this.workers = workers;
    }

    public void unload() {
        int count = 0;
        while (!suitcases.isEmpty()) {
            workers[count++ % workers.length].quitScreaming(suitcases);
        }
    }

    public void arrivalPlane(String flightNumber) {
        for (int i = 0; i < COUNT_SUITCASE_IN_FLIGHT; i++) {
            suitcases.add(new Suitcase(flightNumber));
        }
    }


}
