package homeworks.homework2.office;

public class Security {
    private String name;

    public Security(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void asks() {
        System.out.println("Выдайте мне аванс");
    }
}
