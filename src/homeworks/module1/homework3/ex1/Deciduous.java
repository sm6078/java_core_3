package homeworks.module1.homework3.ex1;

public abstract class Deciduous extends Tree {
    protected boolean isLeavesNow;

    public Deciduous(int age, boolean isLeavesNow) {
        super(age);
        this.isLeavesNow = isLeavesNow;
    }

    public void fall() {
        System.out.println("Листья пропадают с дерева");
        isLeavesNow = false;
    }

    public void blooms() {
        System.out.println("Листья появляются");
        isLeavesNow = true;
    }
}
