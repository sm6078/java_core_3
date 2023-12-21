package homeworks.homework4.ex1;

public class PassengerCar extends Car {
    private boolean isCruiseControl;

    public PassengerCar(boolean isClean, double width, double height, double length,
                        boolean isCruiseControl) {
        super(isClean, width, height, length);
        this.isCruiseControl = isCruiseControl;
    }
}
