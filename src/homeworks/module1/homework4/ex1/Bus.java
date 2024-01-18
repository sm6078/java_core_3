package homeworks.module1.homework4.ex1;

public class Bus extends Car {
    private int maxPassenger;

    public Bus(boolean isClean, double width, double height, double length, int maxPassenger) {
        super(isClean, width, height, length);
        this.maxPassenger = maxPassenger;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }
}
