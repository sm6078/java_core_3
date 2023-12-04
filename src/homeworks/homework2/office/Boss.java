package homeworks.homework2.office;

public class Boss {
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void pushManager(Manager manager) {
        System.out.println(manager.getName() + " быстрее!");
    }
}
