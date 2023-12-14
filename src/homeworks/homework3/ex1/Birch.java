package homeworks.homework3.ex1;

public final class Birch extends Deciduous {

    public Birch(int age, boolean isLeavesNow) {
        super(age, isLeavesNow);
    }

    @Override
    public void blooms() {
        super.blooms();
        System.out.println("Источает аллергены");
    }
}
