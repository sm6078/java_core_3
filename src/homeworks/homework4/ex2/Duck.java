package homeworks.homework4.ex2;

public class Duck implements Flying {

    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException();
        }
        System.out.println("Утка летит.");
    }
}
