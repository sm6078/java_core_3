package homeworks.homework3.ex1;

public abstract class Conifers extends Tree {

    protected boolean typeNeedleLarge;

    public Conifers(int age, boolean typeNeedleLarge) {
        super(age);
        this.typeNeedleLarge = typeNeedleLarge;
    }
}
