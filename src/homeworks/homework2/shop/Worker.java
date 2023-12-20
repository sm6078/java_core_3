package homeworks.homework2.shop;

public class Worker {
    private final String name;
    private final int age;
    private final boolean male;
    private final Item[] setOfThings;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }

    public Item[] getSetOfThings() {
        return setOfThings;
    }

    public Worker(String name, int age, boolean male, Item[] setOfThings) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.setOfThings = setOfThings;
    }

    public void brag() {
        System.out.println(this.name + ":");
        for (Item item : setOfThings) {
            System.out.printf("- %s - %s%n", "смотрите какая у меня вещь", item.getName());
        }
        System.out.println("------------------------------------");
    }
}
