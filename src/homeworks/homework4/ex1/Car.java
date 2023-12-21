package homeworks.homework4.ex1;

public abstract class Car {
    protected boolean isClean;
    protected final double width;
    protected final double height;
    protected final double length;

    protected Car(boolean isClean, double width, double height, double length) {
        this.isClean = isClean;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    protected void setClean(boolean clean) {
        isClean = clean;
    }
}
